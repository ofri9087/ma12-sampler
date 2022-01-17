package matmon.work.object.test;

import java.util.Date;

public class obtest {

    private String MDAcode;
    private int IDnum;
    private int iDtype;
    private String firstName;
    private String lastName;
    public String city;
    private String street;
    private int buildingNum;
    private String barCode;
    private Date getDate;
    private Date takeDate;
    private Date resultDate;

    public obtest(String MDAcode, int IDnum, int iDtype, String firstName, String lastName,
                  String city, String street,
                  int buildingNum, String barCode, Date getDate, Date takeDate, Date resultDate) {
        this.MDAcode = MDAcode;
        this.IDnum = IDnum;
        this.iDtype = iDtype;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNum = buildingNum;
        this.barCode = barCode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }


}
