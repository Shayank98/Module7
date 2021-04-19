package Day5;

public class Customer {
	private String CustNo;
	private String CustName;
	private String Category;
	public String getCustNo() {
		return CustNo;
	}
	public String getCustName() {
		return CustName;
	}
	public String getCategory() {
		return Category;
	}
	
	Customer(String CustNo, String CustName, String Category) throws InvalidInputException{
		if (CustNo.startsWith("C") || CustNo.startsWith("c"))
			this.CustNo = CustNo;
		else
			throw new InvalidInputException("custId must starts with c");
		if (CustName.length() == 4)
			this.CustName = CustName;
		else
			throw new InvalidInputException("Name must contain 4 char");
		if (Category.equalsIgnoreCase("Platinum") || Category.equalsIgnoreCase("Gold")
				|| Category.equalsIgnoreCase("Silver"))
			this.Category = Category;
		else
			throw new InvalidInputException("Your Category not in list");
	}
	
}
