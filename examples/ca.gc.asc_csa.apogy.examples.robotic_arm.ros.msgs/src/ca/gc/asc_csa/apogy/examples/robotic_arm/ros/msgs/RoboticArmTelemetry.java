package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs;

public interface RoboticArmTelemetry extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros/RoboticArmTelemetry";
  static final java.lang.String _DEFINITION = "# Topic \n# Robotic Arm Telemetry\n\nHeader header\n\n# The turret angle in degrees.\nfloat32 turretAngle\n\n# The shoulder angle in degrees.\nfloat32 shoulderAngle\n\n# The elbow angle in degrees.\nfloat32 elbowAngle\n\n# The wrist angle in degrees.\nfloat32 wristAngle\n\n# Whether or not the arm is moving.\nbool moving\n\n# The current speed mode.\nMoveSpeed speed\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getTurretAngle();
  void setTurretAngle(float value);
  float getShoulderAngle();
  void setShoulderAngle(float value);
  float getElbowAngle();
  void setElbowAngle(float value);
  float getWristAngle();
  void setWristAngle(float value);
  boolean getMoving();
  void setMoving(boolean value);
  MoveSpeed getSpeed();
  void setSpeed(MoveSpeed value);
}
