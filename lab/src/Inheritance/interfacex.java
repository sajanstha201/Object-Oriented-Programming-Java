package Inheritance;

public class interfacex {
	public static void main(String[] args) {
		aa a = new aa();
		System.out.println(Ax.b);
		ccc.ddd d = new ccc.ddd();
		d.addition();
		xyz x = new xyz();
	}
}

interface Ax {
	// variable
	int x=10;
//	int a=10;
	// abstract int a;
	final int a = 10;// it cannot be modified
	static int b = 10;// it also cannot be modified by class also
	// method

	void add();// if it is not declare in subclass then it will show error
//	void add1() {
//		System.out.println("This is from class Ax add1 method");
//	}

	abstract void sub();

	static void adder() {// it can be hidden after defining method with same name in subclass
		System.out.println("This is from class Ax adder funtion");
	}

	// final void adderr();
	// final void adderr() {
	// System.out.println("This is from class Ax adderr method");
	// }
	// all the command related to class will work properly like normal nested class
	interface F {
		void addition();

		void subtraction();// it will create another nested interface
	}
}

interface Bx {
	void div();
}

interface Cx extends Bx {// interface can also inherit another interface class
	void mul();
}

class xyz implements Ax, Bx {
	xyz() {
		System.out.println("This is from class xyz");
	}

	void adder() {

	}

	public void add() {

	}

	public void sub() {

	}

	public void div() {

	}
}

class ccc {
	static class ddd implements Ax.F {
		ddd() {
			System.out.println("This is from class ddd");
		}

		// void addition() {//this is implicitily is public
		// System.out.println("This is from class ddd addition method");
		// }
		public void addition() {
			System.out.println("This is from class ddd addition method");
		}

		public void subtraction() {

		}
	}
}

class aa implements Ax {
	aa() {
		System.out.println("This is from class aa" + b);
	}

	public void sub() {
		System.out.println("This is from class aa sub method");
	}

	public void add() {
		System.out.println("This is from class aa add mehtod");
	}

	public void add1() {
		System.out.println("This is from class aa add1 method");
	}

	static void adder() {
		System.out.println("This is from class aa adder method");
	}

	class bb implements F {
		public void addition() {

		}

		public void subtraction() {

		}
	}
}