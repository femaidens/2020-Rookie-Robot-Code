/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.DriveTeleopCom;

import com.revrobotics.CANEncoder;
import edu.wpi.first.wpilibj.Joystick;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.Joystick.AxisType;
//import edu.wpi.first.wpilibj.PWMSparkMax
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static CANSparkMax frontLeft = new CANSparkMax(RobotMap.frontLeftPort, MotorType.kBrushless);
	public static CANSparkMax frontRight = new CANSparkMax(RobotMap.frontRightPort,  MotorType.kBrushless);
	public static CANSparkMax rearLeft = new CANSparkMax(RobotMap.rearLeftPort,  MotorType.kBrushless);
	public static CANSparkMax rearRight = new CANSparkMax(RobotMap.rearRightPort,  MotorType.kBrushless);
	public static CANSparkMax middleLeft = new CANSparkMax(RobotMap.middleLeftPort,  MotorType.kBrushless);
	public static CANSparkMax middleRight = new CANSparkMax(RobotMap.middleRightPort,  MotorType.kBrushless);

  public static CANEncoder rightEncoder = frontRight.getEncoder();
  public static CANEncoder leftEncoder = frontLeft.getEncoder();

  //public static AnalogGyro gyro = new AnalogGyro(RobotMap.gyroPort);
    
  //public static DoubleSolenoid gearShift = new DoubleSolenoid(RobotMap.gearShiftPort1, RobotMap.gearShiftPort2);
    
  //public static double time = 3;

	      public DriveTrain() {
        }

        public static void driveJoy() {
            double leftJoy = -OI.joy.getRawAxis(0);
            double rightJoy = OI.joy.getRawAxis(5);
            frontRight.set(rightJoy);
            rearRight.set(rightJoy);
            middleRight.set(rightJoy);
            frontLeft.set(leftJoy);
            rearLeft.set(leftJoy);
            middleLeft.set(leftJoy);
            /*frontRight.setClosedLoopRampRate(time);
	          frontLeft.setClosedLoopRampRate(time);
	          rearRight.setClosedLoopRampRate(time);
            rearLeft.setClosedLoopRampRate(time);
            middleLeft.setClosedLoopRampRate(time);
            middleRight.setClosedLoopRampRate(time);*/
        }
    
        /*
        public static void driveAuton (double l, double r) {
            frontRight.set(r);
            middleRight.set(r);
            rearRight.set(r);
            frontLeft.set(l);
            middleLeft.set(l);
            rearLeft.set(l);
        }
        
        public static void switchGear(){
    /*        if(gearShift.get()==DoubleSolenoid.Value.kReverse){
                gearShift.set(DoubleSolenoid.Value.kForward);
            }
            else{
                gearShift.set(DoubleSolenoid.Value.kReverse);
            }
        */
          
        
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new DriveTeleopCom());

  }
}
