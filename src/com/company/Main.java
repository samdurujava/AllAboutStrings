package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] arrSample = {'R', 'O', 'S', 'E'};
        String strSample_1 = new String (arrSample);
        System.out.println(strSample_1);

        //String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
        //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
        //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);

        //Character at position
        String str_Sample = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        //Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
    }
}