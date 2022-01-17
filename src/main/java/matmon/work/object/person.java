package matmon.work.object;

import matmon.work.object.test.address;

import java.util.Date;

public class person {
    private ID id;
    private String firstName;
    private String lastName;
    private address address = null;
    private Date birthDate =null;

    public person(ID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id.toString() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
