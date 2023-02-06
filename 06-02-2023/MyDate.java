package Name;
public class MyDate {
	private static int count=0;
	
public static int getCount() {	//instance variable are shared  among objects therefore
	                            //instance variables are not used in static methods
	return count;
}
	// parameterized const
	MyDate(int day,int mon,int year){
		count++;
		//this();//constructor chaining, this() will call the other const
		this.day = day;
		this.mon = mon;
		this.year = year;
	}
	//this(); has to be the first statement in-case of constr. chaining
	//no arg const
	MyDate(){
		count++;
		day = 1;
		mon = 4;
		year = 1979;
	}
	

	

	//instance variables
	private int day = 10;
	private int mon =10;
	private int year = 1977;
	
	//without any name, a block is called as initialization block
		{
			day = 2;
			mon= 2;
			year = 2002;
		}
	
	public void display()
	{	
		System.out.println(day +"/" + mon + "/" + (int)year);
	}
	
	
	public void addNum(double num, double num2) {
		System.out.println(num+num2);
	}
	
	public void parameter(int length, int breadth) {
		System.out.println("Perimeter of Shape = "+ 2*(length+breadth));
	}
	public void parameter(float num) {
		
		System.out.println("Perimeter of Shape = "+ 4*num);
		
		
	}
	public void parameter(double radius) {
		System.out.println("Circumference of circle = "+ 2*3.14*radius);
	}
	
	
	public static void swap(MyDate arr[]) 
	{
	
		MyDate temp ;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
