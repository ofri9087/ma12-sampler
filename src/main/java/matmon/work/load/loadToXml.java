package matmon.work.load;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class loadToXml implements loadToFile{

    private final int MAX_OBJECTS = 50000;
    private int countFiles = 1;

    @Override
    public void loadToFile(ArrayList listOfObjects) {

        int start = 1;
        int count =1;

        while(start<listOfObjects.size())
        {
            JAXBContext contextObj = JAXBContext.newInstance(Question.class);

            Marshaller marshallerObj = contextObj.createMarshaller();
            marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        }
    }

    @Override
    public File createNewFile() {
        String fileName = "xmlFile"+this.countFiles;
        this.countFiles ++;
        return new File(String.format("C:\\Users\\Ofri\\Desktop\\mada_reports\\%s.xml",fileName));    }
}
