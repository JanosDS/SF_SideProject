import device.Laptop;

public class Main {
	public static void main(String[] args) {
		DeviceFactory factory = new DeviceFactory();

		Laptop myLaptop = factory.createLaptop();

	}
}