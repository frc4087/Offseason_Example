/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public enum RobotMap {
  //Drivebase Mappings
  TAL_LEFT_DRIVE(1),
  TAL_RIGHT_DRIVE(2),
  VA_LEFT_DRIVE(0),
  VB_LEFT_DRIVE(1),
  VA_RIGHT_DRIVE(2),
  VB_RIGHT_DRIVE(3),
  //Intake Mappings
  TAL_INTAKE(3),
  TAL_ARM(4),
  //Winch Mappings
  S_LEFT(4),
  S_RIGHT(5),
  //S_LEFT_INTAKE(5),
  //S_RIGHT_INTAKE(4),
  // Control Mappings
  DRIVE_JOYSTICK(0), CONTROL_JOYSTICK(1);
  public final int value;

  RobotMap(int value) {
    this.value = value;
  }

}
