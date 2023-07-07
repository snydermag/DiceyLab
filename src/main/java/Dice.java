import java.util.Random;

public class Dice {

    public int numDice;
    public int numSides;

    // Constructor
    Dice(int totalDice){
        numDice = totalDice;
        numSides = 6;
    }

    Dice(int totalDice, int totalSides){
        numDice = totalDice;
        numSides = totalSides;
    }

    public int getRoll(){
        Random rand = new Random();

        return (rand.nextInt(numSides) + 1);
    }

    public int tossAndSum(){
        int sum = 0;

        for (int i = 0; i < numDice; i++){
            sum += getRoll();
        }

        return sum;
    }


}
