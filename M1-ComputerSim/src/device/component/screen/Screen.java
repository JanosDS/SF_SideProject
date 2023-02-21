package device.component.screen;

import device.component.Component;
import device.component.PowerUsage;

public class Screen implements PowerUsage, Component {

	public Screen() {
	}

	@Override
	public double getPowerUsage() {
		return 0;
	}
}
