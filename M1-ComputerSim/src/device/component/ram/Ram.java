package device.component.ram;

import device.component.Component;
import device.component.PowerUsage;

public class Ram implements PowerUsage, Component {
	public Ram() {
	}

	@Override
	public double getPowerUsage() {
		return 0;
	}
}
