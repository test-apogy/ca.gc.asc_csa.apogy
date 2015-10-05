package ca.gc.asc_csa.symphony.core.ui.converters;

import java.util.Iterator;

import org.eclipse.symphony.common.converters.IConverter;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.core.PositionedResult;
import ca.gc.asc_csa.symphony.core.ResultNode;
import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyEnvironment;
import ca.gc.asc_csa.symphony.core.SymphonyTopology;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

public class PositionedResultToNodeConverter implements IConverter{

	@Override
	public boolean canConvert(Object arg0) {
		return getNode((PositionedResult) arg0) != null;
	}

	@Override
	public Object convert(Object arg0) throws Exception {
		return getNode((PositionedResult) arg0);
	}

	@Override
	public Class<?> getInputType() {
		return PositionedResult.class;
	}

	@Override
	public Class<?> getOutputType() {
		return Node.class;
	}
	
	/**
	 * Searches the {@link Node} associated to the {@link PositionedResult}
	 * @param positionedResult Reference to the {@link PositionedResult}
	 * @return Reference to the {@link Node} or null if not found.
	 */
	protected Node getNode(PositionedResult positionedResult){
		Node node = null;
				
		InvocatorSession invocatorSession = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (invocatorSession != null){
			Environment environment = invocatorSession.getEnvironment();
			if (environment instanceof SymphonyEnvironment){
				SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) environment;				
				SymphonyTopology symphonyTopology = symphonyEnvironment.getSymphonyTopology();				
				if (symphonyTopology != null){
					GroupNode groupNode = symphonyTopology.getRootNode();
					
					if (groupNode != null){
						Iterator<Node> resultNodes = TopologyFacade.INSTANCE.findNodesByType(SymphonyCorePackage.Literals.RESULT_NODE, groupNode).iterator();
						ResultNode resultNode = null;
						
						while (resultNodes.hasNext() && resultNode == null){
							ResultNode current = (ResultNode) resultNodes.next();
							if (current.getResult() == positionedResult){
								resultNode = current;
							}
						}
						
						if (resultNode != null){						
							if (!resultNode.getAggregatedChildren().isEmpty()){
								node = resultNode.getAggregatedChildren().get(0);
							}							
						}
					}
				}
			}		
		}
		
		return node;
	}
}