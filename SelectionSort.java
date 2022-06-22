import java.util.*;
import java.io.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,56,0,1,60,25,5,10};
		
		int n=a.length;
		
		for(int i=0;i<n-1;i++) {
			
			int min=i;
			
			for(int j=i+1;j<n;j++) 
				
				if(a[j] <a[min]) 
					
					min=j;
					
					int t=a[min];
					a[min]=a[i];
					a[i]=t;
					
				
				
			
		}
		
		
		
		//print
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
