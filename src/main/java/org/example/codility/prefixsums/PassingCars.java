package org.example.codility.prefixsums;

public class PassingCars {

    public int solution(int[] A) {
        int num_east = 0; // initial
        int num_pass = 0; // initial
        for(int i=0; i<A.length; i++){
            if(A[i] ==0){ // to east
                num_east++;
            }
            if(A[i] ==1){ // to west
                num_pass = num_pass + num_east;
            }
        }
        if(num_pass > 1000000000 || num_pass < 0)
            return -1;
        else
            return num_pass;
    }
}

/*
//        int result = 0;
//        int countZeros = 0;
//        int countOnes = 0;
//        boolean isCurrentZero = false;
//        int countCurrentZeros = 0;
//        for (int i = 0; i < A.length; i++) {
//            if(A[i] == 0){
//                countZeros++;
//                result += countOnes;
//                isCurrentZero = true;
//                countCurrentZeros++;
//            } else {
//                if(isCurrentZero) {
//                    countOnes++;
//                    result += countZeros;
//                    countCurrentZeros = 0;
//                }
//            }
//            if(result > 1000000000) return -1;
//        }
//        if(countCurrentZeros != 0){
//            result = result - countOnes*countCurrentZeros; //expected 7 , actual 31.
//        }
//        return result > 1 ? result - 1 : result;
 */
