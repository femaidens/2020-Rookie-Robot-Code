/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.AdjustHoodCom;
import frc.robot.commands.AutoAlignCom;
import frc.robot.commands.DriveTeleopCom;
import frc.robot.commands.IntakeBallCom;
import frc.robot.commands.OuttakeBallCom;
import frc.robot.commands.ShootCom;
import frc.robot.commands.StageThreeCom;
import frc.robot.commands.StageTwoCom;
import frc.robot.commands.SwitchGearCom;
import edu.wpi.first.wpilibj.buttons.*;
//import edu.wpi.first.wpilibj.command.Command;
//import frc.robot.commands.*;


public class OI {

    public static Joystick joy = new Joystick(RobotMap.joyPort);
    /*
    public static Button two = new JoystickButton(joy,11);
    public static Button three = new JoystickButton(joy,2);
    public static Button shoot = new JoystickButton(joy,3);
	public static Button intakeBall = new JoystickButton(joy,4);
	public static Button outtakeBall = new JoystickButton(joy,5);
    public static Button hood = new JoystickButton(joy,6);
    public static Button autoAlign = new JoystickButton(joy,7);
    public static Button shiftGear = new JoystickButton(joy, 8);
    public static Button driveTeleop = new JoystickButton(joy,9);
    */
    public static Button drive = new JoystickButton(joy,1);

    public static void bindButtons() {
        drive.toggleWhenPressed(new DriveStraightCom(80.0));
       /*
        two.whenPressed(new StageTwoCom());
        three.whenPressed(new StageThreeCom());
        shoot.whileHeld(new ShootCom());
        intakeBall.whileHeld(new IntakeBallCom());
        outtakeBall.whileHeld(new OuttakeBallCom());
        autoAlign.whenPressed(new AutoAlignCom());
        shiftGear.whenPressed(new SwitchGearCom());
        driveTeleop.whenPressed(new DriveTeleopCom());
        hood.whenPressed(new AdjustHoodCom(0));
        */

    }

}