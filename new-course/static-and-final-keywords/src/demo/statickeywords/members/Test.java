package demo.statickeywords.members;

public class Test {

	public static void main(String[] args) {
		HondaCity hondaCity = new HondaCity();
		HondaCity.onRoadPrice("delhi");
		hondaCity.onRoadPrice("mumbai");
		System.out.println(HondaCity.price);

	}

}
