// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.MotorControlle;

public class Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Drivebase() {}

  CANSparkMax m_leftFrontMotor = new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax m_leftMiddleMotor = new CANSparkMax(3, MotorType.kBrushless);
  CANSparkMax m_leftBackMotor = new CANSparkMax(5, MotorType.kBrushless);
  CANSparkMax m_rightFrontMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_rightMiddleMotor = new CANSparkMax(2, MotorType.kBrushless);
  CANSparkMax m_rightBackMotor = new CANSparkMax(4, MotorType.kBrushless);
  
  //why?
  m_leftFrontMotor.setInverted(true);
  m_leftMiddleMotor.setInverted(true);
  m_leftBackMotor.setInverted(true);
  m_rightFrontMotor.setInverted(true);
  m_rightMiddleMotor.setInverted(true);
  m_rightBackMotor.setInverted(true); 

  DifferentialDrive m_db = new DifferentialDrive();

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
