package Name;


public class WrapperClassDemo {
	//wrapper class - classes corresponding to primitive data types
	public static void main(String args[]) {
		
		int i =10;
		Integer ii =i;//auto boxing, converting primitive to object type
		System.out.println(ii);
		
		//int c = ii;//Unboxing, converting primitive to object type
		//int c = ii.intValue();
		int c = Integer.valueOf(ii);
		System.out.println(c);
		
		
	}
}
