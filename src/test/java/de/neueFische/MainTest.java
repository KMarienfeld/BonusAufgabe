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
    void
}