/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Shooter;

public class IntakeBallCom extends Command {
  public IntakeBallCom() {
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
    /*int sensorVar = 0;
    if (sensorVar < 5) {
      //Shooter.intakeBall();
    } else {
      //Shooter.fold();
    }
<<<<<<< HEAD
    //Shooter.moveBeltIn();  
=======
    Shooter.moveBeltIn();*/
>>>>>>> 7dba90c71459fa8fa08a87190fccd9dc56acd8ae
  }

  // Returns true when the command should end.
  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    //Shooter.ballMotor.set(0.0);
	  //Shooter.foldMotor.set(0.0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
