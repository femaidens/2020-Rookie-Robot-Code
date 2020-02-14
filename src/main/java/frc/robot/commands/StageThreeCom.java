/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.ColorWheel;

import com.revrobotics.ColorSensorV3;

public class StageThreeCom extends Command {
  public StageThreeCom() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called when the command is initially scheduled.
  @Override
  protected void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  protected void execute() {
<<<<<<< HEAD
    //ColorSensorV3.RawColor target = ColorWheel.getTargetColor();
    /*while (ColorWheel.colorSensor.getRawColor() != target) {
=======
    /*ColorSensorV3.RawColor target = ColorWheel.getTargetColor();
    while (ColorWheel.colorSensor.getRawColor() != target) {
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
      //ColorWheel.colorMotor.set(1.0);
      System.out.println("Ludmilla is a meanie");
    } */
    
    System.out.println("Kathryn is a meanie");*/
  }

  // Returns true when the command should end.
  @Override
  protected boolean isFinished() {
    return false;
  }

  protected void end() {
		//ColorWheel.colorMotor.stopMotor();
  }
  
  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
