package org.eclipse.symphony.examples.robotic_arm.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;
import org.eclipse.symphony.examples.robotic_arm.Symphony__ExamplesRoboticArmPackage.Literals;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

public class RoboticArmControlComposite extends Composite
{
	private static final String DEGREE_SYM = "\u00b0";
	private static final String MOVING_STR = "Moving";
	private static final String STOPPED_STR = "Stopped";
	private static final String READY_STR = "Ready";
	private static final String NOT_READY_STR = "Not Ready";

	private final DataBindingContext m_bindingContext;
	private final WritableValue roboticArmBinder;
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
	private Button btnInitialized;
	private Button btnStow;
	private Button btnMoveTo;
	private Combo cmbSpeedMode;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public RoboticArmControlComposite(Composite parent, int style)
	{
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		this.addDisposeListener(new DisposeListener()
		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				m_bindingContext.dispose();
			}
		});
		
		Section sctnStatus = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.paintBordersFor(sctnStatus);
		sctnStatus.setText("Status");
		
		Composite compositeStatus = formToolkit.createComposite(sctnStatus, SWT.NONE);
		formToolkit.paintBordersFor(compositeStatus);
		sctnStatus.setClient(compositeStatus);
		compositeStatus.setLayout(new GridLayout(2, true));
		
		txtInitialized = formToolkit.createText(compositeStatus, "", SWT.CENTER | SWT.NO_FOCUS);
		txtInitialized.setEditable(false);
		txtInitialized.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		txtMoving = formToolkit.createText(compositeStatus, "", SWT.CENTER | SWT.NO_FOCUS);
		txtMoving.setEditable(false);
		txtMoving.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		txtMoving.addModifyListener(new ModifyListener()
		{
			@Override
			public void modifyText(ModifyEvent e)
			{
				if (txtMoving.getText().equals(MOVING_STR) == true)
				{
					txtMoving.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
				}
				else if (txtMoving.getText().equals(STOPPED_STR) == true)
				{
					txtMoving.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
				}
			}
		});
		txtMoving.setText(STOPPED_STR);
		
		Section sctnControl = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.paintBordersFor(sctnControl);
		sctnControl.setText("Control");
		
		Composite composite = formToolkit.createComposite(sctnControl, SWT.NONE);
		formToolkit.paintBordersFor(composite);
		sctnControl.setClient(composite);
		composite.setLayout(new GridLayout(3, false));
		
		btnInitialized = formToolkit.createButton(composite, "Initialize", SWT.NONE);
		btnInitialized.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roboticArm != null)
				{
					Job initJob = new InitJob();
					
					initJob.schedule();
				}
			}
		});
		btnInitialized.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		
		btnStow = formToolkit.createButton(composite, "Stow", SWT.NONE);
		btnStow.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roboticArm != null)
				{
					Job stowJob = new StowJob();
					
					stowJob.schedule();
				}
			}
		});
		
		cmbSpeedMode = new Combo(composite, SWT.READ_ONLY);
		cmbSpeedMode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		cmbSpeedMode.add(MoveSpeedLevel.SLOW.getLiteral());
		cmbSpeedMode.add(MoveSpeedLevel.MEDIUM.getLiteral());
		cmbSpeedMode.add(MoveSpeedLevel.FAST.getLiteral());
		formToolkit.adapt(cmbSpeedMode);
		formToolkit.paintBordersFor(cmbSpeedMode);
		cmbSpeedMode.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roboticArm != null)
				{
					String newSpeedMode = cmbSpeedMode.getText();
					MoveSpeedLevel newSpeedLevel = MoveSpeedLevel.get(newSpeedMode);
					
					Job speedJob = new SpeedModeJob(newSpeedLevel);
				
					speedJob.schedule();
				}
			}
		});
		
		Section sctnJointControl = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnJointControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		formToolkit.paintBordersFor(sctnJointControl);
		sctnJointControl.setText("Joints Control");
		
		Composite compositeJoints = formToolkit.createComposite(sctnJointControl, SWT.NONE);
		formToolkit.paintBordersFor(compositeJoints);
		sctnJointControl.setClient(compositeJoints);
		compositeJoints.setLayout(new GridLayout(6, true));
		new Label(compositeJoints, SWT.NONE);
		
		Label lblTurret = formToolkit.createLabel(compositeJoints, "Turret (" + DEGREE_SYM + ")", SWT.NONE);
		lblTurret.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, false, 1, 1));
		
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
		
		lblTurretValue = formToolkit.createLabel(compositeJoints, "0.0", SWT.CENTER);
		lblTurretValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblTurretValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblShoulderValue = formToolkit.createLabel(compositeJoints, "0.0", SWT.CENTER);
		lblShoulderValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblShoulderValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblElbowValue = formToolkit.createLabel(compositeJoints, "0.0", SWT.CENTER);
		lblElbowValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblElbowValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		lblWristValue = formToolkit.createLabel(compositeJoints, "0.0", SWT.CENTER);
		lblWristValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblWristValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		
		Button btnLoad = formToolkit.createButton(compositeJoints, "Load", SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
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
		txtTurretEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		txtTurretEditValue.addVerifyListener(new AngleValueVerifyListener());
		
		txtShoulderEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtShoulderEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		txtShoulderEditValue.addVerifyListener(new AngleValueVerifyListener());
		
		txtElbowEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtElbowEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		txtElbowEditValue.addVerifyListener(new AngleValueVerifyListener());
		
		txtWristEditValue = formToolkit.createText(compositeJoints, "0.0", SWT.CENTER);
		txtWristEditValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		txtWristEditValue.addVerifyListener(new AngleValueVerifyListener());
		
		btnMoveTo = formToolkit.createButton(compositeJoints, "MoveTo", SWT.NONE);
		btnMoveTo.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				if (roboticArm != null)
				{
					double turret = Math.toRadians(Double.parseDouble(txtTurretEditValue.getText()));
					double shoulder = Math.toRadians(Double.parseDouble(txtShoulderEditValue.getText()));
					double elbow = Math.toRadians(Double.parseDouble(txtElbowEditValue.getText()));
					double wrist = Math.toRadians(Double.parseDouble(txtWristEditValue.getText()));
		
					Job moveToJob = new MoveToJob(turret, shoulder, elbow, wrist);
					
					moveToJob.schedule();
				}
			}
		});
		btnMoveTo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		
		txtInitialized.addModifyListener(new ModifyListener()
		{
			@Override
			public void modifyText(ModifyEvent e)
			{
				if (txtInitialized.getText().equals(READY_STR) == true)
				{
					txtInitialized.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
					btnInitialized.setEnabled(false);
					btnStow.setEnabled(true);
					btnMoveTo.setEnabled(true);
					cmbSpeedMode.setEnabled(true);
				}
				else if (txtInitialized.getText().equals(NOT_READY_STR) == true)
				{
					txtInitialized.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
					btnInitialized.setEnabled(true);
					btnStow.setEnabled(false);
					btnMoveTo.setEnabled(false);
					cmbSpeedMode.setEnabled(false);
				}
			}
		});
		txtInitialized.setText(NOT_READY_STR);
		
		// Start binding
		
		m_bindingContext = new DataBindingContext();
		roboticArmBinder = new WritableValue();
		
		IObservableValue observeTextLblTurretValueObserveWidget = WidgetProperties.text().observe(lblTurretValue);
		IObservableValue roboticArmTurretAngleObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__TURRET_ANGLE).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextLblTurretValueObserveWidget, roboticArmTurretAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblShoulderValueObserveWidget = WidgetProperties.text().observe(lblShoulderValue);
		IObservableValue roboticArmShoulderAngleObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__SHOULDER_ANGLE).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextLblShoulderValueObserveWidget, roboticArmShoulderAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblElbowValueObserveWidget = WidgetProperties.text().observe(lblElbowValue);
		IObservableValue roboticArmElbowAngleObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__ELBOW_ANGLE).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextLblElbowValueObserveWidget, roboticArmElbowAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextLblWristValueObserveWidget = WidgetProperties.text().observe(lblWristValue);
		IObservableValue roboticArmWristAngleObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__WRIST_ANGLE).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextLblWristValueObserveWidget, roboticArmWristAngleObserveValue, null, new TextToDegreeUpdateValueStrategy());
		//
		IObservableValue observeTextTxtInitializedObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtInitialized);
		IObservableValue roboticArmInitializedObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__INITIALIZED).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextTxtInitializedObserveWidget, roboticArmInitializedObserveValue, 
				null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(boolean.class, String.class)
				{
					@Override
					public Object convert(Object arg0)
					{
						return ((Boolean)arg0).booleanValue() ? READY_STR : NOT_READY_STR;
					}
				})
			);
		//
		IObservableValue observeTextTxtMovingObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtMoving);
		IObservableValue roboticArmArmMovingObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__ARM_MOVING).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextTxtMovingObserveWidget, roboticArmArmMovingObserveValue, 
				null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(boolean.class, String.class)
				{		
					@Override
					public Object convert(Object arg0)
					{
						return ((Boolean)arg0).booleanValue() ? MOVING_STR : STOPPED_STR;
					}
				})		
			);
		
		IObservableValue observeTextCmdMoveSpeedObserveWidget = WidgetProperties.singleSelectionIndex().observe(cmbSpeedMode);
		IObservableValue roboticArmMoveSpeedObserveValue = EMFProperties.value(Literals.ROBOTIC_ARM__SPEED).observeDetail(roboticArmBinder);
		m_bindingContext.bindValue(observeTextCmdMoveSpeedObserveWidget, roboticArmMoveSpeedObserveValue,
				null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(MoveSpeedLevel.class, Integer.class)
				{	
					@Override
					public Object convert(Object obj)
					{
						String literal = ((MoveSpeedLevel)obj).getLiteral();
						
						for (int index = 0; index < cmbSpeedMode.getItemCount(); index++)
						{
							if (literal.equals(cmbSpeedMode.getItems()[index]) == true)
							{
								return new Integer(index);
							}
						}
						return new Integer(-1);
					}
				})
			);
	}
		
	public void setRoboticArm(RoboticArm newRoboticArm)
	{
		if (newRoboticArm != this.roboticArm)
		{
			this.roboticArm = newRoboticArm;
			this.roboticArmBinder.setValue(newRoboticArm);
		}
	}		
	
	public RoboticArm getRoboticArm()
	{
		return roboticArm;
	}
	
	private class TextToDegreeUpdateValueStrategy extends UpdateValueStrategy
	{
		public TextToDegreeUpdateValueStrategy()
		{
			setConverter(new Converter(double.class, String.class)
			{
				@Override
				public Object convert(Object arg0)
				{
					return String.format("%,4.2f", ((Double)arg0).doubleValue());
				}				
			});
		}
	}
	
	private class AngleValueVerifyListener implements VerifyListener
	{
		@Override
		public void verifyText(VerifyEvent e)
		{
			String oldText = ((Text)e.widget).getText();
			String newText = oldText.substring(0, e.start) + e.text + oldText.substring(e.end);
			
			try
			{
				Double.parseDouble(newText);
			}
			catch(NumberFormatException ex)
			{
				e.text = "";
				e.doit = false;
			}
		}
	}
	
	public class InitJob extends Job
	{
		public InitJob()
		{
			super("Robotic Arm - Initialize");
			
			setSystem(true);
		}

		@Override
		public IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roboticArm.init();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	}
	
	public class StowJob extends Job
	{
		public StowJob()
		{
			super("Robotic Arm - Stow");
			
			setSystem(true);
		}

		@Override
		protected IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roboticArm.stow();
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
				
			return Status.OK_STATUS;
		}					
	};
	
	private class SpeedModeJob extends Job
	{
		private final MoveSpeedLevel speedModeLevel;
		
		public SpeedModeJob(MoveSpeedLevel level)
		{
			super("Robotic Arm - Speed Mode Change");
			
			speedModeLevel = level;
			
			setSystem(true);
		}
		
		@Override
		protected IStatus run(IProgressMonitor arg0)
		{
			try
			{
				roboticArm.cmdMoveSpeedLevel(speedModeLevel);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
	}
	
	private class MoveToJob extends Job
	{
		private final double turretValue;
		private final double shoulderValue;
		private final double elbowValue;
		private final double wristValue;
		
		public MoveToJob(double turret, double shoulder, double elbow, double wrist)
		{
			super("Robotic Arm - Move To");
			
			turretValue = turret;
			shoulderValue = shoulder;
			elbowValue = elbow;
			wristValue = wrist;
			
			setSystem(true);
		}
		
		@Override
		public IStatus run(IProgressMonitor monitor)
		{
			try
			{
				roboticArm.moveTo(turretValue, shoulderValue, elbowValue, wristValue);
			}
			catch (Exception ex)
			{
				ex.printStackTrace();
			}
			
			return Status.OK_STATUS;
		}
	}
}