package matmon.work.parser;

import matmon.work.crossCSV;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public abstract class parserCSV<T> implements parser {

    protected List<String[]> csvFile;

    protected parserCSV(List<String[]> csvFile) {
        this.csvFile = csvFile;
    }

    /**
     * parse all lines of a file into list of wanted objects
     * @return the list of parsed objects
     */
    public ArrayList<T> parseAll()
    {
        ArrayList<T> list = new ArrayList<>();
        for (int i=1;i<this.csvFile.size();i++){

            list.add(parse((String[]) this.csvFile.get(i)));
        }
        logger.info("success in parsing all objects");
        return list;
    }

    public abstract T parse(String[] csvLine);

}
