package EndSemExam2;

public class Counter {
	private int count=0;
	synchronized public void increment() throws Exception{
		if(count==3) {
			System.out.println("overflow");
			wait();
		}
		count++;
		System.out.println("Counte increased:"+count);
		notifyAll();
	}
	synchronized public void decrement()throws Exception{
		if(count==0) {
			System.out.println("underflow");
			wait();
		}
		count--;
		System.out.println("Count decremented: "+count);
		notifyAll();
	}
public static void main(String [] args) {
	try {
		Counter c=new Counter();

			Thread t1=new Thread(()->{
				try {
					int i=0;
					for(i=0;i<5;i++) {
						c.increment();
					}

				}
				catch(Exception e) {}
				
			});
			Thread t2=new Thread(()->{
				try {
					int j=0;
					for(j=0;j<5;j++)
						c.decrement();
				}
				catch(Exception e) {}	
			});
			t2.start();
			t1.start();
	}
	catch(Exception e) {
		
	}

}
}
