package org.usfirst.frc.team1360.robot.util;

import org.usfirst.frc.team1360.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team1360.robot.subsystems.ShintakeSubsystem;

public class Subsystems {
	
	public static DriveSubsystem DRIVE_SUBSYSTEM;
	public static ShintakeSubsystem SHINTAKE_SUBSYSTEM;
	
	public Subsystems()
	{
		DRIVE_SUBSYSTEM = new DriveSubsystem();
		SHINTAKE_SUBSYSTEM = new ShintakeSubsystem();
	}
}
