package in.com.Set_get_method;

import java.util.Scanner;

public class AtmMachin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int balance=1000;
	int pin=123;
	
System.out.println("Enter the username :");
String username=sc.next();
System.out.println("..enter your pin");

int u_pin=sc.nextInt();
System.out.println(" Welcome to BOI");
System.out.println("welcome......"+username);

int choice=0;
if(pin==u_pin) {
do {
	System.out.println("1 withdrow");
	System.out.println("2 deposite");
	System.out.println("3 check balance");
	System.out.println("4 exit");
	
	System.out.println("enter your choice...");
	 choice=sc.nextInt();
	switch(choice) {
	case 1:{
		System.out.println("...withdrow amount");
		int withdrow=sc.nextInt();
		if(withdrow>balance) {
			System.out.println(".. insufficent balance. .");
		}
		else {
			balance=balance-withdrow;
			System.out.println("..succesfully withdrow amount..");
			System.out.println(".. please check withdrow..");
		}
		break;
	}
	case 2:{
		System.out.println("..inter your amount..");
		int dep=sc.nextInt();
		
		balance=balance+dep;
		
		System.out.println(".. succesfully deposite your amount");
		System.out.println(("..check amount after deposit.."));
		break;
	}
	case 3:{
		System.out.println("..your balance....."+balance);
		break;
	}
	case 4:{
		System.exit(0);
		
	}
	}
}while(choice !=4);
}
else {
	System.out.println("..please check your pin..");
}


} 

}
