import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args) {
		final float pi=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius :");
		int radius=sc.nextInt();
		int area=(int)(pi*radius*radius);
		System.out.println("radius is :"+ area);
		
	}
}
