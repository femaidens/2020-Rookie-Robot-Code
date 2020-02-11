/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.DriveTrain;

public class DriveStraightCom extends Command {
	
	double desiredTicks;

	public DriveStraightCom(int ticks) {
		//requires(Robot.drivetrain);
		desiredTicks = ticks;
	}

  @Override
	protected void initialize() {
		DriveTrain.rightEncoder.reset();
		DriveTrain.leftEncoder.reset();
	}


  @Override
	protected void execute() {
		DriveTrain.frontRight.set(0.10);
		DriveTrain.frontLeft.set(0.10);
		DriveTrain.rearRight.set(0.10);
		DriveTrain.rearLeft.set(0.10);
		
		if (leftEncoder.get() < desiredTicks && rightEncoder.get() < desiredTicks) {
			if (leftEncoder.get() < rightEncoder.get()){
				DriveTrain.frontRight.set(0.1);
				DriveTrain.rearRight.set(0.1);
				DriveTrain.frontLeft.set(0.15);
				DriveTrain.rearLeft.set(0.15);
			}
			else if (leftEncoder.get() > rightEncoder.get()){
				DriveTrain.frontRight.set(0.15);
				DriveTrain.rearRight.set(0.15);
				DriveTrain.frontLeft.set(0.1);
				DriveTrain.rearLeft.set(0.1);
			}
			else {
				DriveTrain.frontRight.set(0.1);
				DriveTrain.rearRight.set(0.1);
				DriveTrain.frontLeft.set(0.1);
				DriveTrain.rearLeft.set(0.1);

			}
		}
    }

  @Override
	protected boolean isFinished() {
		return false;
	}

  @Override
	protected void end() {
		DriveTrain.leftEncoder.reset();
		DriveTrain.rightEncoder.reset();
  	}
  
	@Override
	protected void interrupted() {

	}
}
