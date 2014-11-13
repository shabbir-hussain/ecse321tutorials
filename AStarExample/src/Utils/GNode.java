package Utils;

import Model.Box;
/**
 * The GNode is a helper class for graph searching
 * @author Shabbir
 *
 */
public class GNode {

	public Box bCurrent;
	public float fCost;
	public float hCost;
	public float gCost;
	
	public GNode bParent;
	
	public GNode(Box current, GNode Parent, float HCost, float GCost){
		bCurrent = current;
		bParent = Parent;
		hCost = HCost;
		gCost = GCost;
		fCost = hCost + gCost;
		
	}
}
