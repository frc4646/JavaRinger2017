package org.usfirst.frc.team4646.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;

import org.usfirst.frc.team4646.robot.MotorPin;
import org.usfirst.frc.team4646.robot.commands.MecanumDrive;

/**
 *
 */
public class MecanumDriveTrain extends Subsystem {
	
	private Spark frontLeft, frontRight, backLeft, backRight;
	private RobotDrive rb;
	private ADXRS450_Gyro gyro;
	
	public MecanumDriveTrain(MotorPin fl, MotorPin fr, MotorPin bl, MotorPin br) {
		frontLeft = new Spark(fl.ordinal());
		frontRight = new Spark(fr.ordinal());
		backLeft = new Spark(bl.ordinal());
		backRight = new Spark(br.ordinal());
		rb = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
		gyro = new ADXRS450_Gyro();
		gyro.calibrate();
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    		setDefaultCommand(new MecanumDrive());
    }
    
    public void STAHP() {
    		frontLeft.set(0.0);
    		frontRight.set(0.0);
    		backLeft.set(0.0);
    		backRight.set(0.0);
    }
    
    public void stop() {
    		STAHP();
    }
    
    public void joystickDrive(Joystick rotation, Joystick movement) {
    		rb.mecanumDrive_Cartesian(movement.getRawAxis(0), movement.getRawAxis(1), rotation.getRawAxis(0), getHeading());
    }
    
    public double getHeading() {
    		return -gyro.getAngle();
    }
}

