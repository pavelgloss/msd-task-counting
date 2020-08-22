package cz.pavelgloss.homeworks.msd;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldCountFromMaxToMin() {
        String expected = "100 Agile\n" +
                "99 Software\n" +
                "96 Software\n" +
                "95 Agile\n" +
                "93 Software\n" +
                "90 Testing\n" +
                "87 Software\n" +
                "85 Agile\n" +
                "84 Software\n" +
                "81 Software\n" +
                "80 Agile\n" +
                "78 Software\n" +
                "75 Testing\n" +
                "72 Software\n" +
                "70 Agile\n" +
                "69 Software\n" +
                "66 Software\n" +
                "65 Agile\n" +
                "63 Software\n" +
                "60 Testing\n" +
                "57 Software\n" +
                "55 Agile\n" +
                "54 Software\n" +
                "51 Software\n" +
                "50 Agile\n" +
                "48 Software\n" +
                "45 Testing\n" +
                "42 Software\n" +
                "40 Agile\n" +
                "39 Software\n" +
                "36 Software\n" +
                "35 Agile\n" +
                "33 Software\n" +
                "30 Testing\n" +
                "27 Software\n" +
                "25 Agile\n" +
                "24 Software\n" +
                "21 Software\n" +
                "20 Agile\n" +
                "18 Software\n" +
                "15 Testing\n" +
                "12 Software\n" +
                "10 Agile\n" +
                "9 Software\n" +
                "6 Software\n" +
                "5 Agile\n" +
                "3 Software\n";

        Assert.assertEquals(expected, new App().countingFromMaxToMin());
    }

}
