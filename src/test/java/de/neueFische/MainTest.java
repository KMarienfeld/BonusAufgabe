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
}