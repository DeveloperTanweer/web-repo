
public  abstract class Bank {
	String name;
	
	/*
	 * abstract void readData() { System.out.println("I can read tha data"); } }
	 */
	
	abstract void readData();
	abstract void writeData();
	
	void method() {
		System.out.println("TanweerR");
	}

}
class Admin extends Bank{
	void  readData() {
		
		
	}
	void writeData() {
		
	}
}
class Marketing extends Bank{

	@Override
	void readData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void writeData() {
		// TODO Auto-generated method stub
		
	}
	
}
