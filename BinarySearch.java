import java.util.*;
import java.io.*;

public class BinarySearch {
	 
	// (Iterative Method)
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner o=new Scanner(System.in);
		int a[]= {3, 6, 7, 8, 10, 20, 23, 25, 40, 45 };
		
		//condition for binary search is array needs to be sorted.
		System.out.println("Search for ");
		int x=o.nextInt();
		int n=a.length;
		
		int result=binarySearch(a,x,0,n-1);
		
		if(result ==-1) {
			System.out.println("Value not found");
		}else {
			System.out.println("Elemetn found at "+result);
		}
		
		
		
	}

	static int binarySearch(int a[],int x,int low,int high) {
		
		if(low <=high) {
			
			int mid=(low+high)/2;
			
			if(a[mid]==x)
				return mid;
			if(a[mid] < x)
				low=mid+1;
			else 
				high=mid+1;
			
			
			
		}
		
		
		
		return -1;
	}
	
}
