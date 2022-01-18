package matmon.work;

import matmon.work.load.loadToJson;
import matmon.work.object.test.test;
import matmon.work.parser.testParser;
import matmon.work.read.readCVS;

import java.util.ArrayList;
import java.util.List;

public class csvToJson {
    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> list = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\MadaReports.csv");
        testParser parser = new testParser(list);
        ArrayList<test> tests = parser.parseAll();

        loadToJson<test> json = new loadToJson<>();

        json.loadToFile(tests);

    }
}
