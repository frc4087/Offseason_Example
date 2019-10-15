/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;


import frc.robot.OI;


public class Robot extends TimedRobot {

  public OI m_oi;

  // Drivebase
  public static VictorSP vaLeftDrive = new VictorSP(RobotMap.VA_LEFT_DRIVE.value);
  public static VictorSP vbLeftDrive = new VictorSP(RobotMap.VB_LEFT_DRIVE.value);
  public static VictorSP vaRightDrive = new VictorSP(RobotMap.VA_RIGHT_DRIVE.value);
  public static VictorSP vbRightDrive = new VictorSP(RobotMap.VB_RIGHT_DRIVE.value);
  public static WPI_TalonSRX LeftDrive = new WPI_TalonSRX(1);
  public static WPI_TalonSRX RightDrive = new WPI_TalonSRX(2);
  
  public SpeedControllerGroup m_left = new SpeedControllerGroup(LeftDrive, vaLeftDrive, vbLeftDrive);
  public SpeedControllerGroup m_right = new SpeedControllerGroup(RightDrive, vaRightDrive, vbRightDrive);
  
  DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

  @Override
  public void robotInit() {
    m_oi = new OI();
    CameraServer.getInstance().startAutomaticCapture();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();

    //Tank Drive -- CHECK NEGATIVE SIGNS
    m_drive.tankDrive(m_oi.getDriveJoyYL(), m_oi.getDriveJoyYR());

    //Arcade Drive
    //m_drive.arcadeDrive(-m_oi.getDriveJoyYL(), m_oi.getDriveJoyXR());

    //Curvature Drive
    //m_drive.curvatureDrive(-m_oi.getDriveJoyYL(), m_oi.getDriveJoyXR(), m_oi.isQuickTurn());
  }

  @Override
  public void testPeriodic() {
  }
}