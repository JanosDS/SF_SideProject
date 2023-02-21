package device;

import device.component.Component;
import device.component.PowerUsage;
import device.component.processor.Processor;
import device.component.ram.Ram;
import device.component.screen.Screen;
import device.component.storage.Storage;

import java.util.ArrayList;

public class Laptop extends Device {
	private final DeviceType deviceType = DeviceType.LAPTOP;

	private Processor processor;
	private Ram ram;
	private Screen screen;
	private Storage storage;

	public Laptop(Processor processor, Ram ram, Screen screen, Storage storage) {
		this.processor = processor;
		this.ram = ram;
		this.screen = screen;
		this.storage = storage;
	}

	@Override
	public ArrayList<Component> getComponents() {
		return null;
	}

	@Override
	public ArrayList<PowerUsage> getPowerUsers() {

		return null;
	}

	@Override
	public DeviceType getDeviceType() {
		return deviceType;
	}

	@Override
	public void addComponent() {

	}

	@Override
	public String runIdle() {
		return null;
	}

	@Override
	public void connectPeripheral() {

	}
}
