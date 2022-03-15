package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        DecimalFormat df = new DecimalFormat("0.00");//returns string
        return Double.valueOf(df.format(originalPrice * (100+vatRate)/100));
    }

    public String reverse(String sentence) {
        // Add your code here
        String reversedSentence = "";
        for(int i =sentence.length()-1 ; i>=0; i--){
            reversedSentence += sentence.charAt(i);
        }
        return reversedSentence;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int count = 0;
        for(User user : users){
            if(user.getType().equalsIgnoreCase("Linux")){
                count++;
            }
        }
        return count;
    }
}
