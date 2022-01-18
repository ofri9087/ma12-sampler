package matmon.work.read;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class readCVS implements readFile {

    /**
     * read a csv file
     * @param file - the file top read
     * @return - all the lines in the file
     */
    @Override
    public List<String[]> readFile(String file) {
        List<String[]> record = null;
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            record = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return record;
    }
}
