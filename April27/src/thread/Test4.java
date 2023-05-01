package thread;


class PrintTable extends Thread
{
	int n;
	PrintTable(int n)
	{
		this.n=n;
	}
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println("The table is:"+(n*i));
		}
	}
}
public class Test4 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTable p1=new PrintTable(5);
		PrintTable p2=new PrintTable(2);
		PrintTable p3=new PrintTable(4);
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p2.start();
		try {
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p3.start();
		
		
		
	}

}