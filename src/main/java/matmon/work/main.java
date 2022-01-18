package matmon.work;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;
import matmon.work.load.loadToJson;
import matmon.work.object.labTest.labTest;
import matmon.work.object.positiveTest.positiveLabTests;
import matmon.work.object.positiveTest.positiveTest;
import matmon.work.parser.labTestParser;
import matmon.work.read.readCVS;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> listLab = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\LabTests.csv");
        labTestParser parser = new labTestParser(listLab);
        parser.parseAll();
        List<String[]> listMADA = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\MadaReports.csv");

        positiveLabTests test = new positiveLabTests();
        ArrayList<positiveTest> tests = test.findPositiveTestDate(parser.positiveTests,listMADA);

        loadToJson<labTest> json = new loadToJson<>();

        json.loadToFile(tests);

    }
}
