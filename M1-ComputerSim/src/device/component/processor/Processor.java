package device.component.processor;

import device.component.Component;
import device.component.Coolable;
import device.component.PowerUsage;

public class Processor implements PowerUsage, Coolable, Component {
	private final int coreCount;
	private final boolean hasHyperthreading;
	private final double baseClockSpeed;
	private final double maxClockSpeed;
	private final double basePowerUsage;
	private final ProcessorBrand brand;
	private double clockSpeed;

	private String name;

	public Processor(int coreCount, boolean hasHyperthreading, double baseClockSpeed, double maxClockSpeed, double basePowerUsage) {
		this.coreCount = coreCount;
		this.hasHyperthreading = hasHyperthreading;
		this.baseClockSpeed = baseClockSpeed;
		this.maxClockSpeed = maxClockSpeed;
		this.basePowerUsage = basePowerUsage;
		this.brand = ProcessorBrand.INTEL;
		setClockSpeed(baseClockSpeed);
	}

	public void setClockSpeed(double clockSpeed) {
		if(clockSpeed > maxClockSpeed){
			this.clockSpeed = maxClockSpeed;
		}
		else{
			this.clockSpeed = clockSpeed;
		}
	}

	@Override
	public double getPowerUsage() {
		return basePowerUsage *(clockSpeed/baseClockSpeed);
	}
}
