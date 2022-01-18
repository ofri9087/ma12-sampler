package matmon.work.object.positiveTest;

import matmon.work.object.address;
import matmon.work.object.labTest.labTest;
import matmon.work.object.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class positiveLabTests {

    public ArrayList<positiveTest> findPositiveTestDate(HashMap<Integer, labTest> positiveTests,
                                                        List<String[]> madaRecord)
    {
        address addresses = null;
        ArrayList<positiveTest> tests = new  ArrayList<positiveTest>();
        Boolean bn;
        for (String[] line:madaRecord) {
            try {
                bn = positiveTests.containsKey(Integer.parseInt(line[1]));
                if (bn) {/*if this id is in the positive tests list*/
                    try {
                        addresses = new address(line[5], line[6], Integer.parseInt(line[7]));
                    } catch (NumberFormatException e) {
                        break;
                    } catch (NullPointerException e) {
                        break;
                    }
                    positiveTest positiveTest = new positiveTest(positiveTests.get(Integer.parseInt(line[1])), addresses); /*create new positive test object with the
                 person's address and lab test*/
                    tests.add(positiveTest);
                }
            }
            catch (NumberFormatException w)
            {}

        }
        return tests;
    }
}
