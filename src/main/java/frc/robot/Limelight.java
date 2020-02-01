/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Limelight extends SubsystemBase {
    public static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
    
    public static NetworkTableEntry tx = table.getEntry("tx");
    public static NetworkTableEntry ty = table.getEntry("ty");
    public static NetworkTableEntry tv = table.getEntry("tv");
    
    public static boolean objectSighted(){
        if (tv.getDouble(0.0) == 0.0){
            return false;
        } else {
            return true;
        }
    }
    
    public static void setLiveStream(int mode){
            table.getEntry("camMode").setNumber(mode);
        }
    
    public static void setLEDMode(int mode){
        table.getEntry("ledMode").setNumber(mode);
    }
        
    public static void rotateHorizontal() {
        while(tx.getDouble(0.0) != 0.0){
            if(tx.getDouble(0.0) < 0.0){
                Shooter.turretMotor.set(-1.0);
            }
            if(tx.getDouble(0.0) > 0.0){
                Shooter.turretMotor.set(1.0);
            }
        }
        Shooter.turretMotor.set(0.0);
    }

    public static void rotateVertical(){
        while (ty.getDouble(0.0) != 0){
            if (ty.getDouble(0.0) < 0){
                Shooter.hoodMotor.set(-1.0);
            }
            if (ty.getDouble(0.0) > 0) {
                Shooter.hoodMotor.set(1.0);
            }
        Shooter.hoodMotor.set(0.0);
        }	
    }
}