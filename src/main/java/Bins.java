import java.util.Arrays;

public class Bins {

    private int lowerBound;
    private int higherBound;

    public int[] binArray = new int[]{(higherBound - lowerBound) + 1};

    // Constructor
    Bins(int lower, int higher){
        lowerBound = lower;
        higherBound = higher;
    }

    public int getBin(int numBin){
        return binArray[numBin - 1];
    }

    public void incrementBin(){

    }



    public static void main (String[] args){
        Dice dice1 = new Dice(10);
        Dice dice2 = new Dice(10, 20);

        int example = dice1.numDice;

        Bins bin1 = new Bins(dice1.numDice, (dice1.numDice * dice1.numSides));

        System.out.println(example);

        System.out.println(dice1.tossAndSum());
        System.out.println(dice2.tossAndSum());

    }

}
