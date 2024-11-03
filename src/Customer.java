import javax.swing.JOptionPane;

public class Customer extends User{
	private String password;
	String name,email;
	int number;
	Car bookedCar=new Car();
	boolean bookStatus=false;
	
	Customer(String name,String email,int id,int number){  //Constructor
		super(id);
		this.name=name;
		this.email=email;
		 this.id=id;	
		this.number=number;		
	}
	Customer(){}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
	public void display() {
		JOptionPane.showMessageDialog(null,"Name of customer: "+name+"\n"+"Your email: "+email+"\n"
				+"Your ID: "+id+"\n"+"Your phone number: "+number+"\n"+
				"Your new password: "+password,"Info",JOptionPane.PLAIN_MESSAGE);
		
	}

}