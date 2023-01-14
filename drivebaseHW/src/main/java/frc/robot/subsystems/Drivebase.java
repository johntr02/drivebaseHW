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
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivebase extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public Drivebase() {}

  //create motor objects
  MotorController m_leftFrontMotor = new CANSparkMax(1, MotorType.kBrushless);
  MotorController m_leftMiddleMotor = new CANSparkMax(2, MotorType.kBrushless);
  MotorController m_leftBackMotor = new CANSparkMax(3, MotorType.kBrushless);
  MotorController m_rightFrontMotor = new CANSparkMax(4, MotorType.kBrushless);
  MotorController m_rightMiddleMotor = new CANSparkMax(5, MotorType.kBrushless);
  MotorController m_rightBackMotor = new CANSparkMax(6, MotorType.kBrushless);

  //group of motor objects
  MotorControllerGroup m_leftGroup = new MotorControllerGroup(m_leftFrontMotor, m_leftMiddleMotor, m_leftMiddleMotor);
  MotorControllerGroup m_rightGroup = new MotorControllerGroup(m_rightFrontMotor, m_rightMiddleMotor, m_rightMiddleMotor);
  
  //invert so robot so left and right motors go same direction go forward
  m_leftGroup.setInverted(true);

  //differential drive object
  DifferentialDrive m_drive = new DifferentialDrive(m_leftGroup, m_rightGroup);

  //AHRS gyroscope object
  AHRS m_gyro = new AHRS(Port.kMXP);

  //arcadeDrive method
  public void arcadeDrive(double xSpeed, double zRotation){
    m_drive.arcadeDrive(xSpeed, zRotation);
  }

  //gyroscope method that gets the Z angle
  public double gyroscopeZAngle(){
    return m_gyro.getAngle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // puts the value of gyroscopeZAngle onto SmartDashboard 
    SmartDashboard.putNumber("ZAngle", gyroscopeZAngle());
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
