package org.usfirst.frc.team4561.robot.triggers;

import org.usfirst.frc.team4561.robot.Robot;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class MovePosPOVTrigger extends Trigger {
    
    public boolean get() {
    	if(Robot.oi == null) return false;
    	return Robot.oi.getDpadPOV() != -1;
    }
}
