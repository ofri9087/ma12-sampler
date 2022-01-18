package matmon.work.parser;

import java.util.List;

public abstract class parseCrossedCSVs extends parserCSV{


    protected List<String[]> csvFile;

    protected parseCrossedCSVs(List csvFile) {
        super(csvFile);
    }
}
