package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.msgs;

public interface cmdSpeedLevelRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros/cmdSpeedLevelRequest";
  static final java.lang.String _DEFINITION = "# Command the speed level to be used by the robotic arm.\n\n# The Move speed\nMoveSpeed speed\n\n";
  MoveSpeed getSpeed();
  void setSpeed(MoveSpeed value);
}
