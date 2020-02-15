/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.DriveTrain;
import frc.robot.Robot;

public class DriveStraightCom extends Command {
	
	public int desiredTicks;
	public double speed;
	public double adjustSpeed;

	public DriveStraightCom(int ticks, double speedInput, double adjust) {
		requires(Robot.drivetrain);
		desiredTicks = ticks;
		speed = speedInput;
		adjustSpeed = adjust;
	}

  @Override
	protected void initialize() {
		DriveTrain.rightEncoder.setPosition(0.0);
		DriveTrain.leftEncoder.setPosition(0.0);
	}


  @Override
	protected void execute() {
		DriveTrain.frontRight.set(speed);
		DriveTrain.frontLeft.set(speed);
		DriveTrain.middleLeft.set(speed);
		DriveTrain.rearRight.set(speed);
		DriveTrain.rearLeft.set(speed);
		DriveTrain.middleRight.set(speed);
		
		if (DriveTrain.leftEncoder.getPosition() < desiredTicks && DriveTrain.rightEncoder.getPosition() < desiredTicks) {
			if (DriveTrain.leftEncoder.getPosition() < DriveTrain.rightEncoder.getPosition()){
				DriveTrain.frontRight.set(-adjustSpeed);
				DriveTrain.rearRight.set(-adjustSpeed);
				DriveTrain.middleRight.set(-adjustSpeed);
				DriveTrain.frontLeft.set(adjustSpeed);
				DriveTrain.rearLeft.set(adjustSpeed);
				DriveTrain.middleLeft.set(adjustSpeed);
			}
			else if (DriveTrain.leftEncoder.getPosition() > DriveTrain.rightEncoder.getPosition()){
				DriveTrain.frontRight.set(-adjustSpeed);
				DriveTrain.rearRight.set(-adjustSpeed);
				DriveTrain.middleRight.set(-adjustSpeed);
				DriveTrain.frontLeft.set(adjustSpeed);
				DriveTrain.rearLeft.set(adjustSpeed);
				DriveTrain.middleLeft.set(adjustSpeed);
			}
			else {
				DriveTrain.frontRight.set(-adjustSpeed);
				DriveTrain.rearRight.set(-adjustSpeed);
				DriveTrain.middleRight.set(-adjustSpeed);
				DriveTrain.frontLeft.set(adjustSpeed);
				DriveTrain.rearLeft.set(adjustSpeed);
				DriveTrain.middleLeft.set(adjustSpeed);
			}
		}
		else{
			DriveTrain.frontRight.set(0);
			DriveTrain.rearRight.set(0);
			DriveTrain.middleRight.set(0);
			DriveTrain.frontLeft.set(0);
			DriveTrain.rearLeft.set(0);
			DriveTrain.middleLeft.set(0);
		}
    }

  @Override
	protected boolean isFinished() {
		return false;
	}

  @Override
	protected void end() {
		DriveTrain.leftEncoder.setPosition(0.0);
		DriveTrain.rightEncoder.setPosition(0.0);
  	}
  
	@Override
	protected void interrupted() {

	}
}
