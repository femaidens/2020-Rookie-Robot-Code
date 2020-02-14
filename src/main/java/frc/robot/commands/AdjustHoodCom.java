/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.Shooter;

public class AdjustHoodCom extends Command {
  public int desiredTicks;
  public AdjustHoodCom(int ticks) {
    // Use requires() here to declare subsystem dependencies
    //desiredTicks=ticks;

    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
<<<<<<< HEAD
    //Shooter.adjustHood(desiredTicks);
=======
   // Shooter.adjustHood(desiredTicks);
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
<<<<<<< HEAD
   // Shooter.hoodMotor.set(0.0);
=======
    //Shooter.hoodMotor.set(0.0);
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}

