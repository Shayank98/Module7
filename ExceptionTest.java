package Day5;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ;
		int b ;
		if(args.length>0){
			try{
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				int result = a/b;
				System.out.println("Result is: "+result);
			}catch(NumberFormatException Ne){
				System.out.println("Only Integers are allowed "+Ne.getMessage());
			}
			catch(ArithmeticException ae){
				System.out.println("Division with zero is not possible "+ ae.getMessage());
			}
		}
		else{
			System.out.println("No Input Received");
		}
	}

}
