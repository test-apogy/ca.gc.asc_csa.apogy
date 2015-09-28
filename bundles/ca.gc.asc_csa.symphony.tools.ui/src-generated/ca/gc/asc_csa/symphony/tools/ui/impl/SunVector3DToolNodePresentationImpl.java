/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.ui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;

import ca.gc.asc_csa.symphony.tools.ui.Activator;
import ca.gc.asc_csa.symphony.tools.ui.SunVector3DToolNodePresentation;
import ca.gc.asc_csa.symphony.tools.ui.SymphonyToolsUIPackage;
import ca.gc.asc_csa.symphony.tools.ui.preferences.SymphonyToolsUIPreferencesConstants;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sun Vector3 DTool Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SunVector3DToolNodePresentationImpl extends NodePresentationImpl implements SunVector3DToolNodePresentation 
{
	protected IPropertyChangeListener preferencesListener = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SunVector3DToolNodePresentationImpl() 
	{
		super();
				
		// Register a listener to the preference store
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(getPreferencesListener());	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsUIPackage.Literals.SUN_VECTOR3_DTOOL_NODE_PRESENTATION;
	}

	@Override
	protected void applyPreferences() 
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, SymphonyToolsUIPreferencesConstants.DEFAULT_SUN_VECTOR_COLOR_ID);
		if(rgb != null) setColor(rgb);
		
		super.applyPreferences();
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(getPreferencesListener());
		super.finalize();
	}
	
	private IPropertyChangeListener getPreferencesListener()
	{
		if(preferencesListener == null)
		{
			preferencesListener = new IPropertyChangeListener() 
			{

				public void propertyChange(PropertyChangeEvent event) 
				{	
					applyPreferences();		
				}	
			};
		}
		
		return preferencesListener;
	}
} //SunVector3DToolNodePresentationImpl
