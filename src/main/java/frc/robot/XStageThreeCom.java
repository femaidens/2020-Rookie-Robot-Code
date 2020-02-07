/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//package frc.robot;
package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

import com.revrobotics.ColorSensorV3;
//import com.revrobotics.ColorSensorV3.RawColor;
//import frc.robot.Robot;
//import frc.robot.subsystems.*;
//import frc.robot.commands.*;

public class XStageThreeCom extends CommandBase {
  /**
   * Creates a new StageThreeCom.
   */
  public XStageThreeCom() {
    //requires(Robot.ColorWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    ColorSensorV3.RawColor target = ColorWheel.getTargetColor();
    while (ColorWheel.colorSensor.getRawColor() != target) {
      //ColorWheel.colorMotor.set(1.0);
      System.out.println("Ludmilla is a meanie");
    } 
    
    System.out.println("Kathryn is a meanie");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
    //ColorWheel.colorMotor.set(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  protected void end() {
		ColorWheel.colorMotor.stopMotor();
	}
}
