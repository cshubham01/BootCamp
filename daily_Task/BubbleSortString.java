package daily_Task;

public class BubbleSortString {

	public static void main(String[] args) {
		String[] arr = {"Shubh","Ram","Deepak", "Deepansh", "Dev","Devgan"};
		for(int i=1;i<arr.length;i++)
		{
		 for(int j=0;j<arr.length-1;j++)
		 { 
			if(arr[j].compareTo( arr[j+1])>0)
		    {
				String temp = arr[j];
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
