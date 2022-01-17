package matmon.work.parser;

import matmon.work.object.test.test;

import java.util.ArrayList;
import java.util.List;

public abstract class parserCVS<T> implements parser {

    protected List<String[]> csvFile;

    parserCVS(List<String[]> csvFile) {
        this.csvFile = csvFile;
    }

    public abstract ArrayList<T> parseAll();

}
