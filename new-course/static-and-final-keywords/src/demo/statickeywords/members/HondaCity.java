package demo.statickeywords.members;

public class HondaCity {
	static long price = 10;
	int a, b;
	
	void display() {
		System.out.println("price: " +price);
	}
	
	static double onRoadPrice(String city) {
		switch (city) {
			case "delhi":
				return price + price * 0.9;
			case "mumbai":
				return price + price * 0.1;
			default:
				return price;
		}
	}
}
