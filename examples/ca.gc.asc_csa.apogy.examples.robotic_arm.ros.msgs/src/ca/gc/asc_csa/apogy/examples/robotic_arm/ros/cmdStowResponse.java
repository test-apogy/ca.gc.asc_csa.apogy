package ca.gc.asc_csa.apogy.examples.robotic_arm.ros;

public interface cmdStowResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ca.gc.asc_csa.apogy.examples.robotic_arm.ros/cmdStowResponse";
  static final java.lang.String _DEFINITION = "\n# Service result\nbool result";
  boolean getResult();
  void setResult(boolean value);
}
