
public class Car implements CarInfo {
	int carId,quantity,year;
	String model,manufacturer,type;
	double price;
	Car(){}//
	Car(int carId, String manufacturer, int year, String model, String type, double price,int quantity){
		super();// Constructor
		this.carId=carId;
		this.model=model;
		this.year=year;
		this.manufacturer=manufacturer;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
	}
	public String display() {
		return ("Id: "+this.carId+"\nManufacturer: "
	+this.manufacturer+"\nYear: "+this.year+"\nModel: "+this.model+"\nType: "+this.type
	+"\nPrice: "+this.price+"\nCars in Stock: "+this.quantity);
	}


}
