package org.usfirst.frc.team5747.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public interface PWM{
		public static final int DRIVE_LEFT_MOTOR_ONE = 0;
		public static final int DRIVE_LEFT_MOTOR_TWO = 1;
		public static final int DRIVE_RIGHT_MOTOR_ONE = 2;
		public static final int DRIVE_RIGHT_MOTOR_TWO = 3;
		public static final int WHEEL_MOTOR = 4;
		public static final int INTAKE_MOTOR = 5;
		public static final int GEAR_MOTOR_RIGHT = 6;
		public static final int GEAR_MOTOR_LEFT = 7;
		public static final int CLIMB_MOTOR = 8;
		
	}
	public interface BUTTONS{
		public static final int SHOOT = 0;
		public static final int INTAKE_BALLS = 1;
		public static final int GEAR_OPEN = 2;
		public static final int CLIMB_MOTOR = 3;
	}
}
