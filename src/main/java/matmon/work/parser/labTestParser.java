package matmon.work.parser;

import matmon.work.object.ID;
import matmon.work.object.labTest.labTest;
import matmon.work.object.labTest.testType;
import matmon.work.object.person;
import matmon.work.object.test.address;
import matmon.work.object.test.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class labTestParser extends parserCVS{

    public labTestParser(List csvFile) {
        super(csvFile);
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
        catch (NumberFormatException | ParseException e)
        {
            return null;
        }

        return new labTest(person,resultDate,csvLine[6],csvLine[7],Integer.parseInt(csvLine[8]),
                csvLine[9],testType.valueOf(csvLine[10]));
    }
}
