package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs;

public interface MoveSpeed extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros/MoveSpeed";
  static final java.lang.String _DEFINITION = "# Topic \n# Robotic Arm Speed Mode\n\n# Slow speed\nint8 SPEED_MODE_SLOW = 0\n\n# Medium speed\nint8 SPEED_MODE_MEDIUM = 1\n\n# Fast speed\nint8 SPEED_MODE_FAST = 2\n\n# The turret angle in degrees.\nint8 speedStatus\n\n";
  static final byte SPEED_MODE_SLOW = 0;
  static final byte SPEED_MODE_MEDIUM = 1;
  static final byte SPEED_MODE_FAST = 2;
  byte getSpeedStatus();
  void setSpeedStatus(byte value);
}
