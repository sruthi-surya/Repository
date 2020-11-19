package com.stringmanipulation;


public class Mergetwosortedarray {
	
    static void merge(int array1[], int array2[], int n, int m) {
        int len = n + m;
        int temp;
        int[] mergeSorted = new int[len];

        for (int i = 0; i < n; i++) {
        	mergeSorted[i] = array1[i];
        }

        for (int i = 0; i < m; i++) {
        	mergeSorted[i + n] = array2[i];
        }

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (mergeSorted[j] > mergeSorted[j + 1]) {
                    temp = mergeSorted[j];
                    mergeSorted[j] = mergeSorted[j + 1];
                    mergeSorted[j + 1] = temp;
                }
            }
        }
        
        System.out.println("merged sorted array");
        for(int val : mergeSorted){
            System.out.print(val+" ");
        }

    }

    // Driver code
    public static void main(String args[]) {
        int n=4, m=5;
        int[] array1 = new int[]{1,3,5,7};
        int[] array2 = new int[]{0,2,6,8,9};
        merge(array1,array2,n,m);
    }
}