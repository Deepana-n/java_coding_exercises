package com.techreturners.exercise003;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Exercise003Test {

    private com.techreturners.exercise003.Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new com.techreturners.exercise003.Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        assertArrayEquals(expected, ex003.iceCreamFlavours()); //assertEquals deprecated for comparing 2 objects so changed it to assertArrayEquals
    }

    @Test
    public void checkGetIceCreamCodeForIncorrectFlavour() {
        String iceCreamFlavour = "Vanila";
        int expected = -1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForVanilla(){
        String iceCreamFlavour = "Vanilla";
        int expected = 2;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }



}
