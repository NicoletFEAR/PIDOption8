package org.usfirst.frc.team4786.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//CANTalon ports
	// use instead of magic numbers
	//are final ports
	
	public static final int backLeftPort = 15;
	public static final int backRightPort = 12;
	public static final int frontLeftPort = 14;
	public static final int frontRightPort = 13; //Broken CANTalon, being replaced
	
	public static final double scaling = .6;
	
    //PID Values
    public static final int allowableClosedLoopErrValue = 0;
    public static final int fDriveTrain = 0;
    public static final int pDriveTrain = 0;
    public static final int iDriveTrain = 0;
    public static final int dDriveTrain = 0;
    
	
    /* For example to map the left and right motors, you could define the
     following variables to use with your drivetrain subsystem.
     If you are using multiple modules, make sure to define both the port
     number and the module. 
     
     */
}