package matmon.work.parser;

import matmon.work.object.ID;
import matmon.work.object.labTest.labTest;
import matmon.work.object.labTest.testType;
import matmon.work.object.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class labTestParser extends parserCSV {

    public HashMap<Integer,labTest> positiveTests;/*map of all the positive patients with their tests and id num*/

    public labTestParser(List csvFile) {
        super(csvFile);
        this.positiveTests = new HashMap<>();
    }

    @Override
    public labTest parse(String[] csvLine) {

        ID id;
        person person;
        Date resultDate,birthDate;
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");

        try {
            id = new ID(Integer.parseInt(csvLine[0]),Integer.parseInt(csvLine[1]));
            person = new person(id,csvLine[2],csvLine[3]);
            birthDate = formatter.parse(csvLine[5]);
            person.setBirthDate(birthDate);
            resultDate = formatter.parse(csvLine[4]);

        }
        catch (NumberFormatException | ParseException e) /*return null so that we can skip the header later*/
        {
            return null;
        }
        int testResults = Integer.parseInt(csvLine[8]);
        labTest TEST = new labTest(person,resultDate,csvLine[6],csvLine[7],testResults,
                csvLine[9],testType.valueOf(csvLine[10]));
        if(testResults == 1 || testResults == 2) /*check if patient positive*/
            this.positiveTests.put(id.getIDnum(),TEST);

        return TEST;
    }
}
