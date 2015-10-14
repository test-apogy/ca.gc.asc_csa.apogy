/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.impl;

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
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.bindings.BindingsSet;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsFactory;
import org.eclipse.symphony.core.Activator;
import org.eclipse.symphony.core.ConnectionPointsList;
import org.eclipse.symphony.core.SymphonyCoreFacade;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.SymphonyCoreUiPackage;
import org.eclipse.symphony.core.ui.natures.SymphonyProjectNature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl#getDefaultSymphonyProjectNamePrefix <em>Default Symphony Project Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl#getDefaultSymphonySessionFilename <em>Default Symphony Session Filename</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl#getDefaultSymphonySessionFilenameExtension <em>Default Symphony Session Filename Extension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl#getDefaultSymphonySessionFolderName <em>Default Symphony Session Folder Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymphonyCoreUiFacadeImpl extends MinimalEObjectImpl.Container
		implements SymphonyCoreUiFacade {

	/**
	 * The default value of the '{@link #getDefaultSymphonyProjectNamePrefix()
	 * <em>Default Symphony Project Name Prefix</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonyProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT = "Project";
	/**
	 * The cached value of the '{@link #getDefaultSymphonyProjectNamePrefix()
	 * <em>Default Symphony Project Name Prefix</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonyProjectNamePrefix()
	 * @generated
	 * @ordered
	 */
	protected String defaultSymphonyProjectNamePrefix = DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultSymphonySessionFilename()
	 * <em>Default Symphony Session Filename</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT = "session";
	/**
	 * The cached value of the '{@link #getDefaultSymphonySessionFilename()
	 * <em>Default Symphony Session Filename</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFilename()
	 * @generated
	 * @ordered
	 */
	protected String defaultSymphonySessionFilename = DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT;
	/**
	 * The default value of the '
	 * {@link #getDefaultSymphonySessionFilenameExtension()
	 * <em>Default Symphony Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT = "sym";
	/**
	 * The cached value of the '
	 * {@link #getDefaultSymphonySessionFilenameExtension()
	 * <em>Default Symphony Session Filename Extension</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFilenameExtension()
	 * @generated
	 * @ordered
	 */
	protected String defaultSymphonySessionFilenameExtension = DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultSymphonySessionFolderName()
	 * <em>Default Symphony Session Folder Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_SYMPHONY_SESSION_FOLDER_NAME_EDEFAULT = "Sessions";
	/**
	 * The cached value of the '{@link #getDefaultSymphonySessionFolderName()
	 * <em>Default Symphony Session Folder Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDefaultSymphonySessionFolderName()
	 * @generated
	 * @ordered
	 */
	protected String defaultSymphonySessionFolderName = DEFAULT_SYMPHONY_SESSION_FOLDER_NAME_EDEFAULT;
	private static SymphonyCoreUiFacade instance = null;

	public static SymphonyCoreUiFacade getInstance() {
		if (instance == null) {
			instance = new SymphonyCoreUiFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyCoreUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCoreUiPackage.Literals.SYMPHONY_CORE_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSymphonyProjectNamePrefix() {
		return defaultSymphonyProjectNamePrefix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSymphonySessionFilename() {
		return defaultSymphonySessionFilename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSymphonySessionFilenameExtension() {
		return defaultSymphonySessionFilenameExtension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultSymphonySessionFolderName() {
		return defaultSymphonySessionFolderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IProject createSymphonyProject(NewSymphonyProjectSettings settings) {
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
				newNatures[prevNatures.length] = SymphonyProjectNature.NATURE_ID;
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
	public IFolder createSymphonySessionFolder(
			NewSymphonyProjectSettings settings) {
		IFolder folder = null;

		try {
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(settings.getName());
			if (!project.isOpen()) {
				project.open(null);
			}
			folder = project.getFolder(SymphonyCoreUiFacade.INSTANCE
					.getDefaultSymphonySessionFolderName());
			if (!folder.exists()){
				folder.create(true, true, null);
			}
		} catch (CoreException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while creating session folder <" + SymphonyCoreUiFacade.INSTANCE
					.getDefaultSymphonySessionFolderName() + ">", EventSeverity.ERROR, e);
		}
		return folder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public InvocatorSession createSymphonySession(
			NewSymphonySessionSettings sessionSettings) {
		InvocatorSession session = SymphonyCoreFacade.INSTANCE
				.createSymphonySession(sessionSettings.isCreateEnvironment(),
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
	public IFile getSymphonySessionFile(IContainer resourceContainer,
			String filename) {
		return resourceContainer.getFile(new Path(filename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public IFile createSymphonySessionFile(IContainer resourceContainer,
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
			NewSymphonySessionSettings sessionSettings) {
		InvocatorSession session = SymphonyCoreFacade.INSTANCE
				.createSymphonySession(sessionSettings.isCreateEnvironment(),
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
	public SymphonySystem createSymphonySystem(
			NewSymphonySystemSettings systemSettings) {
		SymphonySystem symphonySystem = SymphonyCoreFactory.eINSTANCE
				.createSymphonySystem();

		// Adds an empty TopologyRoot
		AggregateGroupNode rootNode = TopologyFactory.eINSTANCE
				.createAggregateGroupNode();
		TopologyRoot topologyRoot = SymphonyCoreFactory.eINSTANCE
				.createTopologyRoot();
		topologyRoot.setOriginNode(rootNode);
		symphonySystem.setTopologyRoot(topologyRoot);

		// Adds an empty BindingSet
		BindingsSet bindingsSet = TopologyBindingsFactory.eINSTANCE
				.createBindingsSet();
		symphonySystem.setBindingSet(bindingsSet);

		// Adds an empty Connection Points List
		ConnectionPointsList connectionPointsList = SymphonyCoreFactory.eINSTANCE
				.createConnectionPointsList();
		symphonySystem.setConnectionPointsList(connectionPointsList);

		return symphonySystem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX:
				return getDefaultSymphonyProjectNamePrefix();
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME:
				return getDefaultSymphonySessionFilename();
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION:
				return getDefaultSymphonySessionFilenameExtension();
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME:
				return getDefaultSymphonySessionFolderName();
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
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX:
				return DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT == null ? defaultSymphonyProjectNamePrefix != null : !DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT.equals(defaultSymphonyProjectNamePrefix);
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME:
				return DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT == null ? defaultSymphonySessionFilename != null : !DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT.equals(defaultSymphonySessionFilename);
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION:
				return DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT == null ? defaultSymphonySessionFilenameExtension != null : !DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT.equals(defaultSymphonySessionFilenameExtension);
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME:
				return DEFAULT_SYMPHONY_SESSION_FOLDER_NAME_EDEFAULT == null ? defaultSymphonySessionFolderName != null : !DEFAULT_SYMPHONY_SESSION_FOLDER_NAME_EDEFAULT.equals(defaultSymphonySessionFolderName);
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
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_PROJECT__NEWSYMPHONYPROJECTSETTINGS:
				return createSymphonyProject((NewSymphonyProjectSettings)arguments.get(0));
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS:
				return createSymphonySessionFolder((NewSymphonyProjectSettings)arguments.get(0));
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION__NEWSYMPHONYSESSIONSETTINGS:
				return createSymphonySession((NewSymphonySessionSettings)arguments.get(0));
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION:
				try {
					return createSymphonySessionFile((IContainer)arguments.get(0), (String)arguments.get(1), (InvocatorSession)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___GET_SYMPHONY_SESSION_FILE__ICONTAINER_STRING:
				return getSymphonySessionFile((IContainer)arguments.get(0), (String)arguments.get(1));
			case SymphonyCoreUiPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS:
				return createSymphonySystem((NewSymphonySystemSettings)arguments.get(0));
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
		result.append(" (defaultSymphonyProjectNamePrefix: ");
		result.append(defaultSymphonyProjectNamePrefix);
		result.append(", defaultSymphonySessionFilename: ");
		result.append(defaultSymphonySessionFilename);
		result.append(", defaultSymphonySessionFilenameExtension: ");
		result.append(defaultSymphonySessionFilenameExtension);
		result.append(", defaultSymphonySessionFolderName: ");
		result.append(defaultSymphonySessionFolderName);
		result.append(')');
		return result.toString();
	}

} // SymphonyCoreUiFacadeImpl
