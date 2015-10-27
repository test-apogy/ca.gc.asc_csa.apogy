/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.core.environment.ui.MapAnnotation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;
import org.jfree.chart.annotations.AbstractXYAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MapAnnotationImpl extends MapViewItemPresentationImpl implements MapAnnotation
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapAnnotationImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__CoreEnvironmentUIPackage.Literals.MAP_ANNOTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<AbstractXYAnnotation> getXYShapeAnnotation()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case Symphony__CoreEnvironmentUIPackage.MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION:
				return getXYShapeAnnotation();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MapAnnotationImpl
