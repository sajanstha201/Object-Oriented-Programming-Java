package EndSemExam2;
class Ax{
	public void add() {
		int i;
		for(i=0;i<100;i++)
			System.out.println(i);
	}
	synchronized public void sub() {
		int i;
		for(i=0;i<100;i++)
			System.out.println("sajan shrestha skdfljsdlfjslfjsdlfj");
	}
}
public class multithreading {
public static void main(String [] args) {
	Ax a=new Ax();
	Thread t1=new Thread(()->{
		a.add();
	});
	Thread t2=new Thread(()->{
		a.sub();
	});
	synchronized(a) {
		a.add();
	}
	t1.start();
	t2.start();
}
}
