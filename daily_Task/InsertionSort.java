package daily_Task;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr = {5,4,3,9,7,8,6};
		int j;
		for(int i = 1;i < arr.length; i++)
		{
			int temp = arr[i];
			j = i;
			while(j>0 && arr[j-1] > temp )
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
