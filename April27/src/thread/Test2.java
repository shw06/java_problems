package thread;
/*
 * How to create the thread in java??
1)extends Thread class
 */
public class Test2 extends Thread {
	
	public void run()
	{
		System.out.println("This is run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		t1.start(); //it will create thread
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//to provide waiting time to another process
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		System.out.println(t1.getId()+" "+t2.getId()+" "+t3.getId());
		System.out.println(t1.getName()+" "+t2.getName()+" "+t3.getName());

	}

}