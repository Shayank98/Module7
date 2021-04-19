package Day5;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer cust1=null;
		System.out.println("Enter Customer Id");
		String CustNo=sc.nextLine();
		System.out.println("Enter Customer Name");
		String CustName=sc.nextLine();
		System.out.println("Enter Customer Category");
		String Category=sc.nextLine();
		try {
			cust1=new Customer(CustNo, CustName, Category);
		} catch (InvalidInputException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
