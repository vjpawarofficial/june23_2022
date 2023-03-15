class Parent {
	void Show() {
		System.out.println("parent show");
	}
}
class child extends Parent {
	public void Show() {
		System.out.println(" Childs show");
	}
}
public class Overriding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c1 = new child();
c1.Show();
Parent p1 = new Parent();
p1.Show();
	}

}
