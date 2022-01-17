package matmon.work.load;

import java.io.File;
import java.util.ArrayList;

public interface loadToFile<T> extends loadObjects{

    //void loadToFile(ArrayList<T> listOfObjects);

    File createNewFile();
}
