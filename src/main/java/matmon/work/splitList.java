package matmon.work;

import com.google.common.*;
import com.google.common.collect.Lists;

import java.util.List;

public class splitList<T> {

    public List<List<T>> split(int maxSizeAList,List<T> listToSplit)
    {
        List<List<T>> partitionedList = Lists.partition(listToSplit, maxSizeAList);
        return partitionedList;
    }
}
