package org.example.codility.stacks.and.queues;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for(int i=0; i<A.length; i++){
            if(B[i] ==1){
                st.push(A[i]);
            }
            if(B[i] ==0){
                while( !st.isEmpty() ){
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;
                    }
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();
                    }
                }
            }
        }
        return numAlive;
    }


    /* from internet https://github.com/Mickey0521/Codility/blob/master/Fish.java
    public int solution(int[] A, int[] B) {
        if(A.length == 0)
            return 0;

        // main idea: use "stack" to store the fishes with B[i]==1
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> st = new Stack<>();
        int numAlive = A.length;

        for(int i=0; i<A.length; i++){

            // case 1; for the fish going to downstrem
            // push the fish to "stack", so we can keep them from the "last" one
            if(B[i] ==1){
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if(B[i] ==0){
                while( !st.isEmpty() ){
                    // if the downstream fish is bigger (eat the upstream fish)
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;      // the upstream fish is eaten (ending)
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }
        }

        return numAlive;
    }
     */

    /*
    public int solution(int[] A, int[] B){
        // Implement your solution here
        int onesMax = 0;
        int countZeros = 0;
        int countOnes = 0;
        for (int i = 0; i < A.length; i++) {        //4,3,2,1,5 and 0,1,0,0,0
            if(B[i] == 0 && A[i] > onesMax){        // 4,3 and 1,0
                countZeros++;                       // 1,2,3,4 and 0,0,0,1
                countOnes = 0;                      // 4,3,2,1,5,6 and 0,1,0,0,0,1
                onesMax = 0;
            } else if(B[i] == 1){
                countOnes++;
                onesMax = Math.max(onesMax, A[i]);
            }
        }
        return countOnes + countZeros;
    }
     */

    /*
    50%
    public int solution(int[] A, int[] B){ //4,3,2,1,5 and 0,1,0,0,0
                                           // 4,3 and 1,0
        int onesMax = 0;                   // 1,2,3,4 and 0,0,0,1
        int countZeros = 0;                // 4,3,2,1,5,6 and 0,1,0,0,0,1
        int countOnes = 0;
        int zerosMax = 0;
        for (int i = 0; i < A.length; i++) {
            if(onesMax > zerosMax) {
                countZeros = 0;
            }
            if(B[i] == 0 && A[i] > onesMax){
                countZeros++;
                zerosMax = Math.max(zerosMax, A[i]);
                countOnes = 0;
            } else if(B[i] == 1){
                countOnes++;
                onesMax = Math.max(onesMax, A[i]);
            }
        }
        return countOnes + countZeros;
    }
     */

    /*
    50 %
    public int solution(int[] A, int[] B){
        // Implement your solution here
        Stack<Integer> zeroStack = new Stack<>();
        Stack<Integer> oneStack = new Stack<>();
        for (int i = 0; i < A.length; i++) { //4,3,2,1,5 and 0,1,0,0,0
            if(B[i] == 0 && oneStack.isEmpty()){
                zeroStack.push(A[i]);
            } else if(B[i] == 1 && zeroStack.isEmpty()){
                oneStack.push(A[i]);
            } else if(B[i] == 0 && oneStack.peek() < A[i]){
                zeroStack.push(A[i]);
                oneStack.clear();
            } else if(B[i] == 1){
                oneStack.push(A[i]);
            }

        }
        return oneStack.size() + zeroStack.size();
    }

     */
}
