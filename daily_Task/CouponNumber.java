package daily_Task;

public class CouponNumber {
	
	public static int isDictinct(int coupons) {
		int distinct=0,count=0,value;
		boolean[] arr = new boolean[coupons];
		while(distinct < 100)
		{
			value = (int) (Math.random()*100);
			count++;
			while(arr[value]!= true)
			{
				arr[value] = true;
				distinct++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		int coupons = 100;
		System.out.println(isDictinct(coupons));
	}

}
