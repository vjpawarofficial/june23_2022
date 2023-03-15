
public class Overiding {
	static double res;
	 static public void square(double number) {
		 res= number*number;
		 
	 }
	 static public void square() {
		 System.out.println(" No parameter Method called");
	 }
	 
	 static public void square (int number) {
		 res = number* number;
		 System.out.println("Method with Integer argument called:"+res);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overiding.square(2.5);
		Overiding.square(2);
		Overiding.square();
		
 
	}

}
