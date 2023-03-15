class Human {
	void eat() {
		System.out.println(" Human Is eating");
	}
}
class Boy extends Human {
	protected void eat () {
		System.out.println("Boy is eating");
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Boy obj = new Boy();
  obj.eat();
	}

}
