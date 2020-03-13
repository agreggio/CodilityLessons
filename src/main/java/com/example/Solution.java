/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author agreggio
 */
class Solution {

    public int BinaryGap(int N) {
        String Aux = Integer.toBinaryString(N);
        int count = 0;
        Aux = Aux.replace("1", "11");

        Pattern pattern = Pattern.compile("(1{1}0{1,}1{1})");
        Matcher matcher = pattern.matcher(Aux);

        while (matcher.find()) {
            if (count < ((matcher.group().length() -2))) {
                count = matcher.group().length() - 2;
            }
    
        }
   
        return count;
    }

    public int[] CyclicRotation(int[] A, int K) {

        if (A == null || A.length == 0) {
            return A;
        } else {
            while (K > 0) {
                int Aux = A[(A.length - 1)];
                for (int i = (A.length - 1); i >= 1; i--) {
                    A[i] = A[i - 1];
                }
                A[0] = Aux;
                K--;
            }

            return A;

        }

    }

    public int OddOccurrencesInArray(int[] A) {
        int rta = 0;

        return rta;
    }

}
