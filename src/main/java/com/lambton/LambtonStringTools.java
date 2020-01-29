/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.ArrayList;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{

    public static String[] splitString(String s){
        char[] charArray = s.toCharArray();
        String[] reversed = new String[s.length()];
        String valTillNow = "";
        int position = 0;
        int charCount = 0;
        for(char ch:charArray){

            if(ch == ' ' || charCount == charArray.length-1){
                if(charCount == charArray.length-1){
                    valTillNow +=ch;
                }
                reversed[position] = valTillNow;
                valTillNow = "";
                position ++;
                charCount ++;
                continue;
            }
            valTillNow = valTillNow + ch;
            charCount ++;
        }
        return reversed;

    }
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
        if(s == null){
            return null;
        }
        String[] splitStringArray = splitString(s);
        String reversedString = "";
        for(int i= splitStringArray.length-1; i>=0;i--){
            if(splitStringArray[i] == null){
                continue;
            }
            reversedString = reversedString + " " + splitStringArray[i];
        }
        return reversedString;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       return 0;
    }
     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
