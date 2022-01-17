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

    public test(String MDAcode, matmon.work.object.person person, String barCode,
                Date getDate, Date takeDate, Date resultDate) {
        this.MDAcode = MDAcode;
        this.person = person;
        this.barCode = barCode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public String getMDAcode() {
        return MDAcode;
    }

    public void setMDAcode(String MDAcode) {
        this.MDAcode = MDAcode;
    }

    public matmon.work.object.person getPerson() {
        return person;
    }

    public void setPerson(matmon.work.object.person person) {
        this.person = person;
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

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

}
