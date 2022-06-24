import java.util.*;
import java.io.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,2,40,11,12,6,5,1};
		
		
		int n=a.length;
		int k,j;
		for(int i=1;i<n;i++)
		{
			k =a[i];
			j=i-1;
			
			while(j >=0 && a[j] > k) {
				a[j+1]=a[j];
				j=j-1;
				
			}
			
			a[j+1]=k;
		}
		
		
		//print
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
			
		}
		
		

	}

}
