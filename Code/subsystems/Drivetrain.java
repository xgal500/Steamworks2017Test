package org.usfirst.frc.team5747.robot.subsystems;

import org.usfirst.frc.team5747.robot.commands.DriveByJoysticks;
import org.usfirst.frc.team5747.util.Gearbox;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private Gearbox leftDrive;
	private Gearbox rightDrive;
	
	public Drivetrain (Gearbox leftDrive, Gearbox rightDrive){
		this.leftDrive = leftDrive;
		this.rightDrive = rightDrive;
	}
	public void move (double leftSpeed, double rightSpeed){
		leftDrive.set(-leftSpeed);
		rightDrive.set(rightSpeed);
	}
    

    public void initDefaultCommand() {
        setDefaultCommand(new DriveByJoysticks ());
    }

}

