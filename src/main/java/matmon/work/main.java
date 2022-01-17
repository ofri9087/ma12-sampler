package matmon.work;

import matmon.work.load.loadToJson;
import matmon.work.object.labTest.labTest;
import matmon.work.object.test.test;
import matmon.work.parser.labTestParser;
import matmon.work.read.readCVS;
import matmon.work.parser.testParser;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> list = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\LabTests.csv");

        labTestParser parser = new labTestParser(list);

        ArrayList<labTest> tests = parser.parseAll();

        loadToJson load = new loadToJson();

       // load.loadToFile(tests);
    }
}
