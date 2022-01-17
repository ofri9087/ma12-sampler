package matmon.work.load;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;

public class loadToJson<T> implements loadToFile{

    private final int MAX_OBJECTS = 50000;
    private int countFiles = 1;

    public void loadToFile(ArrayList<T> listOfObjects) {

        int start = 1;
        int count =1;

        while(start<listOfObjects.size())
        {
            FileWriter jsonFile = null;
            try {
                jsonFile = new FileWriter(createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }

            while(count!=MAX_OBJECTS && start<listOfObjects.size())
            {
                String output = new Gson().toJson(listOfObjects.get(start));
                try {
                    jsonFile.write(output);
                    jsonFile.write("\n");
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

                count++;
                start++;

            }
            count =0;
        }


    }

    @Override
    public File createNewFile() {
        String fileName = "jsonFile"+this.countFiles;
        this.countFiles ++;
        return new File(String.format("C:\\Users\\Ofri\\Desktop\\mada_reports\\%s.json",fileName));
    }

}
