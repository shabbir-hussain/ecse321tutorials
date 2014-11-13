package Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

import Model.Box;
import Utils.GNode;
import View.GridPanel;

/**
 * 
 * @author Shabbir
 *
 *	This class is the controller for the grid portion
 */
public class GridController extends GridPanel {

	GridController gRef = this;
	int rows = GridPanel.mWIDTH/10;
	int cols = GridPanel.mHEIGHT/10;
	Box[][] gridModel = new Box[rows][cols];
	
	Box bStart = new Box(0,0);
	Box bEnd = new Box(0,100);
	ArrayList<Box> path = new ArrayList<Box>();
	
	public GridController(){
		super();
		
		//create grid
		//reset grid
		for(int i=0;i<rows;i++){
			for(int j=0; j<cols;j++){
				gridModel[i][j] = new Box(i*Box.size,j*Box.size);
			}
		}
		
		ResetPath();
		this.addMouseListener(new gridMouseListener());
				
	}
	/**
	 * Getter for panel
	 * @return returns a panel
	 */
	public GridPanel getPanel(){
		return this;
	}
	
	/**
	 * Sets the Start box to search from
	 * @param x start x position
	 * @param y start y position
	 */
	public void setStart(int x, int y){
		bStart.x = x*10;
		bStart.y = y*10;
	}
	/**
	 * Sets the end position to search to
	 * @param x the goal node x position
	 * @param y the goal node y position
	 */
	public void setEnd(int x, int y){
		bEnd.x = x*10;
		bEnd.y = y*10;
	}
	
	/**
	 * Resets the searched path 
	 */
	public void ResetPath(){
		
		//reset path
		path = new ArrayList<Box>();
		
		this.repaint();
	}
	
	/**
	 * Searches for a path from start to end
	 */
	public void SearchForPath(){
		
		GNode goalNode = AStar();
		
		if(goalNode == null)
			return;
		
		while(goalNode.bParent != null){
			path.add(goalNode.bCurrent);
			goalNode = goalNode.bParent;
		}
		
		this.repaint();
	}
	
	public GNode AStar(){

		//list of all nodes we are going to search ie. the frontier
		LinkedList<GNode> openList = new LinkedList<GNode>();
		//list of all nodes we've already searched
		LinkedList<Box> closedList = new LinkedList<Box>();
		
		//init the  openlist
		GNode startNode = new GNode(bStart, null, 0, EuclidianDistance(bStart, bEnd));
		openList.add(startNode);
		
		while(!openList.isEmpty()){
			//first node in open list
			GNode current = openList.removeFirst();
			//add it to closed  list
			closedList.add(current.bCurrent);
			
			//check if its the goal
			if(current.bCurrent.equals(bEnd)){
				return current;
			}
			
			int xIndex = current.bCurrent.x/10;
			int yIndex = current.bCurrent.y/10;
			
			//for all 8 adjacent nodes
			for(int i=xIndex-1;i<=xIndex+1;i++){
				for(int j=yIndex-1;j<=yIndex+1;j++){
					
					//skip if out of bounds
					if(i<0 || i> rows || j<0 || j>cols){
						continue;
					}
					
					//skip if filled box
					if(gridModel[i][j].isFilled()){
						continue;
					}
					
					//skip if already searched before
					if(closedList.contains(gridModel[i][j])){
						continue;
					}
					
					//Create next node
					GNode next = new GNode(gridModel[i][j],current,current.gCost+10,EuclidianDistance(gridModel[i][j],bEnd));
					
					//add node to open list
					openList.add(next);
					
					//sort open list
					for(int k = 0;k<openList.size()-1;k++){
						if(openList.get(k).fCost>openList.get(k+1).fCost){
							//swap
							GNode temp = openList.get(k);
							openList.set(k, openList.get(k+1));
							openList.set(k+1, temp);							
						}
					}
				}
			}
		}
		
		return null;
	}
	
	//returns the euclidian distance between 2 boxes
	public float EuclidianDistance(Box b1, Box b2){
		return (float) Math.sqrt(Math.pow((b1.x-b2.x),2) + Math.pow((b1.y-b2.y),2));
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//draw boxes
		for(int i=0;i<rows;i++){
			for(int j=0; j<cols;j++){
				if(gridModel[i][j].isFilled()){
					g.fillRect(gridModel[i][j].x, gridModel[i][j].y, Box.size, Box.size);
				}
				else{
					g.drawRect(gridModel[i][j].x, gridModel[i][j].y, Box.size, Box.size);
				}
			}
		}
		
		//fill start
		g.setColor(Color.GREEN);
		g.fillRect(bStart.x, bStart.y, Box.size, Box.size);
		
		//fill end
		g.setColor(Color.PINK);
		g.fillRect(bEnd.x, bEnd.y, Box.size, Box.size);
        
		//fill path
		g.setColor(Color.red);
		for(int i=0;i<path.size();i++){
			g.fillRect(path.get(i).x, path.get(i).y, Box.size, Box.size);
		}
		
        Toolkit.getDefaultToolkit().sync();
	}
	
	//class to capture button clicks
	class gridMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			Point p = arg0.getPoint();

			int xIndex = p.x/10;
			int yIndex = p.y/10;
			
			gridModel[xIndex][yIndex].flip();
			
			gRef.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}	
		
	}
}
