package Name;
import static java.lang.Math.PI;
public class StaticBlockDemo {
	static {
		System.out.println("111");
	}
	static {
		System.out.println("222");
	}
	
	
	public static void main(String args[]) {
		//Initialization block is executed once object is created
		//static block is executed before main class
		System.out.println(Math.PI);
		System.out.println(PI);
	}
}
//wrapper class - classes corresponding to primitive data types