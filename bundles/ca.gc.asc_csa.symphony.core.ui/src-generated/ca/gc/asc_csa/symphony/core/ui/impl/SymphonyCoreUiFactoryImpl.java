/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.ui.impl;

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
import ca.gc.asc_csa.symphony.core.ui.NewSymphonyProjectSettings;
import ca.gc.asc_csa.symphony.core.ui.NewSymphonySessionSettings;
import ca.gc.asc_csa.symphony.core.ui.NewSymphonySystemSettings;
import ca.gc.asc_csa.symphony.core.ui.ResultNodePresentation;
import ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade;
import ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFactory;
import ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage;
import ca.gc.asc_csa.symphony.core.ui.SymphonyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyCoreUiFactoryImpl extends EFactoryImpl implements SymphonyCoreUiFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyCoreUiFactory init()
  {
		try {
			SymphonyCoreUiFactory theSymphonyCoreUiFactory = (SymphonyCoreUiFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyCoreUiPackage.eNS_URI);
			if (theSymphonyCoreUiFactory != null) {
				return theSymphonyCoreUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyCoreUiFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyCoreUiFactoryImpl()
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
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE: return createSymphonyCoreUiFacade();
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS: return createSymphonyResourceSettings();
			case SymphonyCoreUiPackage.NEW_SYMPHONY_PROJECT_SETTINGS: return createNewSymphonyProjectSettings();
			case SymphonyCoreUiPackage.NEW_SYMPHONY_SESSION_SETTINGS: return createNewSymphonySessionSettings();
			case SymphonyCoreUiPackage.NEW_SYMPHONY_SYSTEM_SETTINGS: return createNewSymphonySystemSettings();
			case SymphonyCoreUiPackage.RESULT_NODE_PRESENTATION: return createResultNodePresentation();
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
			case SymphonyCoreUiPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case SymphonyCoreUiPackage.ICONTAINER:
				return createIContainerFromString(eDataType, initialValue);
			case SymphonyCoreUiPackage.IFILE:
				return createIFileFromString(eDataType, initialValue);
			case SymphonyCoreUiPackage.IFOLDER:
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
			case SymphonyCoreUiPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case SymphonyCoreUiPackage.ICONTAINER:
				return convertIContainerToString(eDataType, instanceValue);
			case SymphonyCoreUiPackage.IFILE:
				return convertIFileToString(eDataType, instanceValue);
			case SymphonyCoreUiPackage.IFOLDER:
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
  public SymphonyCoreUiPackage getSymphonyCoreUiPackage()
  {
		return (SymphonyCoreUiPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyCoreUiPackage getPackage()
  {
		return SymphonyCoreUiPackage.eINSTANCE;
	}

} //SymphonyCoreUiFactoryImpl
