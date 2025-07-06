package Task3;


	 class ATMInterfacemachine {
	    public static void main(String[] args) {
	    	ATMInterface userAccount = new ATMInterface(5000);  // Initial balance ₹5000
	        ATM atm = new ATM(userAccount);
	        atm.showMenu();
	    }
	}