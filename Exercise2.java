import java.util.*;


public class Exercise2{

     public static void main(String []args){


		 System.out.println("please input a sequence of characters");
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 char[] myArray = new char[s.length()];   //String.length()

		 for (int i = 0; i <= s.length() -1; i++)
		 {
			 myArray[i] = s.charAt(i);	 
		 }

		 char[] reversed = reverse(myArray);


		 System.out.println("the reversed sequence is:");
		 System.out.println(reversed);
	}	


	public static char[] reverse(char[] array ){

		char[] result = new char[array.length];

		int j = 0;
		for (int i = array.length-1; i >= 0; i--)
		{
			result[j] = array[i];
			j++;
		}

		return result;
	}
}

