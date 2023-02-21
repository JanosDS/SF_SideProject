package device;

import device.component.Component;
import device.component.PowerUsage;

import java.util.ArrayList;

public abstract class Device {

	public abstract void addComponent();
	public abstract void connectPeripheral();
	public abstract DeviceType getDeviceType();
	public abstract String runIdle();
	public abstract ArrayList<PowerUsage> getPowerUsers();
	public abstract ArrayList<Component> getComponents();
}
