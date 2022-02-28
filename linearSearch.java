import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the array :");
		int n=sc.nextInt();
		int[]arr=new int[n];
		
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		System.out.print("enter number to be searched :");
		int k=sc.nextInt();
		
		for(int i=0;i<n;i++){
		    if(k==arr[i]){
		       System.out.println(k + " is present at index "+ i);
		    }
		    
		    
		}
	
	}
}
