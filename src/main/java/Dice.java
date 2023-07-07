import java.util.Random;

public class Dice {

    int numDice;
    int numSides;

    Dice(int totalDice){
        this.numDice = totalDice;
        this.numSides = 6;
    }

    Dice(int totalDice, int totalSides){
        this.numDice = totalDice;
        this.numSides = totalSides;
    }

    public int getRoll(){
        Random rand = new Random();

        return (rand.nextInt(this.numSides) + 1);
    }

    public int tossAndSum(){
        int sum = 0;

        for (int i = 0; i < this.numDice; i++){
            sum += getRoll();
        }

        return sum;
    }

    public static void main (String[] args){
        Dice dice1 = new Dice(10);
        Dice dice2 = new Dice(10, 20);



        System.out.println(dice1.tossAndSum());
        System.out.println(dice2.tossAndSum());

    }

}
