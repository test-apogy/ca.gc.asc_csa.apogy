package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

public interface cmdMoveTo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros/cmdMoveTo";
  static final java.lang.String _DEFINITION = "# Command the robotic arm to move to a specified angle configuration.\n\n# The turret angle in radians.\nfloat32 turretAngle\n\n# The shoulder angle in radians.\nfloat32 shoulderAngle\n\n# The elbow angle in radians.\nfloat32 elbowAngle\n\n# The wrist angle in radians.\nfloat32 wristAngle\n\n\n---\n\n# Service result\nbool result";
}
