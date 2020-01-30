/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import sun.font.TrueTypeFont;

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

        int notNullCount = 0;
        for(String ch:reversed){
            if(ch != null){
                notNullCount++;
            }
        }
        String[] reversedArray = new String[notNullCount];
        int indexCounter = 0;
        for(String st:reversed){
            if(st != null){
                reversedArray[indexCounter++] = st;
            }
        }
        return reversedArray;

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
            reversedString = reversedString + " " + splitStringArray[i];
        }
        return reversedString;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        if(s == null){
            return null;
        }
        String[] splitStringArray = splitString(s);
        if(splitStringArray.length != 3){
            return null;
        }
        String initialsName = "";
        int counter = 1;
        for(String word: splitStringArray){

            if(counter!=3){
                initialsName += word.toUpperCase().charAt(0) + ". ";
            }
            else {
                String lowerCase = word.toLowerCase();
                String UpperCase = word.toUpperCase();
                initialsName += (UpperCase.charAt(0) + lowerCase.substring(1));
            }

            counter++;
        }
        return initialsName;

    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        if(s == null){
            return null;
        }
        return s;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static int binaryToDecimal(String s) 
    {
       if(s == null){
           return 0;
       }
       char[] binaryCharArray = s.toCharArray();
       int exponent = 0;
       int sum =0;
       for(int i=binaryCharArray.length-1;i>=0;i--){
           int val =  Integer.valueOf(binaryCharArray[i]) -48;
           sum += (val * Math.pow(2,exponent));
           exponent ++;
       }
       return sum;


    }



    public static Boolean isSubstring(char[] originalArray, char[] replaceArray,int startIndex){

        for(int i=startIndex,j=0;i<=originalArray.length-1 && j<= replaceArray.length-1 ; i++,j++){
            if(originalArray[i] != replaceArray[j]){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        if (originalString ==null || findString ==null || newString ==null){
            return null;
        }

        char[] originalCharArray = originalString.toCharArray();
        char[] findCharArray = findString.toCharArray();
        char[] newCharArray = newString.toCharArray();

        String replaceString = "";

        for(int i=0; i<= originalCharArray.length-1; ){
            if(isSubstring(originalCharArray,findCharArray,i)){
                replaceString += new String(newCharArray);
                i += findCharArray.length;
            }
            else{
                replaceString+= originalCharArray[i];
                i++;
            }
        }

        return replaceString;

    }
}
