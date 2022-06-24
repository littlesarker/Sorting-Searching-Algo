import java.util.*;
import java.io.*;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner o=new Scanner(System.in);
		
		int a[]= {6,100,1,11,48,32,18,5,7};
		
		System.out.println("Enter value for Search \n");
		int x=o.nextInt();
	    boolean f=true;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x) {
				
				f=false;
			}
		}
		if(f==false) {
		System.out.println("Value  found \n");
		}else {
			System.out.println(" value not found \n");
		}
	}

}
