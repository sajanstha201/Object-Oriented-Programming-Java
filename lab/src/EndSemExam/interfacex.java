package EndSemExam;
interface ifn{
	int x=10;
	void add(int t);
}
public class interfacex implements ifn{
	static int a=1000;
	public void add(int t) {
		//x=t;
		System.out.println(++a);
	}
	public static void main(String [] args) {
		interfacex i=new interfacex();
		i.add(23);
		int x=10;
		int y=30;
		System.out.println(((x++)+(x--)));
		System.out.println(x);
	}
}
