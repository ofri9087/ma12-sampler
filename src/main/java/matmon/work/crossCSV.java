package matmon.work;

import matmon.work.load.loadToJson;
import matmon.work.object.labTest.labTest;
import matmon.work.object.positiveTest.positiveLabTests;
import matmon.work.object.positiveTest.positiveTest;
import matmon.work.parser.labTestParser;
import matmon.work.read.readCVS;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class crossCSV {

    private static final Logger logger = LogManager.getLogger(crossCSV.class);

    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> listLab = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\LabTests.csv");
        labTestParser parser = new labTestParser(listLab);
        parser.parseAll();
        List<String[]> listMADA = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\MadaReports.csv");

        positiveLabTests test = new positiveLabTests();
        ArrayList<positiveTest> tests = test.findPositiveTests(parser.positiveTests,listMADA);

        loadToJson<labTest> json = new loadToJson<>();

        json.loadToFile(tests);

        logger.info("try");

    }
}
