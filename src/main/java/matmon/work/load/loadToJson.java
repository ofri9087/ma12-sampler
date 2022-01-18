package matmon.work.load;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.google.gson.Gson;

public class loadToJson<T> implements loadToFile{

    private final int MAX_OBJECTS = 50000;
    private final int MAX_FILE_SIZE = 2000; /*in bytes*/
    private int countFiles = 1;

    @Override
    public void loadToFile(ArrayList listOfObjects) {

        int start = 1;
        int count =1;

        while(start<listOfObjects.size()) {
            FileWriter jsonFile = null;
            File file = null;
            try {
                file = createNewFile();
                jsonFile = new FileWriter(file);
                logger.info("file created successfully");
            } catch (IOException e) {
                logger.error(e.getMessage());
            }
            long space =0;

            while (count != MAX_OBJECTS && start < listOfObjects.size() ) {
                String output = new Gson().toJson(listOfObjects.get(start));
                int length = output.getBytes(StandardCharsets.UTF_8).length;

                space = space + length;
                if (space < MAX_FILE_SIZE) {
                    try {
                        jsonFile.write(output);
                        jsonFile.write("\n");

                    } catch (IOException e) {
                        logger.error(e.getMessage());
                    }

                    count++;
                    start++;

                }
                else
                {
                    break;
                }
            }
            count =0;
            space = 0;

        }
    }



    @Override
    public File createNewFile() {
        String fileName = "jsonFile"+this.countFiles;
        this.countFiles ++;
        return new File(String.format("C:\\Users\\Ofri\\Desktop\\mada_reports\\%s.json",fileName));
    }

}
