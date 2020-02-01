/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


/**
 * Add your docs here.
 */
public class Shooter extends SubsystemBase{


    //draft code for the limelight part (look at last year's github, ask us, etc.)
    // intake instantiations
    public static CANSparkMax foldMotor = new CANSparkMax(RobotMap.foldMotorPort,MotorType.kBrushless);
    public static CANSparkMax ballMotor = new CANSparkMax(RobotMap.intakeMotorPort,MotorType.kBrushless);
    public static DigitalInput foldLimit = new DigitalInput(RobotMap.foldLimitPort);

    // hopper instantiations
    public static CANSparkMax hopperMotor1 = new CANSparkMax(RobotMap.hopperMotor1Port,MotorType.kBrushless);
    public static CANSparkMax hopperMotor2 = new CANSparkMax(RobotMap.hopperMotor2Port,MotorType.kBrushless);
    public static CANSparkMax shooterHood = new CANSparkMax(RobotMap.hopperMotor3Port,MotorType.kBrushless);

    // turret instantiations
    public static CANSparkMax turretMotor = new CANSparkMax(RobotMap.turretMotorPort,MotorType.kBrushless);
    public static DigitalInput turretRightLimit = new DigitalInput(RobotMap.turretLimit1Port);
    public static DigitalInput turretLeftLimit = new DigitalInput(RobotMap.turretLimit2Port);

    //shooter instantiations
    public static CANSparkMax hoodMotor = new CANSparkMax(RobotMap.hoodMotorPort,MotorType.kBrushless);
    public static CANSparkMax shooterMotor = new CANSparkMax(RobotMap.shooterMotorPort,MotorType.kBrushless);   

    public Shooter() {
    }

    // intake 
    public static void intakeBall(){
        ballMotor.set(1.0);
    }

    public static void fold(){
        while(foldLimit.get() != true){
            foldMotor.set(-1.0);
        }
        foldMotor.set(0.0);
    }

    //outtake 
    public static void outtakeBall() {
        ballMotor.set(-1.0);
        foldMotor.set(1.0);
    }

    // hopper
    public static void moveBeltIn() {
        int countVar = 0;
        if (countVar < 5) {
            hopperMotor1.set(1.0);
            hopperMotor2.set(1.0);
            countVar++;
        } else {
            hopperMotor1.set(0.0);
            hopperMotor2.set(0.0);
        }
    }
    
    // turret
    public static void turret() {
        while (turretRightLimit.get() == true || turretLeftLimit.get() == true) {
            turretMotor.set(0.0);
        }
    }

    // shooter
    public static void shoot(){
        shooterMotor.set(1.0);
    }

}
