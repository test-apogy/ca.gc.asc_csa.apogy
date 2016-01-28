package ca.gc.asc_csa.apogy.core.environment.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.ui.handlers.HandlerUtil;

public class UpdateCartesianTriangularMeshMapLayerImageCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof CartesianTriangularMeshMapLayer) 
			{
				CartesianTriangularMeshMapLayer layer = (CartesianTriangularMeshMapLayer) selection;
				layer.forceUpdateTextureImage();
			}
		}
		return null;
	}
}
