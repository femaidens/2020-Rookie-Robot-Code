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

    public static int colorMotorPort = 0;
    public static int colorSensorPort = 1;
    public static int DigitalInputPort1 = 2;
    public static int DigitalInputPort2 = 3;
    public static int UltrasonicPingPort = 4;
    public static int UltrasonicEchoPort = 7;
    public static int climbEncoderPortA = 5;
    public static int climbEncoderPortB = 8;
    public static int motorPort = 6;
    public static int joyPort = 9;

    public static I2C.Port i2cPort = I2C.Port.kOnboard;
}
