/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.FeatureOfInterestPickingTool;
import org.eclipse.symphony.addons.Ruler3DTool;
import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.SimpleToolList;
import org.eclipse.symphony.addons.SunVector3DTool;
import org.eclipse.symphony.addons.SunVector3DToolNode;
import org.eclipse.symphony.addons.Symphony__AddonsFactory;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.addons.Trajectory3DTool;
import org.eclipse.symphony.addons.Trajectory3DToolNode;
import org.eclipse.symphony.common.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsFactoryImpl extends EFactoryImpl implements Symphony__AddonsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__AddonsFactory init()
  {
		try {
			Symphony__AddonsFactory theSymphony__AddonsFactory = (Symphony__AddonsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsPackage.eNS_URI);
			if (theSymphony__AddonsFactory != null) {
				return theSymphony__AddonsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__AddonsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case Symphony__AddonsPackage.SIMPLE_TOOL_LIST: return createSimpleToolList();
			case Symphony__AddonsPackage.RULER3_DTOOL: return createRuler3DTool();
			case Symphony__AddonsPackage.RULER3D_TOOL_NODE: return createRuler3dToolNode();
			case Symphony__AddonsPackage.FEATURE_OF_INTEREST_PICKING_TOOL: return createFeatureOfInterestPickingTool();
			case Symphony__AddonsPackage.SUN_VECTOR3_DTOOL: return createSunVector3DTool();
			case Symphony__AddonsPackage.SUN_VECTOR3_DTOOL_NODE: return createSunVector3DToolNode();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL: return createTrajectory3DTool();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE: return createTrajectory3DToolNode();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case Symphony__AddonsPackage.NODE_SELECTION:
				return createNodeSelectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__AddonsPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case Symphony__AddonsPackage.NODE_SELECTION:
				return convertNodeSelectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleToolList createSimpleToolList() {
		SimpleToolListImpl simpleToolList = new SimpleToolListImpl();
		return simpleToolList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3DTool createRuler3DTool() {
		Ruler3DToolImpl ruler3DTool = new Ruler3DToolImpl();
		return ruler3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruler3dToolNode createRuler3dToolNode() {
		Ruler3dToolNodeImpl ruler3dToolNode = new Ruler3dToolNodeImpl();
		return ruler3dToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestPickingTool createFeatureOfInterestPickingTool() {
		FeatureOfInterestPickingToolImpl featureOfInterestPickingTool = new FeatureOfInterestPickingToolImpl();
		return featureOfInterestPickingTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DTool createSunVector3DTool() {
		SunVector3DToolImpl sunVector3DTool = new SunVector3DToolImpl();
		return sunVector3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunVector3DToolNode createSunVector3DToolNode() {
		SunVector3DToolNodeImpl sunVector3DToolNode = new SunVector3DToolNodeImpl();
		return sunVector3DToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DTool createTrajectory3DTool() {
		Trajectory3DToolImpl trajectory3DTool = new Trajectory3DToolImpl();
		return trajectory3DTool;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNode createTrajectory3DToolNode() {
		Trajectory3DToolNodeImpl trajectory3DToolNode = new Trajectory3DToolNodeImpl();
		return trajectory3DToolNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) 
	{
		  Color3f color3f = new Color3f();
		  
		  String[] values = initialValue.split(",");
		  
		  color3f.x = Float.parseFloat(values[0]);
		  color3f.y = Float.parseFloat(values[1]);
		  color3f.z = Float.parseFloat(values[2]);

		  return color3f;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) 
	{
		  Color3f color3f = (Color3f) instanceValue;		 
		  String string = color3f.x + "," + color3f.y + "," + color3f.z;		  
		  return string;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeSelection createNodeSelectionFromString(EDataType eDataType, String initialValue) {
		return (NodeSelection)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeSelectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsPackage getSymphony__AddonsPackage() {
		return (Symphony__AddonsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__AddonsPackage getPackage()
  {
		return Symphony__AddonsPackage.eINSTANCE;
	}

} //Symphony__AddonsFactoryImpl
