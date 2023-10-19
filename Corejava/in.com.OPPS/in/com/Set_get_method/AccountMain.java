package in.com.Set_get_method;

public class AccountMain {
public static void main(String[] args) {
	Account A = new Account();
	A.setAccountNumber(747843);
	A.setAccountType("saving");
    A.setBalanc(4000);
	
	System.out.println(A.getAccoumtNumber());
    System.out.println(A.getAccountType());
	System.out.println(A.getBalanc());

	
	
	
}
}
