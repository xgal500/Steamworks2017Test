package org.usfirst.frc.team5747.robot.commands;

import org.usfirst.frc.team5747.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearCommand extends Command {
	private double speed_Left;
	private double speed_Right;

    public GearCommand(double speed_Left, double speed_Right) {
        requires(Robot.gear);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gear.open(speed_Left, speed_Right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return	isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gear.open(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
