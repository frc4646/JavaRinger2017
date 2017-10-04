package org.usfirst.frc.team4646.robot;

public enum MotorPin {
	M1(0),
	M2(1),
	M3(2),
	M4(3),
	M5(4),
	M6(5),
	M7(6),
	M8(7),
	M9(8);
	
	private int asInt;
	
	private MotorPin(int value) {
		asInt = value;
	}
	
	public int toInt() {
		return asInt;
	}
}
