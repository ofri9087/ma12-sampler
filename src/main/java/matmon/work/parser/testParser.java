package matmon.work.parser;

import com.opencsv.CSVReader;
import matmon.work.object.test.*;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.io.FileReader;
import java.time.LocalDate;
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
    public test parseTest(String[] cvsLine) {
        ID id;
        address address;
        person person;
        String MDAcode;
        Date getDate,takeDate,resultDate;
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2=new SimpleDateFormat("dd/MM/yyyy");

        try {
            MDAcode =cvsLine[0];
            id = new ID(Integer.parseInt(cvsLine[1]),Integer.parseInt(cvsLine[2]));
            address = new address(cvsLine[5],cvsLine[6],Integer.parseInt(cvsLine[7]));
            person = new person(id,cvsLine[3],cvsLine[4],address);
        }
        catch (NumberFormatException e)
        {
            return null;
        }

        return new test(MDAcode,person,cvsLine[8],null),
                null,null);
    }
}
