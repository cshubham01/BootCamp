package daily_Task;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=2;i*i<=n;i++)
		{
			while(n%i == 0)
			{
				System.out.print(i + " ");
				n = n/i;
			}
		}
		if(n>2)
		System.out.println(n);
	}

}
