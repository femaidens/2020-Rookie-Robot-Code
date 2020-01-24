/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class StageTwoCom extends CommandBase {
  /**
   * Creates a new StageTwoCom.
   */
  public StageTwoCom() {
    //requires(Robot.ColorWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    ColorWheel.getInitialColor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    ColorWheel.spinTwo();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  public void end() {
    ColorWheel.colorMotor.stopMotor();
  }
}
