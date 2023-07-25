public class Simulation {

    private int numberOfDies;

    private int numberOfTosses;

    private Bins bin;

    private Dice die;

    private int totalSum;

    public static void main (String[] args){

        Simulation sim = new Simulation(2, 1000000);

        sim.die = new Dice(sim.numberOfDies);

        sim.bin = new Bins(sim.die.numDice, (sim.die.numDice* 6));

        sim.runSimulation();

        int tempSum = 0;
        for (int i = sim.numberOfDies; i <= (sim.numberOfDies * 6); i++){
            tempSum += sim.bin.getBin(i);
        }

        sim.totalSum = tempSum;

        sim.printResults();

    }


    public Simulation(int numDies, int numTosses){
        numberOfDies = numDies;
        numberOfTosses = numTosses;
    }

    public void runSimulation(){

        for (int i = 0; i < numberOfTosses; i++){
            int roll = die.tossAndSum();
            bin.incrementBin(roll);
        }

    }

    public void printResults(){
        StringBuilder string = new StringBuilder();
        for (int i = numberOfDies; i <= (numberOfDies * 6); i++){
            double tempVal = (double) bin.getBin(i) / totalSum;
            string.append(String.format("%3d : %10d: %.2f ", i, bin.getBin(i), tempVal));
            string.append(String.format("%" + (bin.getBin(i) / 10000) + "s\n", "").replace(' ', '*'));
        }

        System.out.print(string.toString());
    }
}
