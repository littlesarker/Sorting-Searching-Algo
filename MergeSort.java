import java.io.*;
import java.util.*;
public class MergeSort {

	void merge (int ar[],int p,int q,int r) {
		int n1=q-p+1;
		int n2=r-q;
		
		int L[]=new int [n1];
		int M[]=new int [n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=ar[p+i];
		}
		for(int j=0;j<n2;j++) {
			M[j]=ar[q+1+j];
		}
		
		
		int i=0,j=0,k=p;
		
		while(i <n1 && j <n2) {
			if(L[i] <=M[j]) {
				ar[k]=L[i];
				i++;
			}else {
				ar[k]=M[j];
				j++;
			}
		k++;
		}
		
		while(i <n1) {
			ar[k]=L[i];
			i++;
			k++;
		}
		while(j <n2) {
			ar[k]=M[j];
			j++;
			k++;
		}
		
	}
	
	void mergeSort(int ar[],int l,int r) {
		
		if(l <r) {
			
			
			int m=(l+r)/2;
			mergeSort(ar,l,m);
			mergeSort(ar,m+1,r);
			
			merge(ar,l,m,r);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		

		int ar[]= {10,30,5,2,1,60,89,90,7,9};
		
		MergeSort o=new MergeSort();
		o.mergeSort(ar,0,ar.length-1);
		
		//print array
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}
	

}
