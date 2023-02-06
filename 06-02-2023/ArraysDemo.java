package Name;
import java.util.Scanner;
public class ArraysDemo {
	
	public static void main(String args[]) {
		
		int[] myArray = new int[3];
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		
		int[] myArray1 = new int[3];
		myArray1[0] = 20;
		myArray1[1] = 30;
		myArray1[2] = 40;
		
		
		int[] finalArray = new int[3];
		
		for(int i=0;i<myArray.length;i++)
			finalArray[i] = myArray[i] + myArray1[i];
		
		for(int i=0;i<myArray.length;i++)
			System.out.print(finalArray[i] + "  ");
		
		System.out.println("");
		
		//H.W - Write a program to search for a particular element
		//    - reverse the same array and output without using extra array
		
		int[][] array1 = {{1,2,3},{4,5,6},{7,8,9},{1,2,3}};
		int[][] array2 = {{1,2,3},{4,5,6},{7,8,9},{1,2,3}};

		
		
		
		int[][] finalArray1 = new int[4][3];
		
		for(int i=0;i<array2.length;i++) 
		{
			for(int j=0;j<array2[i].length;j++)
			{
				//error in this line, array index out of bound !
				finalArray1[i][j] = array1[i][j] + array2[i][j];
				
			}
		}
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[0].length;j++) {
				
				System.out.print(finalArray1[i][j] + "  ");
				
			}
			System.out.println("");
		}
		
		
	}

}
