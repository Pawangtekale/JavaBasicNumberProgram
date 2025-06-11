class StrongNumber
{
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		int temp=num;
		
		while(num>0){
			int lastDigit=num%10;
			int fact=1;
			for(int i=1;i<=lastDigit;i++){
				fact*=i;
				//sum=sum+fact;
			}
			sum=sum + fact;
			num/=10;
		}
		if(temp==sum){
			System.out.println("It is a Strong number");
		}
		else
			System.out.println(" It not Strong Number..");
	}
}