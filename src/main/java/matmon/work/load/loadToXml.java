package matmon.work.load;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.lang3.*;
import matmon.work.splitList;

public class loadToXml<T> implements loadToFile{

    private final int MAX_OBJECTS = 50000;
    private final int MAX_FILE_SIZE = 2000000000; /*in bytes*/
    private int countFiles = 1;
    private long currentSize = 0;

    /**
     * this load to xml function works great without size limitation
     * @param listOfObjects
     */
    @Override
    public void loadToFile(ArrayList listOfObjects) {

        splitList split = new splitList();
        List<List<T>> splitList = split.split(MAX_OBJECTS,listOfObjects);
        XmlMapper xmlMapper = new XmlMapper();

        for (List<T> list:splitList){
            try {
                File file = createNewFile();
                xmlMapper.writeValue(file, list);

            } catch (IOException e) {
                logger.error(e.getMessage());
            }


        }
    }

    public void loadToFiles(ArrayList listOfObjects) {

        int start = 1;
        int count =1;
        XmlMapper xmlMapper = new XmlMapper();

        while(start<listOfObjects.size()) {
            File file = createNewFile();
            logger.info("file created successfully");

            while (count != MAX_OBJECTS && start < listOfObjects.size() ) {

                if (file.getTotalSpace() - file.getFreeSpace() < MAX_FILE_SIZE) {
                    writeObjectToFile(file, xmlMapper, (T) listOfObjects.get(start));
                    count++;
                    start++;

                } else {
                    break;

                }
            }
            count =0;

        }
    }

    /**
     * writes a spesific object to xml file
     * @param file - the wwanted file
     * @param xmlMapper
     * @param object - the object
     */
    public void writeObjectToFile(File file,XmlMapper xmlMapper,T object)
    {

        try {
            xmlMapper.writeValue(file, object);
            xmlMapper.writeValue(file, "\n");
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

    }

    @Override
    public File createNewFile() {
        String fileName = "xmlFile"+this.countFiles;
        this.countFiles ++;
        return new File(String.format("C:\\Users\\Ofri\\Desktop\\mada_reports\\%s.xml",fileName));
    }

}
