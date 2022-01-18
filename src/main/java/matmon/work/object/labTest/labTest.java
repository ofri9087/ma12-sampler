package matmon.work.object.labTest;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import matmon.work.object.person;

import java.util.Date;

@JacksonXmlRootElement(localName = "labTest")
public class labTest {

    @JacksonXmlProperty(localName = "person")
    private person person;
    @JacksonXmlProperty(localName = "resultDate")
    private Date resultDate;
    @JacksonXmlProperty(localName = "labCode")
    private String labCode;
    @JacksonXmlProperty(localName = "StickerNumber")
    private String StickerNumber;
    @JacksonXmlProperty(localName = "testResult")
    private int testResults; /*ENUM!!!!*/
    @JacksonXmlProperty(localName = "variant")
    private String variant;
    @JacksonXmlProperty(localName = "type")
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
