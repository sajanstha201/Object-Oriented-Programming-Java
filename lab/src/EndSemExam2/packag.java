package EndSemExam2;
public class packag {
public static void main(String [] args) {
	int i,j;
	for(i=0;i<10;i++) {
		for(j=0;j<10;j++) {
			System.out.println(j);
			if(j==5&&i==0)
				break;
		}
	}
	
	EndSemExam.A a=new EndSemExam.A();
	a.method2();
	EndSemExam.A.D d=a.new D();
	D x=new D();
	x.print();
}
}
class D extends EndSemExam.A{
	void print() {
		System.out.println(c);
	}
}
