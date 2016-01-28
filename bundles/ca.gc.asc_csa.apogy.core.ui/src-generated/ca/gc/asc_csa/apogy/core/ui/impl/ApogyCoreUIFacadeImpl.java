/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFactory;
import ca.gc.asc_csa.apogy.core.Activator;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;
import ca.gc.asc_csa.apogy.core.ui.natures.ApogyProjectNature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl#getDefaultApogyProjectNamePrefix <em>Default Apogy Project Name Prefix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl#getDefaultApogySessionFilename <em>Default Apogy Session Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl#getDefaultApogySessionFilenameExtension <em>Default Apogy Session Filename Extension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl#getDefaultApogySessionFolderName <em>Default Apogy Session Folder Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyCoreUIFacadeImpl extends MinimalEObjectImpl.Container
		implements ApogyCoreUIFacade {

	/**
	 * The default value of the '{@link #getDefaultApogyProjectNamePrefix()
	 * <em>Default Apogy Project Name Prefix</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogyProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_APOGY_PROJECT_NAME_PREFIX_EDEFAULT = "Project";
	/**
	 * The cached value of the '{@link #getDefaultApogyProjectNamePrefix()
	 * <em>Default Apogy Project Name Prefix</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogyProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String defaultApogyProjectNamePrefix = DEFAULT_APOGY_PROJECT_NAME_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultApogySessionFilename()
	 * <em>Default Apogy Session Filename</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_APOGY_SESSION_FILENAME_EDEFAULT = "session";
	/**
	 * The cached value of the '{@link #getDefaultApogySessionFilename()
	 * <em>Default Apogy Session Filename</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFilename()
	 * @generated
	 * @ordered
	 */
	protected String defaultApogySessionFilename = DEFAULT_APOGY_SESSION_FILENAME_EDEFAULT;
	/**
	 * The default value of the '
	 * {@link #getDefaultApogySessionFilenameExtension()
	 * <em>Default Apogy Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_APOGY_SESSION_FILENAME_EXTENSION_EDEFAULT = "sym";
	/**
	 * The cached value of the '
	 * {@link #getDefaultApogySessionFilenameExtension()
	 * <em>Default Apogy Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected String defaultApogySessionFilenameExtension = DEFAULT_APOGY_SESSION_FILENAME_EXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultApogySessionFolderName()
	 * <em>Default Apogy Session Folder Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_APOGY_SESSION_FOLDER_NAME_EDEFAULT = "Sessions";
	/**
	 * The cached value of the '{@link #getDefaultApogySessionFolderName()
	 * <em>Default Apogy Session Folder Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultApogySessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultApogySessionFolderName = DEFAULT_APOGY_SESSION_FOLDER_NAME_EDEFAULT;
	private static ApogyCoreUIFacade instance = null;

	public static ApogyCoreUIFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCoreUIFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultApogyProjectNamePrefix() {
		return defaultApogyProjectNamePrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultApogySessionFilename() {
		return defaultApogySessionFilename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultApogySessionFilenameExtension() {
		return defaultApogySessionFilenameExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultApogySessionFolderName() {
		return defaultApogySessionFolderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IProject createApogyProject(NewApogyProjectSettings settings) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(settings.getName());
		try {
			if (!project.exists()) {
				project.create(null);
				if (!project.isOpen()) {
					project.open(null);
				}

				IProjectDescription desc = project.getDescription();
				String[] prevNatures = desc.getNatureIds();
				String[] newNatures = new String[prevNatures.length + 1];
				System.arraycopy(prevNatures, 0, newNatures, 0,
						prevNatures.length);
				newNatures[prevNatures.length] = ApogyProjectNature.NATURE_ID;
				desc.setNatureIds(newNatures);
				project.setDescription(desc, null);
			}
		} catch (CoreException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while creating project <" + settings.getName() + ">", EventSeverity.ERROR, e);
		}

		return project;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IFolder createApogySessionFolder(
			NewApogyProjectSettings settings) {
		IFolder folder = null;

		try {
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(settings.getName());
			if (!project.isOpen()) {
				project.open(null);
			}
			folder = project.getFolder(ApogyCoreUIFacade.INSTANCE
					.getDefaultApogySessionFolderName());
			if (!folder.exists()){
				folder.create(true, true, null);
			}
		} catch (CoreException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while creating session folder <" + ApogyCoreUIFacade.INSTANCE
					.getDefaultApogySessionFolderName() + ">", EventSeverity.ERROR, e);
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public InvocatorSession createApogySession(
			NewApogySessionSettings sessionSettings) {
		InvocatorSession session = ApogyCoreFacade.INSTANCE
				.createApogySession(sessionSettings.isCreateEnvironment(),
						sessionSettings.isCreatePrograms(),
						sessionSettings.isCreateDataProducts(),
						sessionSettings.isCreateTools());

		return session;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IFile getApogySessionFile(IContainer resourceContainer,
			String filename) {
		return resourceContainer.getFile(new Path(filename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IFile createApogySessionFile(IContainer resourceContainer,
			String filename, InvocatorSession session) throws Exception {
		IFile modelFile = resourceContainer.getFile(new Path(filename));

		ResourceSet resourceSet = new ResourceSetImpl();

		// Get the URI of the model file.
		URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath()
				.toString(), true);

		// Create a resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		// Add the initial model object to the contents.
		resource.getContents().add(session);

		// Save the contents of the resource to the file system.
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		resource.save(options);
		return modelFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public InvocatorSession createInvocatorSession(
			NewApogySessionSettings sessionSettings) {
		InvocatorSession session = ApogyCoreFacade.INSTANCE
				.createApogySession(sessionSettings.isCreateEnvironment(),
						sessionSettings.isCreatePrograms(),
						sessionSettings.isCreateDataProducts(),
						sessionSettings.isCreateTools());

		return session;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public ApogySystem createApogySystem(
			NewApogySystemSettings systemSettings) {
		ApogySystem apogySystem = ApogyCoreFactory.eINSTANCE
				.createApogySystem();

		// Adds an empty TopologyRoot
		AggregateGroupNode rootNode = ApogyCommonTopologyFactory.eINSTANCE
				.createAggregateGroupNode();
		TopologyRoot topologyRoot = ApogyCoreFactory.eINSTANCE
				.createTopologyRoot();
		topologyRoot.setOriginNode(rootNode);
		apogySystem.setTopologyRoot(topologyRoot);

		// Adds an empty BindingSet
		BindingsSet bindingsSet = ApogyCommonTopologyBindingsFactory.eINSTANCE
				.createBindingsSet();
		apogySystem.setBindingSet(bindingsSet);

		// Adds an empty Connection Points List
		ConnectionPointsList connectionPointsList = ApogyCoreFactory.eINSTANCE
				.createConnectionPointsList();
		apogySystem.setConnectionPointsList(connectionPointsList);

		return apogySystem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX:
				return getDefaultApogyProjectNamePrefix();
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME:
				return getDefaultApogySessionFilename();
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION:
				return getDefaultApogySessionFilenameExtension();
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME:
				return getDefaultApogySessionFolderName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_PROJECT_NAME_PREFIX:
				return DEFAULT_APOGY_PROJECT_NAME_PREFIX_EDEFAULT == null ? defaultApogyProjectNamePrefix != null : !DEFAULT_APOGY_PROJECT_NAME_PREFIX_EDEFAULT.equals(defaultApogyProjectNamePrefix);
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME:
				return DEFAULT_APOGY_SESSION_FILENAME_EDEFAULT == null ? defaultApogySessionFilename != null : !DEFAULT_APOGY_SESSION_FILENAME_EDEFAULT.equals(defaultApogySessionFilename);
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FILENAME_EXTENSION:
				return DEFAULT_APOGY_SESSION_FILENAME_EXTENSION_EDEFAULT == null ? defaultApogySessionFilenameExtension != null : !DEFAULT_APOGY_SESSION_FILENAME_EXTENSION_EDEFAULT.equals(defaultApogySessionFilenameExtension);
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE__DEFAULT_APOGY_SESSION_FOLDER_NAME:
				return DEFAULT_APOGY_SESSION_FOLDER_NAME_EDEFAULT == null ? defaultApogySessionFolderName != null : !DEFAULT_APOGY_SESSION_FOLDER_NAME_EDEFAULT.equals(defaultApogySessionFolderName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___CREATE_APOGY_PROJECT__NEWSYMPHONYPROJECTSETTINGS:
				return createApogyProject((NewApogyProjectSettings)arguments.get(0));
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS:
				return createApogySessionFolder((NewApogyProjectSettings)arguments.get(0));
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION__NEWSYMPHONYSESSIONSETTINGS:
				return createApogySession((NewApogySessionSettings)arguments.get(0));
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___CREATE_APOGY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION:
				try {
					return createApogySessionFile((IContainer)arguments.get(0), (String)arguments.get(1), (InvocatorSession)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___GET_APOGY_SESSION_FILE__ICONTAINER_STRING:
				return getApogySessionFile((IContainer)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE___CREATE_APOGY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS:
				return createApogySystem((NewApogySystemSettings)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (defaultApogyProjectNamePrefix: ");
		result.append(defaultApogyProjectNamePrefix);
		result.append(", defaultApogySessionFilename: ");
		result.append(defaultApogySessionFilename);
		result.append(", defaultApogySessionFilenameExtension: ");
		result.append(defaultApogySessionFilenameExtension);
		result.append(", defaultApogySessionFolderName: ");
		result.append(defaultApogySessionFolderName);
		result.append(')');
		return result.toString();
	}

} // ApogyCoreUIFacadeImpl
