

public class Response {
	boolean isAuthenticated=false;
	String username;
	
	Response(boolean isAuthenticated, String username){
		this.isAuthenticated=isAuthenticated;
		this.username=username;
	}
}
