package ca.gc.space.eclipse.emf.ui.viewers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerDropAdapter;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Composite;

/**
 * {@link TableViewer} that displays only one element.
 * 
 * <PRE>
 * 
 * Phoenix Meteorological Station (MET) Ground Data System (GDS)
 * Canadian Space Agency / Agence spatiale canadienne
 * 6767 route de l'Aeroport
 * St-Hubert, Quebec, Canada
 * J3Y 8Y9
 * www.space.gc.ca
 * Copyrights (c)
 * </PRE> 
 */
public class SingleElementTableViewer extends TableViewer {

	private boolean dropEnabled;
	private EStructuralFeature elementFeature;
	private IStructuredContentProvider contentProvider;

	/**
	 * Creates a table viewer with a single element.
	 * @param parent Parent Composite
	 * @param element_feature Element feature to display.
	 * @param drop_enabled True allows dropping of an element. 
	 * @param domain Editing Domain if any.  Null does not use any domain.
	 * @param copy True means that we store a copy of the drop element.  False means a reference.
	 */
	public SingleElementTableViewer(Composite parent, EStructuralFeature element_feature, boolean drop_enabled, final EditingDomain domain, final boolean copy) {
		super(parent);
		dropEnabled = drop_enabled;
		elementFeature = element_feature;
		setContentProvider(getContentProvider());  // Required ContentViewer does not use the content provider 
		                                           // getter.

		if (drop_enabled){
			addDropSupport(DND.DROP_COPY | DND.DROP_MOVE, 
	                       new Transfer[] {LocalTransfer.getInstance()}, 
	                       new ViewerDropAdapter(this){
								@Override
								public boolean performDrop(Object data) {
									if (data instanceof IStructuredSelection){
										Object selection = ((IStructuredSelection) data).getFirstElement();
										if (selection instanceof EObject){											
											if (getElementFeature().getEType().getInstanceClass().isInstance(selection)){
												EObject input = (EObject) getInput();																								
												if (domain == null){
													input.eSet(getElementFeature(), copy ? EcoreUtil.copy((EObject) selection) : selection);	
												}else{
													domain.getCommandStack().execute(SetCommand.create(domain, input, getElementFeature(), copy ? EcoreUtil.copy((EObject) selection) : selection));
												}												
												getViewer().refresh();
												return true;
											}
										}
									}
									return false;
								}
								@Override
								public boolean validateDrop(Object target, int operation, TransferData transferType) {
									return true;
								}
							});
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ContentViewer#getContentProvider()
	 */
	@Override
	public IContentProvider getContentProvider() {
		if (contentProvider == null){
			contentProvider = new IStructuredContentProvider(){
		        public Object[] getElements(Object inputElement) {
					Object object = ((EObject) inputElement).eGet(elementFeature);
					return object == null ? new Object[] { "" } : new Object[] { object };
		        }		        
				public void dispose() {
				}
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}
			};
		}
		return contentProvider;
	}
	
	/**
	 * @return the elementReference
	 */
	public EStructuralFeature getElementFeature() {
		return elementFeature;
	}
	
	/**
	 * Returns true if drop is enabled.
	 * @return drop enabled value.
	 */
	public boolean isDropEnabled() {
		return dropEnabled;
	}
}