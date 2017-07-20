package org.usfirst.frc.team5747.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gear extends Subsystem {
	public static final int GEAR_SPEED_RIGHT = 90;
	public static final int GEAR_SPEED_LEFT = 10;
	private Servo Gear_Right;
	private Servo Gear_Left;
	
	public Gear(Servo Gear_Left, Servo Gear_Right){
		this.Gear_Left = Gear_Left;
		this.Gear_Right = Gear_Right;
	}
	public void open (double speed_Right, double speed_Left){
		Gear_Left.set(speed_Right);
		Gear_Right.set(speed_Left);
	}
    

    public void initDefaultCommand() {
        
    }
}

