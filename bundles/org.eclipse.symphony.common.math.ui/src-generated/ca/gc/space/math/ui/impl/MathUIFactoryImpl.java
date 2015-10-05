/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.space.math.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.math.ui.*;

import ca.gc.space.math.ui.Dummy;
import ca.gc.space.math.ui.MathUIFactory;
import ca.gc.space.math.ui.MathUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathUIFactoryImpl extends EFactoryImpl implements MathUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MathUIFactory init()
  {
		try {
			MathUIFactory theMathUIFactory = (MathUIFactory)EPackage.Registry.INSTANCE.getEFactory(MathUIPackage.eNS_URI);
			if (theMathUIFactory != null) {
				return theMathUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MathUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathUIFactoryImpl()
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
			case MathUIPackage.DUMMY: return createDummy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Dummy createDummy()
  {
		DummyImpl dummy = new DummyImpl();
		return dummy;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathUIPackage getMathUIPackage()
  {
		return (MathUIPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MathUIPackage getPackage()
  {
		return MathUIPackage.eINSTANCE;
	}

} //MathUIFactoryImpl
