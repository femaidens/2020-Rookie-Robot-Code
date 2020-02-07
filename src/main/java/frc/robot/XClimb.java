/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
//package edu.wpi.first.wpilibj;
//package com.revrobotics;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.DigitalInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Joystick;


public class XClimb extends SubsystemBase {
  /**
   * Creates a new Climb.
   */
  public XClimb() {

  }

  	public static DigitalInput limitBottom = new DigitalInput(RobotMap.DigitalInputPort1);
	public static DigitalInput limitTop = new DigitalInput(RobotMap.DigitalInputPort2);
	public static Ultrasonic ultra = new Ultrasonic(RobotMap.UltrasonicPingPort,RobotMap.UltrasonicEchoPort);
	public static Encoder climbEncoder = new Encoder(RobotMap.climbEncoderPortA,RobotMap.climbEncoderPortB);
	public static CANSparkMax motor = new CANSparkMax(RobotMap.motorPort,MotorType.kBrushless);
	public static Joystick joy = new Joystick(RobotMap.joyPort);

	public static double distance;

	  //detects height range of climb bar in inches// 
	public static void start(){
		if (ultra.getRangeInches() > 36 && ultra.getRangeInches() < 84) {
			motor.set(1.0);
      		distance = climbEncoder.getDistance();
		}else{
			motor.set(0.0);
		}
	} 

	public static void stop(){
		if (limitBottom.get() == true || limitTop.get() == true) {
			motor.set(0.0);
		}
	}

	public static void down() {
		climbEncoder.reset();
		while (climbEncoder.getDistance() < distance) {
			motor.set(joy.getRawAxis(1));
		}
		motor.stopMotor();
	}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
