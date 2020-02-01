/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
//package org.usfirst.frc.team2265.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANEncoder;
import edu.wpi.first.wpilibj.Joystick;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.Joystick.AxisType;
//import edu.wpi.first.wpilibj.PWMSparkMax

/**
 * Add your docs here.
 */
public class DriveTrain extends SubsystemBase{
	public static CANSparkMax frontLeft = new CANSparkMax(RobotMap.frontLeftPort, MotorType.kBrushless);
	public static CANSparkMax frontRight = new CANSparkMax(RobotMap.frontRightPort,  MotorType.kBrushless);
	public static CANSparkMax rearLeft = new CANSparkMax(RobotMap.rearLeftPort,  MotorType.kBrushless);
	public static CANSparkMax rearRight = new CANSparkMax(RobotMap.rearRightPort,  MotorType.kBrushless);
	public static CANSparkMax middleLeft = new CANSparkMax(RobotMap.middleLeftPort,  MotorType.kBrushless);
	public static CANSparkMax middleRight = new CANSparkMax(RobotMap.middleRightPort,  MotorType.kBrushless);

	public static Joystick joy = new Joystick(RobotMap.joyPort);

	public static CANEncoder rightEncoder = new CANEncoder(frontRight);
	public static CANEncoder leftEncoder = new CANEncoder(frontLeft);

	public static AnalogGyro gyro = new AnalogGyro(RobotMap.gyroPort);

	    public DriveTrain() {
        }

        public static void driveJoy() {
            double leftJoy = joy.getRawAxis(1);
            double rightJoy = joy.getRawAxis(2);
            frontRight.set(rightJoy);
            rearRight.set(rightJoy);
            middleRight.set(rightJoy);
            frontLeft.set(leftJoy);
            rearLeft.set(leftJoy);
            middleLeft.set(leftJoy);
        }
    
        public static void driveAuton(double l, double r) {
                frontRight.set(r);
                middleRight.set(r);
                rearRight.set(r);
                frontLeft.set(l);
                middleLeft.set(l);
                rearLeft.set(l);
            }
    }   

