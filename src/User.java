public  abstract class User {
	int id;
	User() {
	}
	User(int id){  //Constructor
		this.id=id;		
	}
	public abstract void display();

	public void setPassword(String password) {
		
	}
	public abstract String getPassword();

}
