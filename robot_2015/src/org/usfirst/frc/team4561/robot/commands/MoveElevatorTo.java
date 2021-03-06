package org.usfirst.frc.team4561.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4561.robot.Robot;
import org.usfirst.frc.team4561.robot.subsystems.Elevator;
/**
 *
 */
public class MoveElevatorTo extends Command {
	private Elevator.Position position;
	
    public MoveElevatorTo(Elevator.Position position) {
    	requires((Subsystem) Robot.commonElevator);
    	this.position = position;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	((Elevator)Robot.commonElevator).moveTo(position);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
