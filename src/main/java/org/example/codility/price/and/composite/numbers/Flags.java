package org.example.codility.price.and.composite.numbers;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    //todo 33% , managed only 40%
    public int solution(int[] A){
        //System.out.println("A.length=" + A.length);
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i - 1] && A[i] > A[i + 1]){
                peaks.add(i);
            }
        }
        removeUneededFromStartToEnd(peaks, 0, 1);
        removeUneededFromEndToStart(peaks, peaks.size() - 1, peaks.size() - 2);
        removeUneededFromStartToEnd(peaks, 0, 1);
        removeUneededFromEndToStart(peaks, peaks.size() - 1, peaks.size() - 2);
        return peaks.size();
    }

    private void removeUneededFromEndToStart(List<Integer> peaks, int last, int beforelast) {
        if(beforelast > 0){
            if(peaks.get(last) - peaks.get(beforelast) < peaks.size()){
                peaks.remove(beforelast);
            } else {
                last = beforelast;
            }
        }
        if(beforelast - 1 > 0) {
            removeUneededFromEndToStart(peaks, last, last - 1);
        }
    }

    private void removeUneededFromStartToEnd(List<Integer> peaks, int first, int second) {
        if(peaks.size() > second){
            if(peaks.get(second) - peaks.get(first) < peaks.size()){
                peaks.remove(second);
            } else {
                first = second;
            }
        }
        if(second + 1 < peaks.size()) {
            removeUneededFromStartToEnd(peaks, first, second + 1);
        }
    }
}

/* 40%
public int solution(int[] A){
        List<Integer> peaks = new ArrayList<>();
        int countDistance = 0;
        for (int i = 1; i < A.length - 1; i++) {
            countDistance++;
            if(A[i] > A[i - 1] && A[i] > A[i + 1]){
                peaks.add(countDistance);
                countDistance = 1;
            }
        }
        int current = 0;
        int len = peaks.size();
        int result = 1;
        for (int i = 1; i < len; i++) {
            if(current + peaks.get(i) >= len){
                result++;
                current = 0;
            } else {
                current += peaks.get(i);
            }
        }
        return !peaks.isEmpty() ? result : 0; 18/9 + 1 = 3;
    }
 */

/* 33%
public int solution(int[] A){
        //System.out.println("A.length=" + A.length);
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i - 1] && A[i] > A[i + 1]){
                peaks.add(i);
            }
        }
        removeUneeded(peaks, 0, 1);
        removeUneeded(peaks, 0, 1);
        removeUneeded(peaks, 0, 1);
        removeUneeded(peaks, 0, 1);
        return peaks.size();
    }

    private void removeUneeded(List<Integer> peaks, int first, int second) {
        if(peaks.size() > second){
            if(peaks.get(second) - peaks.get(first) < peaks.size()){
                peaks.remove(second);
            } else {
                first = second;
            }
        }
        if(second + 1 < peaks.size()) {
            removeUneeded(peaks, first, second + 1);
        }
    }
}
 */

/* 33%
public int solution(int[] A){
        int countOfPeaks = 0;
        int distance = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if(i >= 1 && A[i] > A[i - 1] && A[i] > A[i + 1] && distance > countOfPeaks){
                countOfPeaks++;
                distance--;
            } else {
                distance++;
            }
        }
        return countOfPeaks;
    }
 */

/* 26%
public int solution(int[] A){
        Map<Integer, Integer> peakDistances = new HashMap<>();
        int countDistance = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if(A[i] > A[i - 1] && A[i] > A[i + 1]){
                peakDistances.put(i, countDistance);
                countDistance = 1;
            } else {
                countDistance++;
            }
        }
        int values = 0;
        int keys = 0;
        for (Map.Entry<Integer, Integer> entry : peakDistances.entrySet()) {
            values += entry.getValue();
            keys += entry.getKey();
        }
        if(peakDistances.size() == 1) return 1;
        return values != 0 ? keys/values + 1 : 0;
    }
 */