package matmon.work.object.labTest;

import matmon.work.object.person;

import java.util.Date;

public class labTest {

    private person person;
    private Date resultDate;
    private String labCode;
    private String StickerNumber;
    private int testResults; /*ENUM!!!!*/
    private String variant;
    private testType type;


    public labTest(matmon.work.object.person person, Date resultDate,
                   String labCode, String stickerNumber,
                   int testResults, String variant, testType type) {
        this.person = person;
        this.resultDate = resultDate;
        this.labCode = labCode;
        StickerNumber = stickerNumber;
        this.testResults = testResults;
        this.variant = variant;
        this.type = type;
    }
}
