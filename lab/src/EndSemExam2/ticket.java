package EndSemExam2;
import java.util.*;
interface ti{
	void reserve(int n) throws Exception;
	void cancel(int n) throws Exception;
}
class tic implements ti{
	int s=0;
	int max=50;
	synchronized public void reserve(int n) throws Exception{
		this.s+=n;
		System.out.println("Reserved");
		if(s>max)
			throw new Exception("set not available");
	}
	public void cancel(int n) throws Exception {
		
		
		if(s==0)
			throw new Exception("set not booked yet");
		this.s-=n;
		System.out.println("Cancelled");
	}
}
public class ticket {
public static void main(String [] args) {
	tic t=new tic();
	while(true) {
		try {
		System.out.println("Enter 1 for reservation:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		Thread t1=new Thread(new Runnable() {
			public void run(){
				try {
					t.reserve(1);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		});
		Thread t2=new Thread(()->{
			try {
				t.reserve(1);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		});
		if(r==1) {
			t1.start();
			t2.start();
		}
		System.out.println("Enter 1 for cancelation:");
		int c=sc.nextInt();
		Thread t3=new Thread(new Runnable() {
			public void run() {
				try {
					t.cancel(1);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});
		if(c==1)
			t3.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
}
