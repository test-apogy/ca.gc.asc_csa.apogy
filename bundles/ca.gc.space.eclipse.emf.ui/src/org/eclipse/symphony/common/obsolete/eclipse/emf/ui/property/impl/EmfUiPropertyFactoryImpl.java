/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfUiPropertyFactoryImpl extends EFactoryImpl implements EmfUiPropertyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmfUiPropertyFactory init() {
		try {
			EmfUiPropertyFactory theEmfUiPropertyFactory = (EmfUiPropertyFactory)EPackage.Registry.INSTANCE.getEFactory(EmfUiPropertyPackage.eNS_URI);
			if (theEmfUiPropertyFactory != null) {
				return theEmfUiPropertyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfUiPropertyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfUiPropertyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTOR: return createPropertyCellEditorContributor();
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_CONTRIBUTORS: return createPropertyCellEditorContributors();
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTOR: return createPropertyCellViewerContentContributor();
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_CONTRIBUTORS: return createPropertyCellViewerContentContributors();
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_PROVIDER:
				return createPropertyCellEditorProviderFromString(eDataType, initialValue);
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_PROVIDER:
				return createPropertyCellViewerContentProviderFromString(eDataType, initialValue);
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
			case EmfUiPropertyPackage.PROPERTY_CELL_EDITOR_PROVIDER:
				return convertPropertyCellEditorProviderToString(eDataType, instanceValue);
			case EmfUiPropertyPackage.PROPERTY_CELL_VIEWER_CONTENT_PROVIDER:
				return convertPropertyCellViewerContentProviderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellEditorContributor createPropertyCellEditorContributor() {
		PropertyCellEditorContributorImpl propertyCellEditorContributor = new PropertyCellEditorContributorImpl();
		return propertyCellEditorContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellEditorContributors createPropertyCellEditorContributors() {
		PropertyCellEditorContributorsImpl propertyCellEditorContributors = new PropertyCellEditorContributorsImpl();
		return propertyCellEditorContributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellViewerContentContributor createPropertyCellViewerContentContributor() {
		PropertyCellViewerContentContributorImpl propertyCellViewerContentContributor = new PropertyCellViewerContentContributorImpl();
		return propertyCellViewerContentContributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellViewerContentContributors createPropertyCellViewerContentContributors() {
		PropertyCellViewerContentContributorsImpl propertyCellViewerContentContributors = new PropertyCellViewerContentContributorsImpl();
		return propertyCellViewerContentContributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellEditorProvider createPropertyCellEditorProviderFromString(EDataType eDataType, String initialValue) {
		return (PropertyCellEditorProvider)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyCellEditorProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCellViewerContentProvider createPropertyCellViewerContentProviderFromString(EDataType eDataType, String initialValue) {
		return (PropertyCellViewerContentProvider)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyCellViewerContentProviderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfUiPropertyPackage getEmfUiPropertyPackage() {
		return (EmfUiPropertyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfUiPropertyPackage getPackage() {
		return EmfUiPropertyPackage.eINSTANCE;
	}

} //EmfUiPropertyFactoryImpl
