package Name;

public class ReverseArrayDemo {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		array[0] = 2;
		array[1] = 3;
		array[2] = 4;
		array[3] = 5;
		array[4] = 6;
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
		swap(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
	}
	static void swap(int[] array) {
		int start =0;
		for(int i = array.length-1;i>=0;i--) {
			int temp = array[i];
			array[i] = array[start];
			array[start] = temp;
			start++;
			if(start == array.length/2) {
				return;
			}
		}
	}

}
