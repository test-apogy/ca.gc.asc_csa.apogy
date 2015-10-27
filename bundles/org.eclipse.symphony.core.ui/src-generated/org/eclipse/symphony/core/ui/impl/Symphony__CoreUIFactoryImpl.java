/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.ResultNodePresentation;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.Symphony__CoreUIFactory;
import org.eclipse.symphony.core.ui.Symphony__CoreUIPackage;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreUIFactoryImpl extends EFactoryImpl implements Symphony__CoreUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CoreUIFactory init()
  {
		try {
			Symphony__CoreUIFactory theSymphony__CoreUIFactory = (Symphony__CoreUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreUIPackage.eNS_URI);
			if (theSymphony__CoreUIFactory != null) {
				return theSymphony__CoreUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CoreUIFactoryImpl()
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
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE: return createSymphonyCoreUiFacade();
			case Symphony__CoreUIPackage.SYMPHONY_RESOURCE_SETTINGS: return createSymphonyResourceSettings();
			case Symphony__CoreUIPackage.NEW_SYMPHONY_PROJECT_SETTINGS: return createNewSymphonyProjectSettings();
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SESSION_SETTINGS: return createNewSymphonySessionSettings();
			case Symphony__CoreUIPackage.NEW_SYMPHONY_SYSTEM_SETTINGS: return createNewSymphonySystemSettings();
			case Symphony__CoreUIPackage.RESULT_NODE_PRESENTATION: return createResultNodePresentation();
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
			case Symphony__CoreUIPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case Symphony__CoreUIPackage.ICONTAINER:
				return createIContainerFromString(eDataType, initialValue);
			case Symphony__CoreUIPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case Symphony__CoreUIPackage.IFOLDER:
				return createIFolderFromString(eDataType, initialValue);
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
			case Symphony__CoreUIPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case Symphony__CoreUIPackage.ICONTAINER:
				return convertIContainerToString(eDataType, instanceValue);
			case Symphony__CoreUIPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case Symphony__CoreUIPackage.IFOLDER:
				return convertIFolderToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCoreUiFacade createSymphonyCoreUiFacade()
  {
		SymphonyCoreUiFacadeImpl symphonyCoreUiFacade = new SymphonyCoreUiFacadeImpl();
		return symphonyCoreUiFacade;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyResourceSettings createSymphonyResourceSettings() {
		SymphonyResourceSettingsImpl symphonyResourceSettings = new SymphonyResourceSettingsImpl();
		return symphonyResourceSettings;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewSymphonyProjectSettings createNewSymphonyProjectSettings() {
		NewSymphonyProjectSettingsImpl newSymphonyProjectSettings = new NewSymphonyProjectSettingsImpl();
		return newSymphonyProjectSettings;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NewSymphonySessionSettings createNewSymphonySessionSettings()
  {
		NewSymphonySessionSettingsImpl newSymphonySessionSettings = new NewSymphonySessionSettingsImpl();
		return newSymphonySessionSettings;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewSymphonySystemSettings createNewSymphonySystemSettings() {
		NewSymphonySystemSettingsImpl newSymphonySystemSettings = new NewSymphonySystemSettingsImpl();
		return newSymphonySystemSettings;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResultNodePresentation createResultNodePresentation()
  {
		ResultNodePresentationImpl resultNodePresentation = new ResultNodePresentationImpl();
		return resultNodePresentation;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer createIContainerFromString(EDataType eDataType, String initialValue) {
		return (IContainer)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile createIFileFromString(EDataType eDataType, String initialValue) {
		return (IFile)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFolder createIFolderFromString(EDataType eDataType, String initialValue) {
		return (IFolder)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIFolderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreUIPackage getSymphony__CoreUIPackage() {
		return (Symphony__CoreUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CoreUIPackage getPackage()
  {
		return Symphony__CoreUIPackage.eINSTANCE;
	}

} //Symphony__CoreUIFactoryImpl
