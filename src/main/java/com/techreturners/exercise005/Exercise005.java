package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {
    private static final int ALPHABET_SET = 26;

    public boolean isPangram(String input) {
        //pangram is a sentence/word using every letter of the alphabet at least once
        Set<Character> set = new HashSet<>();
        for(char c : input.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
               set.add(c);}
        }
        return set.size()==ALPHABET_SET;
    }
}
