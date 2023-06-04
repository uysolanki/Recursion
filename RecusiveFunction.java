import java.util.Scanner;

public class RecusiveFunction {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt(); //5	
		//int ans=factorial(n);
		//System.out.println("Factoral of "+n+ " is " + ans);
		int ans=sumOfNumbers(n);
		System.out.println("Sum of 1st "+n+ " Numbes is " + ans);
}

	//sum of numbers using recursion
	private static int sumOfNumbers(int n) {
			if(n==1)
				return 1;
			else
				return (n+sumOfNumbers(n-1));
	}
	
	//sum of numbers using iteration
	private static int sumOfNumbers1(int n) {
		int ans=0;
		for(int i=0;i<=n;i++)
			ans+=i;
		
		return ans;
}

	//factorial using recursion
	private static int factorial(int n) {
				if(n==1)   //checking the base case
					return 1;
				else
					return(n*factorial(n-1));
				}
	
	//factorial using iteration
	private static int factorial1(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		
		return fact;
	}
	
}


