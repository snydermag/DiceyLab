import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Bins {

    private int lowerBound;
    private int higherBound;

    public Map<Integer, Integer> bins = new TreeMap<>();

    // Constructor
    public Bins(int lower, int higher){
        lowerBound = lower;
        higherBound = higher;

        for (int i = lower; i <= higher; i++){
            bins.put(i, 0);
        }
    }

    public int getBin(int numBin){
        return bins.get(numBin);
    }

    public void incrementBin(int numBin){
        int newValue = bins.get(numBin);

        newValue += 1;

        bins.replace(numBin, newValue);

    }


}
