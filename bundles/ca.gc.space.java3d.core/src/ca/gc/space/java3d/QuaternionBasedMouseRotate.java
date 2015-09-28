package ca.gc.space.java3d;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCriterion;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.media.j3d.WakeupOnBehaviorPost;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Quat4d;

import com.sun.j3d.utils.behaviors.mouse.MouseBehavior;
import com.sun.j3d.utils.behaviors.mouse.MouseBehaviorCallback;

public class QuaternionBasedMouseRotate extends MouseBehavior {

	double x_angle, y_angle;
	double x_factor = .03;
	double y_factor = .03;

	private double xRotation = 0.0;
	private double yRotation = 0.0;

	private double zRotation = 0.0;

	public double getXRotation() {
		return xRotation;
	}

	public double getYRotation() {
		return yRotation;
	}

	public void incrementXRotation(double value) {
		setXRotation(getXRotation() + value);
	}

	public void incrementYRotation(double value) {
		setYRotation(getYRotation() + value);
	}

	public void incrementZRotation(double value) {
		setZRotation(getZRotation() + value);
	}

	private MouseBehaviorCallback callback = null;
	private AXIS constrainedAxis;

	/**
	 * Creates a rotate behavior given the transform group.
	 * 
	 * @param transformGroup
	 *            The transformGroup to operate on.
	 */
	public QuaternionBasedMouseRotate(TransformGroup transformGroup) {
		super(transformGroup);
	}

	/**
	 * Creates a default mouse rotate behavior.
	 **/
	public QuaternionBasedMouseRotate() {
		super(0);
	}

	/**
	 * Creates a rotate behavior. Note that this behavior still needs a
	 * transform group to work on (use setTransformGroup(tg)) and the transform
	 * group must add this behavior.
	 * 
	 * @param flags
	 *            interesting flags (wakeup conditions).
	 */
	public QuaternionBasedMouseRotate(int flags) {
		super(flags);
	}

	/**
	 * Creates a rotate behavior that uses AWT listeners and behavior posts
	 * rather than WakeupOnAWTEvent. The behavior is added to the specified
	 * Component. A null component can be passed to specify the behavior should
	 * use listeners. Components can then be added to the behavior with the
	 * addListener(Component c) method.
	 * 
	 * @param c
	 *            The Component to add the MouseListener and MouseMotionListener
	 *            to.
	 * @since Java 3D 1.2.1
	 */
	public QuaternionBasedMouseRotate(Component c) {
		super(c, 0);
	}

	/**
	 * Creates a rotate behavior that uses AWT listeners and behavior posts
	 * rather than WakeupOnAWTEvent. The behaviors is added to the specified
	 * Component and works on the given TransformGroup. A null component can be
	 * passed to specify the behavior should use listeners. Components can then
	 * be added to the behavior with the addListener(Component c) method.
	 * 
	 * @param c
	 *            The Component to add the MouseListener and MouseMotionListener
	 *            to.
	 * @param transformGroup
	 *            The TransformGroup to operate on.
	 * @since Java 3D 1.2.1
	 */
	public QuaternionBasedMouseRotate(Component c, TransformGroup transformGroup) {
		super(c, transformGroup);
	}

	/**
	 * Creates a rotate behavior that uses AWT listeners and behavior posts
	 * rather than WakeupOnAWTEvent. The behavior is added to the specified
	 * Component. A null component can be passed to specify the behavior should
	 * use listeners. Components can then be added to the behavior with the
	 * addListener(Component c) method. Note that this behavior still needs a
	 * transform group to work on (use setTransformGroup(tg)) and the transform
	 * group must add this behavior.
	 * 
	 * @param flags
	 *            interesting flags (wakeup conditions).
	 * @since Java 3D 1.2.1
	 */
	public QuaternionBasedMouseRotate(Component c, int flags) {
		super(c, flags);
	}

	public void initialize() {
		super.initialize();
		x_angle = 0;
		y_angle = 0;
		if ((flags & INVERT_INPUT) == INVERT_INPUT) {
			invert = true;
			x_factor *= -1;
			y_factor *= -1;
		}
	}

	/**
	 * Return the x-axis movement multipler.
	 **/
	public double getXFactor() {
		return x_factor;
	}

	/**
	 * Return the y-axis movement multipler.
	 **/
	public double getYFactor() {
		return y_factor;
	}

	/**
	 * Set the x-axis amd y-axis movement multipler with factor.
	 **/
	public void setFactor(double factor) {
		x_factor = y_factor = factor;
	}

	/**
	 * Set the x-axis amd y-axis movement multipler with xFactor and yFactor
	 * respectively.
	 **/
	public void setFactor(double xFactor, double yFactor) {
		x_factor = xFactor;
		y_factor = yFactor;
	}

	@SuppressWarnings("unchecked")
	public void processStimulus(Enumeration criteria) {
		WakeupCriterion wakeup;
		AWTEvent[] events;
		MouseEvent evt;

		while (criteria.hasMoreElements()) {
			wakeup = (WakeupCriterion) criteria.nextElement();
			if (wakeup instanceof WakeupOnAWTEvent) {
				events = ((WakeupOnAWTEvent) wakeup).getAWTEvent();
				if (events.length > 0) {
					evt = (MouseEvent) events[events.length - 1];
					doProcess(evt);
				}
			}

			else if (wakeup instanceof WakeupOnBehaviorPost) {
				while (true) {
					// access to the queue must be synchronized
					synchronized (mouseq) {
						if (mouseq.isEmpty())
							break;
						evt = (MouseEvent) mouseq.remove(0);
						// consolidate MOUSE_DRAG events
						while ((evt.getID() == MouseEvent.MOUSE_DRAGGED)
								&& !mouseq.isEmpty()
								&& (((MouseEvent) mouseq.get(0)).getID() == MouseEvent.MOUSE_DRAGGED)) {
							evt = (MouseEvent) mouseq.remove(0);
						}
					}
					doProcess(evt);
				}
			}

		}
		wakeupOn(mouseCriterion);
	}

