package matmon.work.object.positiveTest;

import matmon.work.load.loadToXml;
import matmon.work.object.address;
import matmon.work.object.labTest.labTest;
import matmon.work.object.person;

public class positiveTest {

    private labTest labTest;

    public positiveTest(labTest labTeest , address address) {
        this.labTest = labTest;
        person newPerson = this.labTest.getPerson();
        newPerson.setAddress(address);
        this.labTest.setPerson(newPerson);
    }
}
