class Animal2 {
public void move() {
	System.out.println(" Animals can Move");
}
void display() {
	System.out.println(" I am display of Animals");
}
}
class DOg2 extends Animal2 {
	public void move() {
		System.out.println(" DOgs can walk and Run");
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal2 b =new DOg2();
b.move();
b.display();
}
}
