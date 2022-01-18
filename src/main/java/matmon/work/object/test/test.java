package matmon.work.object.test;

import matmon.work.object.person;

import java.util.Date;


public class test {

    private String MDAcode;
    private person person;
    private String barCode;
    private Date getDate;
    private Date takeDate;
    private Date resultDate;

    public test(String MDAcode, person person, String barCode,
                Date getDate, Date takeDate, Date resultDate) {
        this.MDAcode = MDAcode;
        this.person = person;
        this.barCode = barCode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }


    @Override
    public String toString() {
        return "test{" +
                "MDAcode='" + MDAcode + '\'' +
                ", person=" + person.toString() +
                ", barCode='" + barCode + '\'' +
                ", getDate=" + getDate.toString() +
                ", takeDate=" + takeDate.toString() +
                ", resultDate=" + resultDate.toString() +
                '}';
    }


}
