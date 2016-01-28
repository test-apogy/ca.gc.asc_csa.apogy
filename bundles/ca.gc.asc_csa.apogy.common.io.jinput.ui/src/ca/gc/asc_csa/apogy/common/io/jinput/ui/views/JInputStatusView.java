package ca.gc.asc_csa.apogy.common.io.jinput.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;


public class JInputStatusView extends ViewPart
{
	public static final String ID = "ca.gc.asc_csa.apogy.common.io.jinput.ui.views.JInputStatusView";
	
	
	private TreeViewer viewer;
	private Adapter viewerAdapter;
	private ExtendedPropertySheetPage propertySheetPage;
	private ComposedAdapterFactory adapterFactory;

	public JInputStatusView()
	{
		
	}

	@Override
	public void createPartControl(final Composite parent)
	{
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		final Tree tree = viewer.getTree();
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		viewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
		{
			@Override
			public Object[] getElements(Object object)
			{
				if (getParent(object) == null)
				{
					return new Object[]{Activator.getEControllerEnvironment()};
				}
				else
				{
					return super.getElements(object);
				}
			}
		});
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		/** Selection Provider. */
		getSite().setSelectionProvider(viewer);
		
		viewer.setInput("");
		
		//Adapter to refresh viewer from model
		viewerAdapter = new Adapter()
		{	
			@Override
			public void setTarget(Notifier newTarget) { }
			
			@Override
			public void notifyChanged(Notification notification)
			{
				Display.getDefault().asyncExec(new Runnable()
				{
					@Override
					public void run()
					{
						if(viewer != null && !tree.isDisposed())
							viewer.refresh(true);
					}
				});
			}
			@Override
			public boolean isAdapterForType(Object type) { return false; }
			@Override
			public Notifier getTarget() { return null; }
		};
		ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().eAdapters().add(viewerAdapter);
		
		parent.addDisposeListener(new DisposeListener()
		{
			@Override
			public void widgetDisposed(DisposeEvent e)
			{
				ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().eAdapters().remove(viewerAdapter);
				viewerAdapter = null;
			}
		});
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	@Override
	public void setFocus()
	{
		viewer.getControl().setFocus();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object getAdapter(Class key)
	{
		if (key.equals(IPropertySheetPage.class))
		{
			if (propertySheetPage == null)
			{
				propertySheetPage = getPropertySheetPage();
			}
			
			return propertySheetPage;
		}
		else
		{
			return super.getAdapter(key);
		}
	}
	
	protected ExtendedPropertySheetPage getPropertySheetPage()
	{
		if (propertySheetPage == null)
		{
			propertySheetPage =	new ExtendedPropertySheetPage(null);
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}
		return propertySheetPage;
	}
	
}