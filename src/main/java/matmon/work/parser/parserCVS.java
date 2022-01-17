package matmon.work.parser;

import matmon.work.object.test.test;

import java.util.ArrayList;
import java.util.List;

public abstract class parserCVS<T> implements parser {

    protected List<String[]> csvFile;

    protected parserCVS(List<String[]> csvFile) {
        this.csvFile = csvFile;
    }

    public ArrayList<T> parseAll()
    {
        ArrayList<T> list = new ArrayList<>();
        for (int i=1;i<this.csvFile.size();i++){

            list.add(parse((String[]) this.csvFile.get(i)));
        }
        return list;
    }

    public abstract T parse(String[] csvLine);

}
