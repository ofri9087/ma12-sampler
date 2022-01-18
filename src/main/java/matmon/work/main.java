package matmon.work;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

public class main {
    public static void main(String[] args) {
        HealthCareInfoProvider heakth = new HealthCareInfoProvider();

        try {
            PersonInsured person = heakth.fetchInfo(878746593,2);
        } catch (InvalidIdException e) {
            e.printStackTrace();
        }

    }
}
