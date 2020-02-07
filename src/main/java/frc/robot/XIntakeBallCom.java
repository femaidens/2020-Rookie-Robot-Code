/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class XIntakeBallCom extends CommandBase {
  /**
   * Creates a new IntakeCom.
   */
  public XIntakeBallCom() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    int sensorVar = 0;
    if (sensorVar < 5) {
      Shooter.intakeBall();
    } else {
      Shooter.fold();
    }
    Shooter.moveBeltIn();  
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  protected void end() {
    Shooter.ballMotor.set(0.0);
	  Shooter.foldMotor.set(0.0);

  }
}
