package ca.gc.asc_csa.apogy.core.ui.converters;

import java.util.Iterator;

import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.core.PositionedResult;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

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
				
		InvocatorSession invocatorSession = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (invocatorSession != null){
			Environment environment = invocatorSession.getEnvironment();
			if (environment instanceof ApogyEnvironment){
				ApogyEnvironment apogyEnvironment = (ApogyEnvironment) environment;				
				ApogyTopology apogyTopology = apogyEnvironment.getApogyTopology();				
				if (apogyTopology != null){
					GroupNode groupNode = apogyTopology.getRootNode();
					
					if (groupNode != null){
						Iterator<Node> resultNodes = ApogyCommonTopologyFacade.INSTANCE.findNodesByType(ApogyCorePackage.Literals.RESULT_NODE, groupNode).iterator();
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