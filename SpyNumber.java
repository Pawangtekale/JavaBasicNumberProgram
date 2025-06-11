class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num=1124;
		int temp=num;
		int sum=0;
		int product=1;
		while (temp>0)
		{
		   int last=temp%10;
		   sum+=last;
		   product*=last;
		   temp/=10;
		   
		}
		if (sum==product)
		{
			System.out.println("It is Spy Number ");
		}
		else 
			System.out.println("its not a Spy Number" );
		
	}
}
