import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void getBinTest() {
        // Given
        Bins bin1 = new Bins(2, 12);

        // When
        int expected = 0;
        int actual = bin1.getBin(2);

        // Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    void incrementBinTest() {
        // Given
        Bins bin1 = new Bins(2, 12);

        // When
        int expected = 1;
        bin1.incrementBin(2);
        int actual = bin1.getBin(2);

        // Then

        Assert.assertEquals(expected, actual);
    }
}