package matmon.work.object.positiveTest;

import matmon.work.object.address;
import matmon.work.object.labTest.labTest;
import matmon.work.object.person;

import java.util.Date;

public class positiveTest {

    private labTest labTest;
    private Date takeDate;
    public positiveTest(labTest labTest , address address, Date takeDate) {
        this.labTest = labTest;
        person newPerson = this.labTest.getPerson();
        newPerson.setAddress(address);
        this.labTest.setPerson(newPerson);
        this.takeDate = takeDate;
    }
}
