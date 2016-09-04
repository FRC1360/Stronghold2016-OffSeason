package org.usfirst.frc.team1360.robot.util;

import org.usfirst.frc.team1360.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team1360.robot.subsystems.ShintakeSubsystem;
import org.usfirst.frc.team1360.robot.subsystems.PivotSubsystem;

public class Subsystems {
	
	public static DriveSubsystem DRIVE_SUBSYSTEM;
	public static ShintakeSubsystem SHINTAKE_SUBSYSTEM;
	public static PivotSubsystem PIVOT_SUBSYSTEM;
	
	public Subsystems()
	{
		DRIVE_SUBSYSTEM = new DriveSubsystem();
		SHINTAKE_SUBSYSTEM = new ShintakeSubsystem();
		PIVOT_SUBSYSTEM = new PivotSubsystem();
	}
}
