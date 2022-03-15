package com.techreturners.exercise003;

import java.util.Arrays;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        //instead of using a for loop,convert array to list and then use indexOf()
        return Arrays.asList(iceCreamFlavours()).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return new String[]{"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
    }

}
