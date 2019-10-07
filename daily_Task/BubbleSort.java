package daily_Task;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = {11,4,25,12,41,40,21,65,56,23,15};
		for(int i=1;i<arr.length;i++)
		{
		 for(int j=0;j<arr.length-1;j++)
		 { 
			if(arr[j] > arr[j+1])
		    {
				int temp = arr[j];
		      	arr[j] = arr[j+1];
			    arr[j+1] = temp;
			}
		 }
		}
		for(int i=0;i<arr.length;i++)
		{
		   System.out.println(arr[i]);
		}
	}
}
