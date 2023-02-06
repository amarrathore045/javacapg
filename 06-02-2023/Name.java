package Name;
import java.util.*;
public class Name {
	public static void main(String Args[]) {
		
		System.out.println("Hello World");
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//System.out.println("Number entered = " + n);
		int n = Integer.MAX_VALUE;
		int m = Integer.MIN_VALUE;
		
		System.out.println(n);
		System.out.println(m);
		
		char c = Character.MAX_VALUE;
		char d = Character.MIN_VALUE;
		
		System.out.println((int)c);
		System.out.println((int)d);
		
		float f = Float.MAX_VALUE;
		float g = Float.MIN_VALUE;
		
		System.out.println(f);
		System.out.println(g);
		long lo = 5687350;
		int in = 45;
		in  =(int)lo;
		System.out.println((int)lo);
		System.out.println((long)in);
		
		float fl = 4.5f;
		int i= 34;
		i=(int)fl;
		
		short s =3;
		char t= 2;
		
		t= (char)s;
		
		t = (char)n ;
		System.out.println(t);
		
		
		float floatValue = 34.5f;
		double doubleValue = 456.4;
		
		doubleValue = floatValue;
		floatValue = (float)doubleValue;
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
	}
}
