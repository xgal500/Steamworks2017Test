package org.usfirst.frc.team5747.robot;

import org.usfirst.frc.team5747.robot.commands.ClimbCommand;
import org.usfirst.frc.team5747.robot.commands.FeederCommand;
import org.usfirst.frc.team5747.robot.commands.GearCommand;
import org.usfirst.frc.team5747.robot.commands.ShootCommand;
import org.usfirst.frc.team5747.robot.subsystems.Climber;
import org.usfirst.frc.team5747.robot.subsystems.Feeder;
import org.usfirst.frc.team5747.robot.subsystems.Gear;
import org.usfirst.frc.team5747.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick rightJoystick = new Joystick(0);
	private Joystick leftJoystick = new Joystick(1);
	private JoystickButton shootingButton;
	private JoystickButton intakeButton;
	private JoystickButton gearButton;
	private JoystickButton climbButton;

	public OI() {
		shootingButton = new JoystickButton(rightJoystick, RobotMap.BUTTONS.SHOOT);
		intakeButton = new JoystickButton(rightJoystick, RobotMap.BUTTONS.INTAKE_BALLS);
		gearButton = new JoystickButton(rightJoystick, RobotMap.BUTTONS.GEAR_OPEN);
		climbButton = new JoystickButton(rightJoystick, RobotMap.BUTTONS.CLIMB_MOTOR);
		driver();

	}

	public void driver() {
		shootingButton.toggleWhenPressed(new ShootCommand(Shooter.SHOOTING_SPEED));
		intakeButton.whenPressed(new FeederCommand(Feeder.INTAKE_SPEED));
		gearButton.whenPressed(new GearCommand(Gear.GEAR_SPEED_LEFT, Gear.GEAR_SPEED_RIGHT));
		climbButton.whenPressed(new ClimbCommand(Climber.CLIMB_FAST_SPEED));
	}

	public double getLeftY() {
		return Math.pow(leftJoystick.getY(), 3);

	}

	public double getRightY() {
		return Math.pow(rightJoystick.getY(), 3);

	}
}