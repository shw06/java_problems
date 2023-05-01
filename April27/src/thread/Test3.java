package thread;
public class Test3  implements Runnable{

	public void run() {
		// TODO Auto-generated method stub

		System.out.println("This is run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread(new Test3());
		
		t.start();
		
		
	}

	
}