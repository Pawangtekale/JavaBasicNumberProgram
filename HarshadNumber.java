class HarshadNumber{
public static void main(String[] args) {
	int num=0;
	int sum=0;
	int temp = num;
	while(num!=0){
		sum+=num%10;
		num/=10;

	}
	if (temp!=0&&(temp%sum==0)) {
		System.out.println("It is Harshad Number...");
		
	}
	else{
		System.out.println("It not a Harshad num...");
	}
 }
}