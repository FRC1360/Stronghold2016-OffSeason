package org.usfirst.frc.team1360.robot.commands;

import org.usfirst.frc.team1360.robot.OI;
import org.usfirst.frc.team1360.robot.util.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PivotCommand extends Command {

    public PivotCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Subsystems.DRIVE_SUBSYSTEM);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Subsystems.PIVOT_SUBSYSTEM.setPivot(OI.getOperatorPivot());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
