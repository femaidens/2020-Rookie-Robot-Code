/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimberCom extends Command {
  public ClimberCom() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  @Override
  protected void initialize(){
		Climb.climbEncoder.reset();
	}

  @Override
	protected void execute(){
		Climb.start();
		Climb.stop();
	}

  @Override
	protected boolean isFinished(){
		return false;
	}

  @Override
	protected void end(){
		Climb.down();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

  
}
