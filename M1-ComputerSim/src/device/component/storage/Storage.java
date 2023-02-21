package device.component.storage;

import device.component.Component;
import device.component.Coolable;
import device.component.PowerUsage;

public class Storage implements PowerUsage, Coolable, Component {
	private final int gbSize;
	private final int baseSpeed;
	private final int basePowerUsage;
	private final boolean isOverclockable;
	private int speed;
	private final StorageType type;
	private String name;

	public Storage(int gbSize, int baseSpeed, int basePowerUsage, boolean isOverclockable, StorageType type, String name) {
		this.gbSize = gbSize;
		this.baseSpeed = baseSpeed;
		this.basePowerUsage = basePowerUsage;
		this.isOverclockable = isOverclockable;
		this.type = type;
		this.name = name;
	}

	@Override
	public double getPowerUsage() {
		return 0;
	}
}
