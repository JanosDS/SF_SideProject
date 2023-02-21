import device.Laptop;
import device.component.processor.Processor;
import device.component.ram.Ram;
import device.component.screen.Screen;
import device.component.storage.Storage;
import device.component.storage.StorageType;

public class DeviceFactory {

	public Laptop createLaptop(){
		Processor processor = createProcessor();
		Storage storage = createStorage();
		Screen screen = createScreen();
		Ram ram = createRam();
		return new Laptop(processor,ram, screen, storage);
	}

	private Processor createProcessor(){
		return new Processor(12, true, 3.0, 7.0, 130);
	}

	private Storage createStorage(){
		return new Storage(500, 2500, 20, true, StorageType.SSD, "Schijf C");
	}
	private Screen createScreen(){
		return new Screen();
	}
	private Ram createRam(){
		return new Ram();
	}
}
