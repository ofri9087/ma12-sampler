package matmon.work.object.positiveTest;

import matmon.work.object.address;
import matmon.work.object.labTest.labTest;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class positiveLabTests {

    private static final Logger logger = LogManager.getLogger(positiveLabTests.class);

    public ArrayList<positiveTest> findPositiveTestDate(HashMap<Integer, labTest> positiveTests,
                                                        List<String[]> madaRecord)
    {
        SimpleDateFormat formatter2=new SimpleDateFormat("dd.MM.yyyy");
        address addresses = null;
        ArrayList<positiveTest> tests = new  ArrayList<positiveTest>();
        Boolean bn;
        for (String[] line:madaRecord) {
            try {
                if (positiveTests.containsKey(Integer.parseInt(line[1]))) {/*if this id is in the positive tests list*/
                    try {
                        addresses = new address(line[5], line[6], Integer.parseInt(line[7]));
                    } catch (NumberFormatException e) {/*tried configuration the headers*/
                        break;
                    }
                    positiveTest positiveTest = new positiveTest(positiveTests.get(Integer.parseInt(line[1])),
                            addresses,formatter2.parse(line[10]));/*create new positive test object with the person's address and lab test*/
                    tests.add(positiveTest);
                }
            }
            catch (NumberFormatException w)/*tried configuration the headers*/
            {}
            catch (ParseException e) {/*automated exception*/
                e.printStackTrace();
            }

        }
        return tests;
    }
}
