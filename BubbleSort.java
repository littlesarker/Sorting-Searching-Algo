import java.util.*;
import java.io.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,3,7,50,2,20,40};
		
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j] >a[j+1]) {
					
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
		}
		
		
		//print array
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
