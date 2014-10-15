import java.util.*;


public class Exercise1{

     public static void main(String []args){

		 char[] myArray = {'h', 'e', 'l', 'l', 'o'};
		 char[] copy = new char[myArray.length];


		 arrayCopy(copy, myArray);

		 System.out.println("characters in source array:");
		 System.out.println(myArray);

		 System.out.println("characters in copied array:");
		 System.out.println(copy);
	}	


	public static void arrayCopy (char[] destination, char[] source ){

		for (int i = 0; i <= source.length - 1; i++)
		{
			destination[i] = source[i];
		}
	}
}

