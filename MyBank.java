interface MyBank {
	void write(); 
	void read();
    //declare only
}
//class SBIread extends MyBank{}   //1
	
class SBIwrite implements MyBank{
	public void read() {
}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Tan");
		
	}
}

