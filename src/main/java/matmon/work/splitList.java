package matmon.work;

import com.google.common.*;
import com.google.common.collect.Lists;

import java.util.List;

public class splitList<T> {

    /**
     * split a list to list of subLists with chosen length
     * @param maxSizeAList - the size of list we want
     * @param listToSplit - the list we want to split
     * @return
     */
    public List<List<T>> split(int maxSizeAList,List<T> listToSplit)
    {
        List<List<T>> partitionedList = Lists.partition(listToSplit, maxSizeAList);
        return partitionedList;
    }
}
