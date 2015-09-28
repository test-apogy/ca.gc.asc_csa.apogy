package eclipse_ros_msgs;

public interface ROSFrameworkLogEntry extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "eclipse_ros_msgs/ROSFrameworkLogEntry";
  static final java.lang.String _DEFINITION = "# ROS message\t: eclipse_ros_msgs/ROSFrameworkLogEntry\n# File name\t\t: ROSFrameworkLogEntry.msg\n# Created on\t: 14 fev 2013\n# Last edit\t\t: 14 fev 2013\n# TRT Telemetry\n\n# ROS header\nHeader header\n\n# Name of bundle\nstring bundleName\n\n# Severity of the message\nint8 severity\n\n# Message\nstring message\n\n# Throwable message (if applicable)\nstring throwableMessage\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getBundleName();
  void setBundleName(java.lang.String value);
  byte getSeverity();
  void setSeverity(byte value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  java.lang.String getThrowableMessage();
  void setThrowableMessage(java.lang.String value);
}
