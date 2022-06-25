import java.io.*;
import java.util.*;

public class BinarySearch2 {

	//(Recursive Method)
	
	
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
			System.out.println("Elemetn found at index  "+result);
		}

	}

      static int binarySearch(int a[],int x,int low,int high) {
		
    	  
		if(high >=low ) {
			
			int mid= low + (high - low) / 2;
			
			if(a[mid]==x)
				return mid;
			if(a[mid] > x)
				return binarySearch(a,x,low,mid-1);
				
		
				return binarySearch(a,x,mid+1,high);
		
		}
		
		return -1;
	}
}
