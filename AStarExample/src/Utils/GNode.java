package Utils;

import Model.Box;

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
