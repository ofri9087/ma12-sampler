package matmon.work.object;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@JacksonXmlRootElement(localName = "healthCare")
public class personHealth {


    @JacksonXmlProperty(localName = "careName")
    private String healthCareName;
    @JacksonXmlProperty(localName = "careID")
    private int healthCareID;

    public LocalDate joinDate;

    @JacksonXmlProperty(localName = "joinDate")
    public String getJoinDate() {
        try {
            return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(this.joinDate);
        }
        catch (NullPointerException e)
        {
            return "null";
        }
    }

    public personHealth(int IDnumber, int idType) throws InvalidIdException {

        HealthCareInfoProvider health = new HealthCareInfoProvider();

        try {
            PersonInsured person = health.fetchInfo(IDnumber,idType);
            this.healthCareName = person.getHealthCareName();
            this.healthCareID = person.getHealthCareId();
            this.joinDate = person.getJoinDate();

        } catch (InvalidIdException e) {
            e.printStackTrace();
        }

    }
}
