package org.eclipse.symphony.common.topology.addons.dynamics.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.math.ui.composites.Tuple3dComposite;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

public class RPROConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint rPROConstraint;
	private Button enabledButton;
	
	private Tuple3dComposite linearStrenghtComposite;
	private Tuple3dComposite angularStrenghtComposite;
	
	private Adapter constraintStatesAdapter;

	public RPROConstraintComposite(Composite parent, int style,
			org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint newRPROConstraint) 
	{
		this(parent, style);
		setRPROConstraint(newRPROConstraint);
	}

	public RPROConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));

		new Label(this, SWT.NONE).setText("Angular Strenght:");
		angularStrenghtComposite = new Tuple3dComposite(this, SWT.NONE);		
		angularStrenghtComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		new Label(this, SWT.NONE).setText("Linear Strenght:");
		linearStrenghtComposite = new Tuple3dComposite(this, SWT.NONE);
		linearStrenghtComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		if (rPROConstraint != null) {
			m_bindingContext = initDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	private DataBindingContext initDataBindings() {
		IObservableValue enabledObserveWidget = SWTObservables.observeSelection(enabledButton);
		IObservableValue enabledObserveValue = EMFObservables.observeValue(	rPROConstraint, org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.ABSTRACT_CONSTRAINT__ENABLED);
		
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,
				null, null);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint getRPROConstraint() {
		return rPROConstraint;
	}

	public void setRPROConstraint(org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint newRPROConstraint) 
	{
		// Unregister listener from previous CylindricalConstraint
		if(getRPROConstraint() != null)
		{			
			getRPROConstraint().eAdapters().remove(getConstraintStatesAdapter());
		}
		
		setRPROConstraint(newRPROConstraint, true);
		
		if(newRPROConstraint != null)
		{
			// Register listener to the new CylindricalConstraint
			newRPROConstraint.eAdapters().add(getConstraintStatesAdapter());
			
			linearStrenghtComposite.setTuple3d(newRPROConstraint.getLinearStrength());
			angularStrenghtComposite.setTuple3d(newRPROConstraint.getAngularStrength());
		}
		else
		{
			linearStrenghtComposite.setTuple3d(null);
			angularStrenghtComposite.setTuple3d(null);
		}
	}

	public void setRPROConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint newRPROConstraint,
			boolean update) {
		rPROConstraint = newRPROConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (rPROConstraint != null) 
			{
				m_bindingContext = initDataBindings();
			}
			else
			{
				enabledButton.setEnabled(false);
			}
		}				
	}

	private Adapter getConstraintStatesAdapter()
	{
		if(constraintStatesAdapter == null)
		{
			constraintStatesAdapter = new AdapterImpl()
			{
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) 
				{										
					// If the angular current state has been changed.
					if(msg.getFeature() == TopologyDynamicsPackage.Literals.RPRO_CONSTRAINT__ANGULAR_STRENGTH)
					{														
						angularStrenghtComposite.setTuple3d((org.eclipse.symphony.common.math.Tuple3d) msg.getNewValue());					
					}
					// If the linear current state has been changed.
					else if(msg.getFeature() == TopologyDynamicsPackage.Literals.RPRO_CONSTRAINT__LINEAR_STRENGTH)
					{
						linearStrenghtComposite.setTuple3d((org.eclipse.symphony.common.math.Tuple3d) msg.getNewValue());	
					}										
				};
			};
		}
		return constraintStatesAdapter;
	}
}
