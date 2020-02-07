/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Shooter;

public class ShootCom extends Command {
  public ShootCom() {
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
    Shooter.shoot();
  }

  // Returns true when the command should end.
  @Override
  protected boolean isFinished() {
    return false;
  }

  protected void end() {
  }
  
  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
