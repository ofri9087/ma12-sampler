package matmon.work;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import matmon.work.object.test.test;
import matmon.work.parser.parserCVS;
import matmon.work.parser.readCVS;
import matmon.work.parser.testParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        readCVS file = new readCVS();
        List<String[]> list = file.readFile("C:\\Users\\Ofri\\Desktop\\work\\mada1\\src\\main\\resources\\MadaReports.csv");

        testParser parser = new testParser(list);

        ArrayList<test> tests = parser.parseAll();

        for (test T: tests) {
            System.out.println(T.toString());

        }
    }
}
