package daily_Task;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr =  {7,5,8,6,2,4,9};
		int min,temp;
		for(int i=0;i<arr.length-1;i++)
		{
			min = i;
			for(int j=i+1;j<arr.length;j++)
			{
			 if( arr[j] < arr[min])
			 {
				 min = j;
			 }
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		 	 
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
