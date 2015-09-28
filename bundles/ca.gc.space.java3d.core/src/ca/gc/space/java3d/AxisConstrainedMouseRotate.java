package ca.gc.space.java3d;

import java.awt.AWTEvent;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.WakeupCriterion;
import javax.media.j3d.WakeupOnAWTEvent;
import javax.media.j3d.WakeupOnBehaviorPost;

import com.sun.j3d.utils.behaviors.mouse.MouseBehavior;
import com.sun.j3d.utils.behaviors.mouse.MouseBehaviorCallback;

public class AxisConstrainedMouseRotate extends MouseBehavior {

	public enum AXIS {
		X_AXIS, Y_AXIS, Z_AXIS
	};

	private double factor = .02;

	private AXIS constrainedAxis = AXIS.X_AXIS;

	private MouseBehaviorCallback callback = null;

	public AxisConstrainedMouseRotate(TransformGroup tg) {
		super(tg);
	}

	public AxisConstrainedMouseRotate(AXIS axis, TransformGroup tg) {
		super(tg);
		setConstrainedAxis(axis);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void processStimulus(Enumeration criteria) {

		WakeupCriterion wakeup;
		AWTEvent[] events;
		MouseEvent evt;
		// int id;
		// int dx, dy;

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
					// access to the queue must be synchronised
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

	@Override
	public void initialize() {
		super.initialize();
		if ((flags & INVERT_INPUT) == INVERT_INPUT) {
			invert = true;
			factor *= -1;
		}
	}

	private void doProcess(MouseEvent evt) {

		int id;
		int dx, dy;

		processMouseEvent(evt);

		if (((buttonPress) && ((flags & MANUAL_WAKEUP) == 0))
				|| ((wakeUp) && ((flags & MANUAL_WAKEUP) != 0))) {
			id = evt.getID();

			if ((id == MouseEvent.MOUSE_DRAGGED) && !evt.isAltDown()
					&& !evt.isMetaDown()) {

				x = evt.getX();
				y = evt.getY();

				dx = x - x_last;
				dy = y - y_last;

				if ((!reset) && ((Math.abs(dy) < 50) && (Math.abs(dx) < 50))) {
					// System.out.println("dx " + dx + " dy " + dy);
					transformGroup.getTransform(currXform);

					transformX.setIdentity();

					double deltaRotation = (double) dx * factor;

					if (invert) {
						deltaRotation *= -1.0;
					}

					if (constrainedAxis.equals(AXIS.X_AXIS)) {

						transformX.rotX((double) dx * factor);
					} else if (constrainedAxis.equals(AXIS.Y_AXIS)) {

						transformX.rotY((double) dx * factor);
					} else if (constrainedAxis.equals(AXIS.Z_AXIS)) {

						transformX.rotZ((double) dx * factor);
					}

					currXform.mul(transformX);

					transformGroup.setTransform(currXform);

					transformChanged(currXform);

					if (callback != null)
						callback.transformChanged(
								MouseBehaviorCallback.TRANSLATE, currXform);

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

	public void transformChanged(Transform3D currXform) {

	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	/**
	 * @param constrainedAxis
	 *            the constrainedAxis to set
	 */
	public void setConstrainedAxis(AXIS constrainedAxis) {
		this.constrainedAxis = constrainedAxis;
	}

	/**
	 * @return the constrainedAxis
	 */
	public AXIS getConstrainedAxis() {
		return constrainedAxis;
	}

	/**
	 * The transformChanged method in the callback class will be called every
	 * time the transform is updated
	 */
	public void setupCallback(MouseBehaviorCallback callback) {
		this.callback = callback;
	}

}
