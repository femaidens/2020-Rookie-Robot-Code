/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
//package com.revrobotics;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DriverStation;
import com.revrobotics.ColorSensorV3;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.ColorSensorV3.RawColor;
import frc.robot.RobotMap;


public class ColorWheel extends SubsystemBase {
  /**
   * Creates a new ColorWhel.
   */
  public ColorWheel() {

  }
  
    public static CANSparkMax colorMotor = new CANSparkMax(RobotMap.colorMotorPort,MotorType.kBrushless);
    public static ColorSensorV3 colorSensor = new ColorSensorV3(RobotMap.i2cPort);

    //gets initial color RGB values//
  public static ColorSensorV3.RawColor getInitialColor() {
    ColorSensorV3.RawColor color = colorSensor.getRawColor();
    return color;
  }

    // spins wheel 4 revolutions (stage 2)//
    public static void spinTwo()
    {
      int count = 0;
      while (count < 8) {
        colorMotor.set(1.0);
        if (colorSensor.getRawColor() == getInitialColor()) {
          count++;
        }
      }
      colorMotor.set(0.);
    }

    // stage 3
    public static ColorSensorV3.RawColor getTargetColor() {
      final String gameData = DriverStation.getInstance().getGameSpecificMessage();
      if (gameData == "B"){
        return new RawColor(255,0,0,0);
      } else if (gameData.equals("R")){
        return new RawColor(0,255,255,0);
      } else if (gameData.equals("Y")) {
        return new RawColor(0,255,0,0);
      } else if (gameData.equals("G")) {
        return new RawColor(255,255,0,0);
      }
      return new RawColor(0,0,0,0);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
