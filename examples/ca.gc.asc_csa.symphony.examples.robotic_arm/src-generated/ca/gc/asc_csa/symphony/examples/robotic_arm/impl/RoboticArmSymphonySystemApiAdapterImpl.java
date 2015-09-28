/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.robotic_arm.impl;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EClass;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.symphony.core.impl.SymphonySystemApiAdapterImpl;
import ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData;
import ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmFactory;
import ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage;
import ca.gc.space.math.MathFacade;
import ca.gc.space.math.Matrix4x4;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Robotic Arm Symphony System Api Adapter</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class RoboticArmSymphonySystemApiAdapterImpl extends
		SymphonySystemApiAdapterImpl implements
		RoboticArmSymphonySystemApiAdapter {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboticArmSymphonySystemApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER;
	}

	/**
	 * This helper function is used to get the API adapter's
	 * robotic arm instance.
	 * @return The adapter's robotic arm instance
	 * @generated_NOT
	 */
	protected RoboticArm getRoboticArm()
	{
		// Just cast and return the instance
		return (RoboticArm) getInstance();
	}

	/**
	 * This method will return a 4x4 matrix, whose components represent
	 * the transformation (e.g. rotations, translations, etc.) from where
	 * the given operation took place to the robotic arm's root topology node;
	 * for example, for the operation moveTo(), this describes the
	 * transformation from the tip of its hand to its base (e.g. root). If
	 * no transformation occurred, then the identity matrix should be
	 * returned; note that this, in fact, is what is returned by the
	 * superclass's version of this method.
	 * 
	 * @param operationCall The operation which took place
	 * @return The transformation from where the operation took place to the robotic arm's root
	 */
	@Override
	public Matrix4x4 createResultMatrix(OperationCall operationCall)
	{
		// If this is the moveTo() operation
		if (operationCall.getEOperation().getOperationID() ==
				EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE)
		{
			// Get the topology node at the tip of the robotic arm's hand
			Node tip = TopologyFacade.INSTANCE.findNodesByID("ROBOTIC_ARM_SYM_SYS_HAND_TIP",
								 this.getSymphonySystem().getTopologyRoot().getOriginNode()).get(0);
			
			// Get the topology node at the root of the robotic arm
			Node root = TopologyFacade.INSTANCE.findNodesByID("ROBOTIC_ARM_SYM_SYS_ROOT",
							  this.getSymphonySystem().getTopologyRoot().getOriginNode()).get(0);
			
			// Get a composite transformation which encompasses all
			// of the transformations between those two nodes
			Matrix4d matrix4d = TopologyFacade.INSTANCE.expressInFrame(tip,	root);
			
			// Create a EObject wrapper for the matrix and return it
			return MathFacade.INSTANCE.createMatrix4x4(matrix4d);
		}
		// Otherwise, this is some other operation
		else
		{
			// Just call the superclass's version of this method
			return super.createResultMatrix(operationCall);
		}
	}

	/**
	 * This is a factory method that can be used to generate
	 * initialization data instances of an appropriate type
	 * for this adapter.
	 * 
	 * @return The newly created initialization data object
	 */
	@Override
	public AbstractInitializationData createInitializationData()
	{
		// Call the appropriate factory method for this package to get
		// a RoboticArmData instance and then return it.
		return SymphonyExampleRoboticArmFactory.eINSTANCE.createRoboticArmData();
	}

	/**
	 * This is a method which is used to apply the given
	 * initialization data object to the API adapter's instance;
	 * this is particularly useful in conjunction with collect()
	 * as it can be used to save state and then load it back later.
	 * 
	 * @param initializationData The initialization data that is to be applied to the adapter's instance.
	 * @see #collect(AbstractInitializationData)
	 */
	@Override
	public void apply(AbstractInitializationData initializationData) 
	{
		// Call the superclass's version of this method
		super.apply(initializationData);
		
		// If there is no robotic arm instance
		if (this.getRoboticArm() == null)
		{
			// Just return
			return;
		}
		
		// If this is an initialization data object which is of the correct type
		if (initializationData instanceof RoboticArmData) 
		{
			// Cast down appropriately
			RoboticArmData roboticArmData = (RoboticArmData) initializationData;
			
			// If the robotic arm is supposed to be initialized
			if (roboticArmData.isInitialized() == true)
			{
				// If the robotic arm currently isn't initialized
				if (this.getRoboticArm().isInitialized() == false)
				{
					// Just initialize it
					this.getRoboticArm().init();
				}
				
				// Set the robotic arm's move speed accordingly
				this.getRoboticArm().cmdMoveSpeedLevel(roboticArmData.getSpeed());
				
				// Move the robotic arm to the given angles
				// Note: The angles in the initialization data object
				//       is in degrees, but moveTo() accepts radians.
				this.getRoboticArm().moveTo(Math.toRadians(roboticArmData.getTurretAngle()),
											Math.toRadians(roboticArmData.getShoulderAngle()),
											Math.toRadians(roboticArmData.getElbowAngle()),
											Math.toRadians(roboticArmData.getWristAngle()));
			}
			// Otherwise, the robotic arm is not supposed to be initialized
			else
			{
				// If the robotic arm is currently initialized
				if (this.getRoboticArm().isInitialized() == true)
				{
					// Generate the error message
					String message = "The given initialization data cannot be applied " +
									 "to this robotic arm; the given init data says that " +
									 "the arm should not be initialized , when " +
									 "it already is in that state.";
					
					// Throw an exception to indicate that the apply() has failed; this will
					// be caught and logged by Symphony
					throw new RuntimeException(message);
				}
			}
		}
	}

	/**
	 * This is a method which is used to collect and fill the given
	 * initialization data object with relevant data from the API
	 * adapter's instance; this is particularly useful in conjunction
	 * with apply() as it can be used to save data, which can then be
	 * loaded back later.
	 * 
	 * @param initializationData The initialization data that is to store the state of the adapter's instance.
	 * @see #apply(AbstractInitializationData)
	 */
	@Override
	public void collect(AbstractInitializationData initializationData)
	{
		// Call the superclass's version of this method
		super.collect(initializationData);

		// If there is no robotic arm instance associated with this API adapter
		if (this.getRoboticArm() == null)
		{
			// Just return
			return;
		}
		
		// If the given initialization data object is of the correct type
		if (initializationData instanceof RoboticArmData)
		{
			// Cast down appropriately
			RoboticArmData roboticArmData = (RoboticArmData) initializationData;

			// Store the robotic arm's numerous values
			roboticArmData.setInitialized(this.getRoboticArm().isInitialized());
			roboticArmData.setSpeed(this.getRoboticArm().getSpeed());
			roboticArmData.setElbowAngle(this.getRoboticArm().getElbowAngle());
			roboticArmData.setShoulderAngle(this.getRoboticArm().getShoulderAngle());
			roboticArmData.setTurretAngle(this.getRoboticArm().getTurretAngle());
			roboticArmData.setWristAngle(this.getRoboticArm().getWristAngle());
		}
	}
} // RoboticArmSymphonySystemApiAdapterImpl
