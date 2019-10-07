package daily_Task;

public class Permutation {
	
	public static void printPermutation(String str,String ans){
		if(str.length() == 0) {
			System.out.print(ans+ " ");
		}
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String str1 = str.substring(0, i)+
					     str.substring(i+1);
			printPermutation(str1, ans + ch);
		}
	}
	

	public static void main(String[] args) {
		String str = "abc";
		printPermutation(str,"");
	}

}
