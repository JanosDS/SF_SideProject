package device.component.storage;

public enum StorageType {
	HDD("HDD"),
	SSD("SSD");

	private String type;

	StorageType(String type) {
		this.type = type;
	}
}
