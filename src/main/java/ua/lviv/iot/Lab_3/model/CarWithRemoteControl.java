package ua.lviv.iot.Lab_3.model;

public class CarWithRemoteControl extends Car {

	private int batteryCapacityInMah;

	public CarWithRemoteControl(double priceInUAH, int ageGroup, Size size, String color, int doorCount, int lengthInMM,
			int batteryCapacityInMah) {
		super(priceInUAH, ageGroup, size, color, doorCount, lengthInMM);
		this.batteryCapacityInMah = batteryCapacityInMah;
	}

	public int getBatteryCapacityInMah() {
		return batteryCapacityInMah;
	}

	public void setBatteryCapacityInMah(int batteryCapacityInMah) {
		this.batteryCapacityInMah = batteryCapacityInMah;
	}

}
