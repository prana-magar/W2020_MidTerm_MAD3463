/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

/**
 *
 * @author Pritesh Patel
 */
public class C0773839Main {

    public static void main(String[] args) 
    {
        System.out.println("\n--- Reverse Words");
        String rev = LambtonStringTools.reverse("Failure will never overtake me if my determination to succeed is strong enough");
        System.out.println("Input  : Failure will never overtake me if my determination to succeed is strong enough");
        System.out.println("Output : " + rev);

        rev = LambtonStringTools.reverse(null);
        System.out.println("Input  : NULL");
        if(rev == null)
        {
            System.out.println("Function returns NULL value");
        }else {
            System.out.println("Output : " + rev);
        }
        
//        System.out.println("\n--- Init");
//        String init = LambtonStringTools.initials("pritesh kumar pAtEl");
//        System.out.println("Input  : pritesh kumar pAtEl");
//        System.out.println("Output : " + init);
//
//        System.out.println("\n--- Binary to Decimal");
//        int decimal = LambtonStringTools.binaryToDecimal("101010");
//        System.out.println("Input  : 101010");
//        System.out.println("Output : " + decimal);
//
//        System.out.println("\n--- Most Frequent");
//        String mostFrequent = LambtonStringTools.mostFrequent("pritesh kumar pAtEl");
//        System.out.println("Input  : pritesh kumar pAtEl");
//        System.out.println("Output : " + mostFrequent);
//        mostFrequent = LambtonStringTools.mostFrequent("aassrrttggg desf tersgdv");
//        System.out.println("Input  : aassrrttggg desf tersgdv");
//        System.out.println("Output : " + mostFrequent);
//
//        System.out.println("\n--- Replace SubString");
//        String newString = LambtonStringTools.replaceSubString("Lambton College in Toronto", "College", "University");
//        System.out.println("Input  : Lambton College in Toronto");
//        System.out.println("Output : " + newString);
    }
}
