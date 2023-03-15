class ABC {
	void mymethod() {
		System.out.println("method of ABC class");
	}
}

 class Overriding4 extends ABC {
	 public void mymethod() {
		 System.out.println(" Overiding method of overiding4");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overriding4 o = new Overriding4();
o.mymethod();
	}

}
