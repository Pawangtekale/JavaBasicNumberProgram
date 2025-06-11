class FascinatingNumber1 
{
	public static void main(String[] args) 
	{
		int num=192;
		int count=(int)Math.log10(num)+1;
		if (count==3)
		{
			int num1=num*1;
			int num2=num*2;
			int num3=num*3;
			String res=num1+""+num2+""+num3;
			int result=Integer.parseInt(res);
			System.out.print(result);
			int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
			while (result!=0)
			{
				int lastDigit=result%10;
				
				switch (lastDigit)
				{
				case 1:{
					count1++;
				    break;
				}
				case 2:{
					count2++;
				    break;
				}
				case 3:{
					count3++;
				    break;
				}
				case 4:{
					count4++;
				    break;
				}
				case 5:{
					count5++;
				    break;
				}
				case 6:{
					count6++;
				    break;
				}
				case 7:{
					count7++;
				    break;
				}
				case 8:{
					count8++;
				    break;
				}
				case 9:{
					count9++;
				    break;
				}
				
			  }
			 result/=10;
				
			}
			if (count1==1 && count2==1 && count3==1 && count4==1&&count5==1&&
					count6==1&&count7==1&&count8==1&&count9==1)
				{
					System.out.print(" It is Fascating Number...!" );
				}
				else{
					System.out.print(" Its Not Fascating Number..");
				}
		}
	}
}
