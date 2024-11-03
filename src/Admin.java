import javax.swing.JOptionPane;

public class Admin extends User{
	String name;
	private String password;
	double salary;
	Admin(String name,int id,String password,double salary){  //Constructor
		super(id);
		this.name=name;	
		this.password=password;
		this.salary=salary;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
public void display() {
	JOptionPane.showMessageDialog(null,"Your Name: "+name+"\n"+"Your Salary: "
+salary,"Info",JOptionPane.PLAIN_MESSAGE);//
	
	}

	

}