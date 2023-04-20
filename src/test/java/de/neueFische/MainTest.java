package de.neueFische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void returnName() {
        //given
        String name = "Anna";
        String expected = "Anna";
        //when
        String actual = Main.name(name);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void prüfungGrößer0() {
        //given
        int zahl = 5;

        //when
        boolean actual = Main.prüfungObGrößer0(zahl);

        //Then
        assertTrue(actual);
    }

    @Test
    void prüfungQuadrat() {
        //given
        int zahl = 2;
        int expect = 4;

        //when
        int actual = Main.quadratBerechnen(zahl);

        //Then
        assertEquals(expect, actual);
    }

    @Test
    void ausgabeZahlenwortEinstellig() {
        //given
        int zahl = 2;
        String expect = "zwei";

        //when
        String actual = Main.ausgabeZahlenwort(zahl);

        //Then
        assertEquals(expect, actual);
    }

    @Test
    void teilbarDurch3() {
        //given
        int zahl = 9;
        String expect = "#9";

        //when
        String actual = Main.zahlenTeilbar(zahl);

        //Then
        assertEquals(expect, actual);
    }

    @Test
    void teilbarDurch5() {
        //given
        int zahl = 10;
        String expect = "$10";

        //when
        String actual = Main.zahlenTeilbar(zahl);

        //Then
        assertEquals(expect, actual);
    }

    @Test
    void nichtTeilbarDurch() {
        //given
        int zahl = 7;
        String expect = "7";

        //when
        String actual = Main.zahlenTeilbar(zahl);

        //Then
        assertEquals(expect, actual);
    }
}

