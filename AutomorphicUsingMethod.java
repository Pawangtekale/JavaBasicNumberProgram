class AutomorphicUsingMethod 
{
	public static void main(String[] args) 
	{
		System.out.println(isAutomorphicUsingMethod(76));
	}
	public static boolean isAutomorphicUsingMethod(int num){
		//int num=76;
			int count=(int)Math.log10(num)+1;
			int divide=1;
			for (int j=1;j<=count;j++)
			{
				divide*=10;
			}
			int square=num*num;
			int lastDigit=square%divide;
			if (num==lastDigit)
			{
				return true;
			
				//System.out.println("It is Automorphic Num");
			}
			return false;
	}
}