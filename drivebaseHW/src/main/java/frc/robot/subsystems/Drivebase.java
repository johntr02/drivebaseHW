// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Drivebase() {}

  CANSparkMax m_leftTopMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_leftMiddleMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_leftBottomMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_rightTopMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_rightMiddleMotor = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax m_rightBottomMotor = new CANSparkMax(0, MotorType.kBrushless);
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
