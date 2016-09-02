package org.usfirst.frc.team1360.robot.subsystems;

import org.usfirst.frc.team1360.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    private final Victor DRIVE_LEFT_1 = new Victor(RobotMap.LEFT_MOTOR_1);
    private final Victor DRIVE_LEFT_2 = new Victor(RobotMap.LEFT_MOTOR_2);
    private final Victor DRIVE_RIGHT_1 = new Victor(RobotMap.RIGHT_MOTOR_1);
    private final Victor DRIVE_RIGHT_2 = new Victor(RobotMap.RIGHT_MOTOR_2);
    
    public DriveSubsystem()
    {
    	
    }
    
    public void tankDrive(double left, double right)
    {
    	DRIVE_LEFT_1.set(-left);
    	DRIVE_LEFT_2.set(-left);
    	DRIVE_RIGHT_1.set(right);
    	DRIVE_RIGHT_2.set(right);
    }
    
    public void arcadeDrive(double turn, double speed)
    {
    	double left = (-turn) - speed;
    	double right = (-turn) + speed;
    	
    	tankDrive(left, right);
    }
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

