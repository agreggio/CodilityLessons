/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author agreggio
 */
class Solution {
    
    public int BinaryGap(int N){
    
    return 0;
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
    
    public int OddOccurrencesInArray(int[] A){
        int rta = 0;
    
        return rta;
    }
    

}
