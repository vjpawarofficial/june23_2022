class Parent4 {
	static void m1() {
		System.out.println("From parent"+"static m1()");
	}
	void m2() {
		System.out.println(" From parent "+"non-static (instance) m2()");
	}
}
class Child4 extends Parent4{
	static void m1() {
		System.out.println("From child static m1()");
	}
	public void m2() {
		System.out.println("From child"+"non-static (instance) m2()");
	}
}
public class Overriding8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent4 obj1 = new Child4();
obj1.m2();
obj1.m1();
	}

}
