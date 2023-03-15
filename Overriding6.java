class Parent2 {
	private void m1() {
		System.out.println("From parent m1()");
	}
	protected void m2() {
		System.out.println("From parent m2()");
	}
}
class child2 extends Parent2{
	public void m1() {
		System.out.println("From child m1");
	}
	public void m2() {
		System.out.println("from child m2");
	}
}
public class Overriding6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p1 = new Parent2();
		p1.m2();
		Parent2 c1 = new child2();
		c1.m2();

	}

}
