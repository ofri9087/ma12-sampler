package matmon.work.object;

public class ID {

    private int IDnum;
    private int type;/*ENUM!!!!*/
    //private IDtype iDtype;

    public ID(int IDnum, int type) {
        this.IDnum = IDnum;
        this.type = type;
    }

    public int getIDnum() {
        return IDnum;
    }

    public void setIDnum(int IDnum) {
        this.IDnum = IDnum;
    }

}
