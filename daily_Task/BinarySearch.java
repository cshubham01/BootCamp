package daily_Task;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int search_ele = sc.nextInt();
		int [] arr = {1,2,4,8,9,14,24};
		int li = 0,hi = arr.length;
		int mi = (li + hi)/2;
		  while(li <= hi)
		 {
		   if(arr[mi] == search_ele)
		 {
			System.out.println("Found at Index Position " + mi);
			break;
		 }
		  else if(arr[mi] < search_ele)
		 {
			li = mi + 1;
		 }
	      else
		 {
			hi = mi -1;
		 } 
		  mi = (li + hi)/2;
		}
		
	}

}
