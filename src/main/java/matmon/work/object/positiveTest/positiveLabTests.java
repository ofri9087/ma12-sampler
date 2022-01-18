package matmon.work.object.positiveTest;

import matmon.work.object.address;
import matmon.work.object.labTest.labTest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class positiveLabTests {

    /**
     * find all positive tests by matching id with positive results and madaRecords ids
     * @param positiveTests - map of id -> labTest
     * @param madaRecord
     * @return - list of positive tests objects
     */
    public ArrayList<positiveTest> findPositiveTests(HashMap<Integer, labTest> positiveTests,
                                                        List<String[]> madaRecord)
    {
        SimpleDateFormat formatter2=new SimpleDateFormat("dd.MM.yyyy");
        ArrayList<positiveTest> tests = new  ArrayList<positiveTest>();

        for (String[] line:madaRecord) {
            try {
                tests.add(createNewPositiveTest(line,positiveTests,formatter2));
            }
            catch(NumberFormatException w)/*tried configuration the headers*/
                {
                    w.printStackTrace();
                }
        }

        return tests;
    }

    /**
     * create a single positive test
     * @param line
     * @param positiveTests
     * @param formatter2 - the format of date we want
     * @return - positive test
     */
    private positiveTest createNewPositiveTest(String[] line,HashMap<Integer, labTest> positiveTests,
                                               SimpleDateFormat formatter2)
    {
        address address = null;
        positiveTest positiveTest = null;
        try {
            address = new address(line[5], line[6], Integer.parseInt(line[7]));
        } catch (NumberFormatException e) {/*tried configuration the headers*/
            return null;
        }
        try {
            positiveTest = new positiveTest(positiveTests.get(Integer.parseInt(line[1])),
                    address,formatter2.parse(line[10]));/*create new positive test object with the person's address and lab test*/
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  positiveTest;
    }
}
