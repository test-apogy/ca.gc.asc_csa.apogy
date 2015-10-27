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
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFactory;
import org.eclipse.symphony.common.topology.bindings.BindingsSet;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsFactory;
import org.eclipse.symphony.core.Activator;
import org.eclipse.symphony.core.ConnectionPointsList;
import org.eclipse.symphony.core.Symphony__CoreFacade;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.Symphony__CoreUIFacade;
import org.eclipse.symphony.core.ui.Symphony__CoreUIPackage;
import org.eclipse.symphony.core.ui.natures.SymphonyProjectNature;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFacadeImpl#getDefaultSymphonyProjectNamePrefix <em>Default Symphony Project Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFacadeImpl#getDefaultSymphonySessionFilename <em>Default Symphony Session Filename</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFacadeImpl#getDefaultSymphonySessionFilenameExtension <em>Default Symphony Session Filename Extension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFacadeImpl#getDefaultSymphonySessionFolderName <em>Default Symphony Session Folder Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Symphony__CoreUIFacadeImpl extends MinimalEObjectImpl.Container
		implements Symphony__CoreUIFacade {

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
	private static Symphony__CoreUIFacade instance = null;

	public static Symphony__CoreUIFacade getInstance() {
		if (instance == null) {
			instance = new Symphony__CoreUIFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreUIPackage.Literals.SYMPHONY_CORE_UI_FACADE;
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
			folder = project.getFolder(Symphony__CoreUIFacade.INSTANCE
					.getDefaultSymphonySessionFolderName());
			if (!folder.exists()){
				folder.create(true, true, null);
			}
		} catch (CoreException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while creating session folder <" + Symphony__CoreUIFacade.INSTANCE
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
		InvocatorSession session = Symphony__CoreFacade.INSTANCE
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
		InvocatorSession session = Symphony__CoreFacade.INSTANCE
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
		SymphonySystem symphonySystem = Symphony__CoreFactory.eINSTANCE
				.createSymphonySystem();

		// Adds an empty TopologyRoot
		AggregateGroupNode rootNode = Symphony__CommonTopologyFactory.eINSTANCE
				.createAggregateGroupNode();
		TopologyRoot topologyRoot = Symphony__CoreFactory.eINSTANCE
				.createTopologyRoot();
		topologyRoot.setOriginNode(rootNode);
		symphonySystem.setTopologyRoot(topologyRoot);

		// Adds an empty BindingSet
		BindingsSet bindingsSet = Symphony__CommonTopologyBindingsFactory.eINSTANCE
				.createBindingsSet();
		symphonySystem.setBindingSet(bindingsSet);

		// Adds an empty Connection Points List
		ConnectionPointsList connectionPointsList = Symphony__CoreFactory.eINSTANCE
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
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX:
				return getDefaultSymphonyProjectNamePrefix();
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME:
				return getDefaultSymphonySessionFilename();
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION:
				return getDefaultSymphonySessionFilenameExtension();
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME:
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
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX:
				return DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT == null ? defaultSymphonyProjectNamePrefix != null : !DEFAULT_SYMPHONY_PROJECT_NAME_PREFIX_EDEFAULT.equals(defaultSymphonyProjectNamePrefix);
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME:
				return DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT == null ? defaultSymphonySessionFilename != null : !DEFAULT_SYMPHONY_SESSION_FILENAME_EDEFAULT.equals(defaultSymphonySessionFilename);
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION:
				return DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT == null ? defaultSymphonySessionFilenameExtension != null : !DEFAULT_SYMPHONY_SESSION_FILENAME_EXTENSION_EDEFAULT.equals(defaultSymphonySessionFilenameExtension);
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE__DEFAULT_SYMPHONY_SESSION_FOLDER_NAME:
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
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_PROJECT__NEWSYMPHONYPROJECTSETTINGS:
				return createSymphonyProject((NewSymphonyProjectSettings)arguments.get(0));
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FOLDER__NEWSYMPHONYPROJECTSETTINGS:
				return createSymphonySessionFolder((NewSymphonyProjectSettings)arguments.get(0));
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION__NEWSYMPHONYSESSIONSETTINGS:
				return createSymphonySession((NewSymphonySessionSettings)arguments.get(0));
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SESSION_FILE__ICONTAINER_STRING_INVOCATORSESSION:
				try {
					return createSymphonySessionFile((IContainer)arguments.get(0), (String)arguments.get(1), (InvocatorSession)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___GET_SYMPHONY_SESSION_FILE__ICONTAINER_STRING:
				return getSymphonySessionFile((IContainer)arguments.get(0), (String)arguments.get(1));
			case Symphony__CoreUIPackage.SYMPHONY_CORE_UI_FACADE___CREATE_SYMPHONY_SYSTEM__NEWSYMPHONYSYSTEMSETTINGS:
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

} // Symphony__CoreUIFacadeImpl
