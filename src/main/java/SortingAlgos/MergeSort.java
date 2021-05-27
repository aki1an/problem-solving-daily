package SortingAlgos;

import java.util.Scanner;

public class MergeSort {

    void join(int[] arr, int left, int mid, int right) {
        int nL = mid - left + 1;
        int nR = right - mid;
        int[] arrL = new int[nL];
        int[] arrR = new int[nR];
        for (int i = 0; i < nL; i++) {
            arrL[i] = arr[left + i];
        }
        for (int j = 0; j < nR; j++) {
            arrR[j] = arr[mid + j + 1];
        }
        int i, j, k;
        i = j = 0;
        k = left;
        while (i < nL && j < nR) {
            if (arrL[i] <= arrR[j])
                arr[k++] = arrL[i++];
            else
                arr[k++] = arrR[j++];
        }
        while (i < nL) {
            arr[k++] = arrL[i++];
        }
        while (j < nR) {
            arr[k++] = arrR[j++];
        }

    }

    void sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            join(arr, left, mid, right);
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        new MergeSort().sort(arr, 0, n - 1);
        for (int i : arr)
            System.out.print(i + " ");

    }
}
/**class Solution {
     void mergesort(int arr[]) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	void merge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

    public int arrayPairSum(int[] nums) {
        mergesort(nums);
        int ans = 0;
        for(int i=0;i<nums.length/2;i++){
            ans+=nums[2*i];
        }
        return ans;
    }
}

 */