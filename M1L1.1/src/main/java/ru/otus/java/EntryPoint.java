/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.otus.java;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author bazaka
 */
public class EntryPoint {
    
    public static void main(String[] args){
        
        Random genDigit =new Random();
        int[] searchArray = new int[20];
        for(int i = 0; i < searchArray.length; i++ ) 
            searchArray[i]= genDigit.nextInt(30);
        
        int firtsDigit = 5;
        int secondDigit = 108;
        
        BinarySearch obj = new BinarySearch();
        
        System.out.print("Array elements:" +Arrays.toString(searchArray));
        System.out.println("It contain " + firtsDigit+"?: " + obj.isExist(searchArray, firtsDigit));
        System.out.println("It contain " + secondDigit+"?: " + obj.isExist(searchArray, secondDigit));
    }
}
