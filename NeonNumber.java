class NeonNumber 
{
	public static void main(String[] args) 
	{
		int num=9;
		int square=num*num;
		int sum=0;
		while (square>0)
		{
			int last=square%10;
			sum+=last;
			square/=10;
		}
		if (sum==num)
		{
			System.out.print("It is Neon Number");
		}
		else 
			System.out.print("It is not Neon Number");
	}
}