	void doProcess(MouseEvent evt) {
		int id;
		int dx, dy;

		processMouseEvent(evt);
		if (((buttonPress) && ((flags & MANUAL_WAKEUP) == 0))
				|| ((wakeUp) && ((flags & MANUAL_WAKEUP) != 0))) {
			id = evt.getID();
			if ((id == MouseEvent.MOUSE_DRAGGED) && !evt.isMetaDown()
					&& !evt.isAltDown()) {
				x = evt.getX();
				y = evt.getY();

				dx = x - x_last;
				dy = y - y_last;

				if (!reset) {
					x_angle = dy * y_factor;
					y_angle = dx * x_factor;

					if (constrainedAxis == null) {
						incrementXRotation(x_angle);
						incrementYRotation(y_angle);
					} else if (constrainedAxis.equals(AXIS.X_AXIS)) {
						incrementXRotation(x_angle);
					} else if (constrainedAxis.equals(AXIS.Y_AXIS)) {
						incrementYRotation(x_angle);
					} else if (constrainedAxis.equals(AXIS.Z_AXIS)) {
						System.out
								.println("QuaternionBasedMouseRotate.doProcess() incrementing z rotation");
						incrementZRotation(x_angle);
					}

					update();
				} else {
					reset = false;
				}

				x_last = x;
				y_last = y;
			} else if (id == MouseEvent.MOUSE_PRESSED) {
				x_last = evt.getX();
				y_last = evt.getY();
			}
		}
	}

	public void update() {
		transformGroup.getTransform(currXform);

		if (constrainedAxis == null) {
			AxisAngle4d xAxisAngle = new AxisAngle4d(1.0, 0.0, 0.0,
					getXRotation());
			AxisAngle4d yAxisAngle = new AxisAngle4d(0.0, 1.0, 0.0,
					getYRotation());
			AxisAngle4d zAxisAngle = new AxisAngle4d(0.0, 0.0, 1.0,
					getZRotation());

			Quat4d qx = new Quat4d();
			qx.set(xAxisAngle);

			Quat4d qy = new Quat4d();
			qy.set(yAxisAngle);

			Quat4d qz = new Quat4d();
			qz.set(zAxisAngle);

			Matrix4d mat = new Matrix4d();
			currXform.get(mat);

			double scale = mat.getScale();
			mat.setScale(1.0);

			qx.mul(qy);
			qx.mul(qz);

			currXform.setRotation(qx);
			currXform.setScale(scale);

		} else {
			Transform3D deltaTransform = new Transform3D();
			deltaTransform.setIdentity();
			if (constrainedAxis.equals(AXIS.X_AXIS)) {
				deltaTransform.rotX(getXRotation());
			} else if (constrainedAxis.equals(AXIS.Y_AXIS)) {
				deltaTransform.rotY(getYRotation());
			} else if (constrainedAxis.equals(AXIS.Z_AXIS)) {
				deltaTransform.rotZ(getZRotation());
			}
			currXform.mul(deltaTransform);
		}

		// Update xform
		transformGroup.setTransform(currXform);

		transformChanged(currXform);
		if (callback != null)
			callback.transformChanged(MouseBehaviorCallback.ROTATE, currXform);

	}

	/**
	 * Users can overload this method which is called every time the Behavior
	 * updates the transform
	 * 
	 * Default implementation does nothing
	 */
	public void transformChanged(Transform3D transform) {
	}

	/**
	 * The transformChanged method in the callback class will be called every
	 * time the transform is updated
	 */
	public void setupCallback(MouseBehaviorCallback callback) {
		this.callback = callback;
	}

	/**
	 * @param xRotation
	 *            the xRotation to set
	 */
	public void setXRotation(double xRotation) {
		if (constrainedAxis == null || constrainedAxis.equals(AXIS.X_AXIS)) {
			this.xRotation = xRotation;
		}
	}

	/**
	 * @param zRotation
	 *            the zRotation to set
	 */
	public void setZRotation(double zRotation) {
		if (constrainedAxis == null || constrainedAxis.equals(AXIS.Z_AXIS)) {
			this.zRotation = zRotation;
		}
	}

	/**
	 * @return the zRotation
	 */
	public double getZRotation() {
		return zRotation;
	}

	/**
	 * @param yRotation
	 *            the yRotation to set
	 */
	public void setYRotation(double yRotation) {
		if (constrainedAxis == null || constrainedAxis.equals(AXIS.Y_AXIS)) {
			this.yRotation = yRotation;
		}
	}

	public void setRotationConstraint(AXIS axis) {
		constrainedAxis = axis;
	}

	public void setRotationConstraintToNone() {
		constrainedAxis = null;
	}

	@Override
	public void setTransformGroup(TransformGroup transformGroup) {
		super.setTransformGroup(transformGroup);
		xRotation = 0.0;
		yRotation = 0.0;
		zRotation = 0.0;
	}

	public void reset() {
		xRotation = 0.0;
		yRotation = 0.0;
		zRotation = 0.0;
		x_angle = 0.0;
		y_angle = 0.0;
	}
}
