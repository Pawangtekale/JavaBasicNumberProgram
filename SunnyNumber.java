import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int num=sc.nextInt();
		int res=num+1;
		boolean flage=false;

		for(int i=0;i<=res;i++){
			//System.out.print("i:"+i+" ");
			if(i*i==res){
				flage=true;
				break;
			}
		}
		if(flage){
			System.out.println("It is a Sunny Number....!");
		}
		else
			System.out.println("It not a Sunny Number....!");
	}
}