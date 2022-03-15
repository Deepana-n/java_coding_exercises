package com.techreturners.exercise003;

import java.util.Arrays;
import java.util.List;


public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        //instead of using a for loop,convert array to list and then use indexOf()
        List<String> list = Arrays.asList(iceCreamFlavours());
        return list.contains(iceCreamFlavour) ? list.indexOf(iceCreamFlavour) : -1;
    }

    String[] iceCreamFlavours() {
        return new String[]{"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};
    }

}
