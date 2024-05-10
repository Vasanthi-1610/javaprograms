package Arraysbasics;

public class calculateSumPreNext {

	public static void main(String[] args) {
		int sum=0;
		
		int a[]=new int[] {1,2,3,4,5,6};
		for(int x=0;x<a.length;x++)
		{
			sum=sum+a[x];
		
		}
		System.out.println("sum="+sum);

	}

}
