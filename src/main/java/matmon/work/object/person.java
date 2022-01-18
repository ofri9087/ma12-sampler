package matmon.work.object;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import health_care_provider.errors.InvalidIdException;
import matmon.work.load.loadToXml;

import java.util.Date;

@JacksonXmlRootElement(localName = "person")
public class person {
    @JacksonXmlProperty(localName = "id")
    private ID id;
    @JacksonXmlProperty(localName = "firstName")
    private String firstName;
    @JacksonXmlProperty(localName = "lastName")
    private String lastName;
    @JacksonXmlProperty(localName = "address")
    private address address = null;
    @JacksonXmlProperty(localName = "bDay")
    private Date birthDate =null;
    @JacksonXmlProperty(localName = "healthCare")
    private personHealth personHealth;



    public person(ID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        try {
            this.personHealth = new personHealth(this.id.getIDnum(),this.id.getType());
        } catch (InvalidIdException e) {
        }
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
