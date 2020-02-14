/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.ColorWheel;

public class StageTwoCom extends Command {
  public StageTwoCom() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //ColorWheel.getInitialColor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  protected void execute() {
 //   ColorWheel.spinTwo();
  }

  // Returns true when the command should end.
  @Override
  protected boolean isFinished() {
    return false;
  }
  
  @Override
  protected void end() {
    //ColorWheel.colorMotor.stopMotor();
  }

  @Override
  protected void interrupted() {
  }
}
