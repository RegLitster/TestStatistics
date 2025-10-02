package com.pluralsight;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        int[] testScore = {10,16,76,23,65,88,34,64,53};
        int totalSum =0;
        int totalLength = testScore.length;
        int max = testScore[0];
        int min = testScore[0];

        for(int i = 0; i < testScore.length; i++){
            totalSum+=testScore[i];
            max = Math.max(max,testScore[i]);
            min = Math.min(min,testScore[i]);
        }
        int average = totalSum/totalLength;
        System.out.println("Average Score: "+average);
        System.out.println("Maximum Score: "+max);
        System.out.println("Minimum Score: "+min);

        Arrays.sort(testScore);
        int median = testScore[testScore.length/2];
        System.out.println("Median Score: "+median);



    }
}
