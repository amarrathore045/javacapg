package Name;

public class MyDateDemo {
	
	public static void main(String args[]) {
		MyDate d1 = new MyDate();
		
		MyDate d2 = new MyDate(21,5,2002);
		
		
		//MyDate.swap(d1,d2);
		
		
		MyDate[] dateArray = new MyDate[2];
		dateArray[0]= d1;
		dateArray[1]= d2;
		
		dateArray[0].display();
		dateArray[1].display();
		
		MyDate.swap(dateArray);
//		d1= dateArray[0];
//		d2 = dateArray[1];
//		
//		
//		d1.display();
//		d2.display();
		
		dateArray[0].display();
		dateArray[1].display();
		
		System.out.println("count = " + MyDate.getCount());
		
		
		
//		MyDate d4 = new MyDate();
//		d4.addNum(4,5);
//		d4.addNum(4.5f,5.4f);
//		d4.addNum(45d,58d);
//		d4.addNum('c','v');
//		
//		d4.parameter(5);
//		d4.parameter(5, 7);
//		
		
		
		
		
		
		}
		
		
}
