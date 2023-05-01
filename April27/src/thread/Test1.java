package thread;
/*
 * How to create the thread in java??
1)extends Thread class
 */
public class Test1 extends Thread {
	
	public void run()
	{
		System.out.println("This is run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		t1.start(); //it will create thread

	}

}