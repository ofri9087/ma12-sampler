package matmon.work.object.test;

import java.time.Instant;
import java.time.LocalDate;


public class test {

    private String MDAcode;
    private person person;
    private String barCode;
    private Instant getDate;
    private Instant takeDate;
    private Instant resultDate;

    public test(String MDAcode, matmon.work.object.test.person person, String barCode,
                Instant getDate, Instant takeDate, Instant resultDate) {
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

    public matmon.work.object.test.person getPerson() {
        return person;
    }

    public void setPerson(matmon.work.object.test.person person) {
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
