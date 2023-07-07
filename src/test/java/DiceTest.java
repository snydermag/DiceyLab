import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void getRoll() {
        Dice testDice = new Dice(1);
        boolean actual = false;
        int testVal;

        testVal = testDice.getRoll();

        if ((testVal > 0) && (testVal < 7)){
            actual = true;
        }

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void getRoll1() {
        Dice testDice = new Dice(2);
        boolean actual = false;
        int testVal;

        testVal = testDice.getRoll();

        if ((testVal > 1) && (testVal < 13)){
            actual = true;
        }

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void tossAndSum() {
        Dice testDice = new Dice(2);
        boolean actual = false;
        int testVal;

        testVal = testDice.tossAndSum();

        if ((testVal > 1) && (testVal < 13)){
            actual = true;
        }

        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void tossAndSum1() {
        Dice testDice = new Dice(2, 10);
        boolean actual = false;
        int testVal;

        testVal = testDice.tossAndSum();

        if ((testVal > 9) && (testVal < 21)){
            actual = true;
        }

        assertEquals(true, actual);
    }
}