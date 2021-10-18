package demo.phone;

public class DemoPhone {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		Phone phone = smartPhone;
		Camera camera = smartPhone;
		MusicPlayer musicPlayer = smartPhone;
	}
}
