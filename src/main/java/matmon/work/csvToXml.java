package matmon.work;

import matmon.work.load.loadToJson;
import matmon.work.object.labTest.labTest;
import matmon.work.parser.labTestParser;
import matmon.work.read.readCVS;

import java.util.ArrayList;
import java.util.List;

public class csvToXml {

    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> list = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\LabTests.csv");
        labTestParser parser = new labTestParser(list);
        ArrayList<labTest> tests = parser.parseAll();

        loadToJson load = new loadToJson();

        load.loadToFile(tests);

    }
}
