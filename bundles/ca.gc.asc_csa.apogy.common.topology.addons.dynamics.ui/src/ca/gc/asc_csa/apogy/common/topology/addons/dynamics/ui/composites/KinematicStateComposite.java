package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Tuple3dComposite;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

public class KinematicStateComposite extends Composite {
	@SuppressWarnings("unused")
	private DataBindingContext m_bindingContext;

	private KinematicState ks;

	private Adapter kinematicStateAdapter;

	private Tuple3dComposite tuple3dLinearVelocity;

	private Tuple3dComposite tuple3dLinearAcceleration;

	private Tuple3dComposite tuple3dOrientation;

	private Tuple3dComposite tuple3dAngularVelocity;

	private Tuple3dComposite tuple3dAngularAcceleration;

	private Tuple3dComposite tuple3dPosition;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public KinematicStateComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, true));

		Group grpPosition = new Group(this, SWT.NONE);
		grpPosition.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		grpPosition.setText("Position");

		Group grpOrientation = new Group(this, SWT.NONE);
		grpOrientation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		grpOrientation.setText("Orientation");
		grpOrientation.setLayout(new FillLayout(SWT.HORIZONTAL));

		tuple3dOrientation = new Tuple3dComposite(grpOrientation, SWT.FILL);
		
				Group grpLinearVelocity = new Group(this, SWT.NONE);
				grpLinearVelocity.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
				grpLinearVelocity.setText("Linear Velocity");
				grpLinearVelocity.setLayout(new FillLayout(SWT.HORIZONTAL));
				
						tuple3dLinearVelocity = new Tuple3dComposite(grpLinearVelocity, SWT.FILL);

		Group grpAngularVelocity = new Group(this, SWT.NONE);
		grpAngularVelocity.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		grpAngularVelocity.setText("Angular Velocity");
		grpAngularVelocity.setLayout(new FillLayout(SWT.HORIZONTAL));

		tuple3dAngularVelocity = new Tuple3dComposite(grpAngularVelocity,SWT.FILL);
		
				Group grpLinearAcceleration = new Group(this, SWT.NONE);
				grpLinearAcceleration.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
				grpLinearAcceleration.setText("Linear Acceleration");
				grpLinearAcceleration.setLayout(new FillLayout(SWT.HORIZONTAL));
				
						tuple3dLinearAcceleration = new Tuple3dComposite(grpLinearAcceleration,
								SWT.NONE);

		Group grpAngularAcceleration = new Group(this, SWT.NONE);
		grpAngularAcceleration.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		grpAngularAcceleration.setText("Angular Acceleration");
		grpAngularAcceleration.setLayout(new FillLayout(SWT.HORIZONTAL));

		tuple3dAngularAcceleration = new Tuple3dComposite(grpAngularAcceleration, SWT.FILL);
		grpPosition.setLayout(new FillLayout(SWT.HORIZONTAL));

		tuple3dPosition = new Tuple3dComposite(grpPosition, SWT.NONE);
		m_bindingContext = initDataBindings();

	}

	public KinematicState getKinematicState() {
		return ks;
	}

	public void setKinematicState(KinematicState ks) {
		if (this.ks != null) {
			this.ks.eAdapters().remove(getKinematicStateAdapter());
		}
		this.ks = ks;

		if (this.ks != null) {
			tuple3dAngularAcceleration.setTuple3d(ks.getAngularAcceleration());
			tuple3dAngularVelocity.setTuple3d(ks.getAngularVelocity());
			tuple3dLinearAcceleration.setTuple3d(ks.getLinearAcceleration());
			tuple3dLinearVelocity.setTuple3d(ks.getLinearVelocity());
			tuple3dOrientation.setTuple3d(ks.getOrientation());
			tuple3dPosition.setTuple3d(ks.getPosition());
			this.ks.eAdapters().add(getKinematicStateAdapter());
		}

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}

	/**
	 * 
	 * <dl>
	 * <dt>Name:</dt>
	 * <dd>getKinematicStateAdapter</dd>
	 * <dt>Description:</dt>
	 * <dd>returns the Adapter (listener) to kinematic state. This Adapter
	 * listens for changes in the different fields of {@link KinematicState} and
	 * sets the appropriate {@link Tuple3dComposite} accordingly.</dd>
	 * <dt>Pre-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * <dt>Post-conditions:</dt>
	 * <dd>
	 * <ul>
	 * <li>None.</li>
	 * </ul>
	 * </dd>
	 * </dl>
	 * 
	 * @return the KinematicState Adapter.
	 */
	private Adapter getKinematicStateAdapter() {
		if (kinematicStateAdapter == null) {
			kinematicStateAdapter = new AdapterImpl() {
				public void notifyChanged(
						org.eclipse.emf.common.notify.Notification msg) {

					int featureId = msg.getFeatureID(KinematicState.class);

					Tuple3d newValue = null;
					Tuple3dComposite compositeToUpdate = null;

					switch (featureId) {
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__POSITION:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dPosition;
						break;
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dOrientation;
						break;
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dAngularAcceleration;
						break;
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dAngularVelocity;
						break;
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dLinearAcceleration;
						break;
					case ApogyCommonTopologyAddonsDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
						newValue = (Tuple3d) msg.getNewValue();
						compositeToUpdate = tuple3dLinearVelocity;
						break;
					}

					if (compositeToUpdate != null) {

						final Tuple3dComposite fCompositeToUpdate = compositeToUpdate;
						final Tuple3d fNewValue = newValue;

						Runnable run = new Runnable() {
							public void run() {
								fCompositeToUpdate.setTuple3d(fNewValue);
							};
						};

						Display.getDefault().asyncExec(run);

					}

				};
			};
		}
		return kinematicStateAdapter;
	}
}
