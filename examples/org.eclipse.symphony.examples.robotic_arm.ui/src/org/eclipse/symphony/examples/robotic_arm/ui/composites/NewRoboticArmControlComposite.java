package org.eclipse.symphony.examples.robotic_arm.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage.Literals;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

public class NewRoboticArmControlComposite extends Composite
{
	private DataBindingContext m_bindingContext;
	private static final String DEGREE_SYM = "\u00b0";
	
	private RoboticArm roboticArm;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtInitialized;
	private Text txtMoving;
	private Text txtWristEditValue;
	private Text txtTurretEditValue;
	private Text txtShoulderEditValue;
	private Text txtElbowEditValue;
	private Label lblTurretValue;
	private Label lblElbowValue;
	private Label lblShoulderValue;
	private Label lblWristValue;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NewRoboticArmControlComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Section sctnStatus = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnStatus);
		sctnStatus.setText("Status");
		
		Composite compositeStatus = formToolkit.createComposite(sctnStatus, SWT.NONE);
		formToolkit.paintBordersFor(compositeStatus);
		sctnStatus.setClient(compositeStatus);
		compositeStatus.setLayout(new GridLayout(2, true));
		
		txtInitialized = formToolkit.createText(compositeStatus, "", SWT.CENTER);
		txtInitialized.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		txtInitialized.setEditable(false);
		txtInitialized.setText("Not Ready");
		txtInitialized.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		txtMoving = formToolkit.createText(compositeStatus, "", SWT.CENTER);
		txtMoving.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		txtMoving.setEditable(false);
		txtMoving.setText("Not Moving");
		txtMoving.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		Section sctnControl = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnControl);
		sctnControl.setText("Control");
		
		Composite composite = formToolkit.createComposite(sctnControl, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		sctnControl.setClient(composite);
		composite.setLayout(new GridLayout(3, false));
		
		Button btnInitialize = formToolkit.createButton(composite, "Initialize", SWT.NONE);
		btnInitialize.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roboticArm != null){
					new Job("Robotic Arm - Initialize") {
						
						@Override
						protected IStatus run(IProgressMonitor arg0) {
							roboticArm.init();
							return Status.OK_STATUS;
						}					
					}.schedule();
				}
			}
		});
		btnInitialize.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		
		Button btnStow = formToolkit.createButton(composite, "Stow", SWT.NONE);
		btnStow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roboticArm != null){
					new Job("Robotic Arm - Stow") {
						
						@Override
						protected IStatus run(IProgressMonitor arg0) {
							roboticArm.stow();
							return Status.OK_STATUS;
						}					
					}.schedule();
				}
			}
		});

		
		Combo comboSpeed = new Combo(composite, SWT.NONE);
		comboSpeed.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.adapt(comboSpeed);
		formToolkit.paintBordersFor(comboSpeed);
		
		Section sctnJointControl = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnJointControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		formToolkit.paintBordersFor(sctnJointControl);
		sctnJointControl.setText("Joints Control");
		
		Composite compositeJoints = formToolkit.createComposite(sctnJointControl, SWT.NONE);
		formToolkit.paintBordersFor(compositeJoints);
		sctnJointControl.setClient(compositeJoints);
		compositeJoints.setLayout(new GridLayout(6, true));
		new Label(compositeJoints, SWT.NONE);
		
		Label lblTurrent = formToolkit.createLabel(compositeJoints, "Turret (" + DEGREE_SYM + ")", SWT.NONE);
		lblTurrent.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Label lblShoulder = formToolkit.createLabel(compositeJoints, "Shoulder (" + DEGREE_SYM + ")", SWT.NONE);
		lblShoulder.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Label lblElbow = formToolkit.createLabel(compositeJoints, "Elbow (" + DEGREE_SYM + ")", SWT.NONE);
		lblElbow.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Label lblWrist = formToolkit.createLabel(compositeJoints, "Wrist (" + DEGREE_SYM + ")", SWT.NONE);
		lblWrist.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = formToolkit.createLabel(compositeJoints, "", SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblActuals = formToolkit.createLabel(compositeJoints, "Actuals", SWT.NONE);
		lblActuals.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		lblTurretValue = formToolkit.createLabel(compositeJoints, "", SWT.CENTER);
		lblTurretValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblTurretValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblShoulderValue = formToolkit.createLabel(compositeJoints, "", SWT.CENTER);
		lblShoulderValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblShoulderValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblElbowValue = formToolkit.createLabel(compositeJoints, "", SWT.CENTER);
		lblElbowValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblElbowValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblWristValue = formToolkit.createLabel(compositeJoints, "", SWT.CENTER);
		lblWristValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblWristValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		Button btnLoad = formToolkit.createButton(compositeJoints, "Load", SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtTurretEditValue.setText(lblTurretValue.getText());
				txtShoulderEditValue.setText(lblShoulderValue.getText());
				txtElbowEditValue.setText(lblElbowValue.getText());
				txtWristEditValue.setText(lblWristValue.getText());
			}
		});
		btnLoad.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true, 1, 1));
		
		Label lblCommanded = formToolkit.createLabel(compositeJoints, "Commanded", SWT.NONE);
		lblCommanded.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		txtTurretEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtTurretEditValue.setText("0.0");
		txtTurretEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		txtShoulderEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtShoulderEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		txtElbowEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtElbowEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		txtWristEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtWristEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		Button btnMoveTo = formToolkit.createButton(compositeJoints, "MoveTo", SWT.NONE);
		btnMoveTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (roboticArm != null){
					new Job("Robotic Arm - MoveTo") {
						
						@Override
						protected IStatus run(IProgressMonitor arg0) {
							roboticArm.moveTo(
									Math.toRadians(Double.valueOf(txtTurretEditValue.getText()).doubleValue()),
									Math.toRadians(Double.valueOf(txtShoulderEditValue.getText()).doubleValue()),
									Math.toRadians(Double.valueOf(txtElbowEditValue.getText()).doubleValue()),
									Math.toRadians(Double.valueOf(txtWristEditValue.getText()).doubleValue())); 
							return Status.OK_STATUS;
						}					
					}.schedule();
				}
			}
		});
		btnMoveTo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		if (roboticArm != null){
			m_bindingContext = initDataBindings();
		}
	}
		
	public void setRoboticArm(RoboticArm newRoboticArm)
	{
		// If the given new robotic arm is different
		// than the current robotic arm
		// FIXME remove_the_following_comments;
//		if (newRoboticArm != this.roboticArm)
//		{
			// Update things accordingly
			this.roboticArm = newRoboticArm;
			
			if (m_bindingContext != null){
				m_bindingContext.dispose();
			}
			initDataBindings();
//		}
	}		
	
	public RoboticArm getRoboticArm() {
		return roboticArm;
	}
	
	private class TextToDegreeUpdateValueStrategy extends UpdateValueStrategy{
		public TextToDegreeUpdateValueStrategy() {
			setConverter(new Converter(double.class, String.class){
				@Override
				public Object convert(Object arg0) {
					return String.format("%,4.1f", ((Double)arg0).doubleValue());
				}				
			});
		}
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextLblTurretValueObserveWidget = WidgetProperties.text().observe(lblTurretValue);
		IObservableValue roboticArmTurretAngleObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__TURRET_ANGLE);
		bindingContext.bindValue(observeTextLblTurretValueObserveWidget, roboticArmTurretAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblShoulderValueObserveWidget = WidgetProperties.text().observe(lblShoulderValue);
		IObservableValue roboticArmShoulderAngleObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__SHOULDER_ANGLE);
		bindingContext.bindValue(observeTextLblShoulderValueObserveWidget, roboticArmShoulderAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblElbowValueObserveWidget = WidgetProperties.text().observe(lblElbowValue);
		IObservableValue roboticArmElbowAngleObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__ELBOW_ANGLE);
		bindingContext.bindValue(observeTextLblElbowValueObserveWidget, roboticArmElbowAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblWristValueObserveWidget = WidgetProperties.text().observe(lblWristValue);
		IObservableValue roboticArmWristAngleObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__WRIST_ANGLE);
		bindingContext.bindValue(observeTextLblWristValueObserveWidget, roboticArmWristAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextTxtInitializedObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtInitialized);
		IObservableValue roboticArmInitializedObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__INITIALIZED);
		bindingContext.bindValue(observeTextTxtInitializedObserveWidget, roboticArmInitializedObserveValue, 
				null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(boolean.class, String.class) {
					
					@Override
					public Object convert(Object arg0) {
						return ((Boolean)arg0).booleanValue() ? "Ready" : "Not Ready";
					}
				})		
			);
		//
		IObservableValue observeTextTxtMovingObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtMoving);
		IObservableValue roboticArmArmMovingObserveValue = EMFObservables.observeValue(roboticArm, Literals.ROBOTIC_ARM__ARM_MOVING);
		bindingContext.bindValue(observeTextTxtMovingObserveWidget, roboticArmArmMovingObserveValue, 
				null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(boolean.class, String.class) {
					
					@Override
					public Object convert(Object arg0) {
						return ((Boolean)arg0).booleanValue() ? "Moving" : "Stopped";
					}
				})		
			);

		//
		return bindingContext;
	}
}