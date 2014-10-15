import java.util.*;
import java.lang.Math;

public class Exercise3{

     public static void main(String []args){

		 int[] myArray = new int[10];

		 System.out.println("integers in the array:");

		 for (int i = 0; i <= myArray.length-1; i++)
			 {
				 myArray[i] = (int)(Math.random()*1000);
				 System.out.println(myArray[i]);
			 }

		 int difference = findDifference(myArray);
		 System.out.println("the difference between the maximum and minimum integers:");
		 System.out.println(difference);
	}	


	public static int findDifference (int[] array ){

		int min = array[0];
		int max = array[0];
		int diff = 0;
		for (int i = 0; i <= array.length - 1; i++)
		{
			if (array[i] > max)
				max = array[i];

			if (array[i] < min)
				min = array[i];
		}
		
		return (max - min);
	}
}

