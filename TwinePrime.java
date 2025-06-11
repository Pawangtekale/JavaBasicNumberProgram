class TwinePrime 
{
	public static void main(String[] args) 
	{
		System.out.println(nextPrime(15));
		System.out.println(checkTwinePrime(13,103));
		rangeOfTwinePrime(1,103);
		System.out.println();
		
		
	}
	public static void rangeOfTwinePrime(int start, int end){
		start=nextPrime(start);
		int next;
		while (start<=end)
		{
			next=nextPrime(start);
			if (next<=end && next-start==2)
			{
				System.out.println(start+" "+next);
			}
			start=next;
		}
	}
	public static boolean checkTwinePrime(int n1,int n2){
		if (n1<n2)
		{
			if (isPrime(n1)&&(n2-n1==2)&& isPrime(n2))
			{
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	public static int nextPrime(int num){
		if (isPrime(num))
		{
			return num;
		}
		else{
			int start;
			for (start=num;!isPrime(start);start++)
			{
			}
			return start;
		}
	}
	public static boolean isPrime(int num){
		int den=2;
		while (den<num)
		{
			if (num%den==0)
			{
				return false;
			}
			den++;
			
		}
		return true;
	}
}
