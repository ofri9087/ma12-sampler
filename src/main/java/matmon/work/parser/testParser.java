package matmon.work.parser;

import matmon.work.object.test.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testParser extends parserCVS{

    public List<String[]> csvFile;

    public testParser(List<String[]> csvFile) {
        this.csvFile = csvFile;
    }
    public ArrayList<test> parseAll()
    {
        ArrayList<test> list = new ArrayList<>();
        for (String[] line:this.csvFile){
            list.add(parseTest(line));
        }
        return list;
    }
    public test parseTest(String[] csvLine) {
        ID id;
        address address;
        person person;
        String MDAcode;
        Date getDate,takeDate,resultDate;
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2=new SimpleDateFormat("dd.MM.yyyy");

        try {
            MDAcode =csvLine[0];
            id = new ID(Integer.parseInt(csvLine[1]),Integer.parseInt(csvLine[2]));
            address = new address(csvLine[5],csvLine[6],Integer.parseInt(csvLine[7]));
            person = new person(id,csvLine[3],csvLine[4],address);
            getDate = formatter2.parse(csvLine[9]);
            takeDate = formatter2.parse(csvLine[10]);
            resultDate = formatter1.parse(csvLine[11]);
        }
        catch (NumberFormatException | ParseException e)
        {
            return null;
        }

        return new test(MDAcode,person,csvLine[8],getDate,takeDate,resultDate);
    }
}
