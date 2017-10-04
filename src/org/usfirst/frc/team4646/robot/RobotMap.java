package org.usfirst.frc.team4646.robot;

import org.usfirst.frc.team4646.robot.MotorPin;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	// BEGIN mecanum
	public static MotorPin frontLeft = MotorPin.M1;
	public static MotorPin frontRight = MotorPin.M2;
	public static MotorPin backLeft = MotorPin.M3;
	public static MotorPin backRight = MotorPin.M4;
	// END mecanum
}
