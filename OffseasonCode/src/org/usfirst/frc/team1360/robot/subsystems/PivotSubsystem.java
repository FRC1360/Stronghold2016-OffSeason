package org.usfirst.frc.team1360.robot.subsystems;

import org.usfirst.frc.team1360.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PivotSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final Victor PIVOT_MOTOR = new Victor(RobotMap.PIVOTSUBSYSTEM_TILTER);
	private final DigitalInput MAX_SWITCH = new DigitalInput(RobotMap.SHOOTERSUBSYSTEM_SWITCH_UP);
	private final DigitalInput MIN_SWITCH = new DigitalInput(RobotMap.SHOOTERSUBSYSTEM_SWITCH_DOWN);
	

    public PivotSubsystem()
    {
    	
    }
    
    public void setPivot(double Joystick)
    {
    	if(Joystick < 0 && MIN_SWITCH.get() == false)
    	{
    		PIVOT_MOTOR.set(Joystick);
    	}
    	
    	if(Joystick > 0 && MAX_SWITCH.get() == false)
    	{
    		PIVOT_MOTOR.set(Joystick);
    	}
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
}

