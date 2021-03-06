package org.usfirst.frc.team1360.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	static final int JOYSTICK_DRIVER = 0;
	static final int JOYSTICK_OPERATOR = 1;
	
	public static final int LEFT_MOTOR_1 = 0;
	public static final int LEFT_MOTOR_2 = 1;
	public static final int RIGHT_MOTOR_1 = 2;
	public static final int RIGHT_MOTOR_2 = 3;
	
	public static final int INTAKE_MOTOR = 4;
	
	public static final int PIVOTSUBSYSTEM_TILTER = 5;
	
	public static final int SHOOTERSUBSYSTEM_SWITCH_DOWN = 1;
    public static final int SHOOTERSUBSYSTEM_SWITCH_UP = 2;
	
	public static final int DRIVE_SOLENOID = 0;
}
