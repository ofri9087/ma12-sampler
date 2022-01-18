package matmon.work.object;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ID")
public class ID {

    @JacksonXmlProperty(localName = "idNum")
    private int IDnum;
    @JacksonXmlProperty(localName = "idType")
    private int type;/*ENUM!!!!*/
    //private IDtype iDtype;

    public ID(int IDnum, int type) {
        this.IDnum = IDnum;
        this.type = type;
    }

    public int getIDnum() {
        return IDnum;
    }

    public int getType() {
        return type;
    }
}
