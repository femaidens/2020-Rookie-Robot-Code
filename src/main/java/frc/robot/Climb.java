/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.DigitalInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;

public class Climb extends Subsystem {

  public Climb() {

  }

<<<<<<< HEAD
  /*	public static DigitalInput limitBottom = new DigitalInput(RobotMap.DigitalInputPort1);
=======
  	/*public static DigitalInput limitBottom = new DigitalInput(RobotMap.DigitalInputPort1);
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
	public static DigitalInput limitTop = new DigitalInput(RobotMap.DigitalInputPort2);
	public static Ultrasonic ultra = new Ultrasonic(RobotMap.UltrasonicPingPort,RobotMap.UltrasonicEchoPort);
	public static Encoder climbEncoder = new Encoder(RobotMap.climbEncoderPortA,RobotMap.climbEncoderPortB);
	public static CANSparkMax motor = new CANSparkMax(RobotMap.motorPort,MotorType.kBrushless);
	public static Joystick joy = new Joystick(RobotMap.joyPort);

	public static double distance;
*/
	//detects height range of climb bar in inches// 
	public static void start(){
<<<<<<< HEAD
	/*	if (ultra.getRangeInches() > 36 && ultra.getRangeInches() < 84) {
=======
		/*if (ultra.getRangeInches() > 36 && ultra.getRangeInches() < 84) {
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
			motor.set(1.0);
      		distance = climbEncoder.getDistance();
		}else{
			motor.set(0.0);
		}*/
	} 

	public static void stop(){
		/*if (limitBottom.get() == true || limitTop.get() == true) {
			motor.set(0.0);
		}*/
	}

	public static void down() {
		/*climbEncoder.reset();
		while (climbEncoder.getDistance() < distance) {
			motor.set(joy.getRawAxis(1));
		}
<<<<<<< HEAD
		motor.stopMotor();
	*/
=======
		motor.stopMotor();*/
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
	}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
