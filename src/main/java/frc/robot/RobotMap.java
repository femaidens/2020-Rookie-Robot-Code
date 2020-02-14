/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.I2C;
//import edu.wpi.first.wpilibj.I2C.Port;

/**
 * Add your docs here.
 */
public class RobotMap {

    public static int colorMotorPort = 100;
    public static int colorSensorPort = 98;
    public static int DigitalInputPort1 = 99;
    public static int DigitalInputPort2 = 3;
    public static int UltrasonicPingPort = 44;
    public static int UltrasonicEchoPort = 7;
    public static int climbEncoderPortA = 5;
    public static int climbEncoderPortB = 8;
    public static int motorPort = 6;
    public static int joyPort = 0;
    public static int frontLeftPort = 2;
    public static int rearLeftPort = 1;
    public static int middleLeftPort = 4;
    public static int frontRightPort = 12;
    public static int rearRightPort = 14;
    public static int middleRightPort = 11;
    public static int gyroPort = 18;
    public static int foldMotorPort = 19;
    public static int intakeMotorPort = 20;
    public static int foldLimitPort = 21;
    public static int hopperMotor1Port = 22;
    public static int hopperMotor2Port = 23;
    public static int hopperMotor3Port = 24;
    public static int turretMotorPort = 25;
    public static int turretLimit1Port = 26;
    public static int turretLimit2Port = 27;
    public static int hoodMotorPort = 28;
    public static int shooterMotorPort = 29;
    public static int gearShiftPort1 = 30;
    public static int gearShiftPort2 = 31;
    public static int absEncoderPort = 32;



    public static I2C.Port i2cPort = I2C.Port.kOnboard;
}
