package matmon.work.load;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import matmon.work.splitList;

public class loadToXml<T> implements loadToFile{

    private final int MAX_OBJECTS = 50000;
    private int countFiles = 1;

    @Override
    public void loadToFile(ArrayList listOfObjects) {

        splitList split = new splitList();
        List<List<T>> splitList = split.split(MAX_OBJECTS,listOfObjects);
        XmlMapper xmlMapper = new XmlMapper();

        for (List<T> list:splitList){
            try {
                xmlMapper.writeValue(createNewFile(), list);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    @Override
    public File createNewFile() {
        String fileName = "xmlFile"+this.countFiles;
        this.countFiles ++;
        return new File(String.format("C:\\Users\\Ofri\\Desktop\\mada_reports\\%s.xml",fileName));
    }

}
