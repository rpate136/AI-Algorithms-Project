package edu.ncsu.csc520.hw01.searching_robot;


public class Node implements Comparable<Node>{

	private int row;
	private int col;
	private int G_cost;
	private int H_cost;
    public Node parent;
	
	
	public Node(int row, int col) {
		this.row = row;
		this.col = col;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getCol() {
		return col;
	}


	public void setCol(int col) {
		this.col = col;
	}


	public int getG_cost() {
		return G_cost;
	}


	public void setG_cost(int G_cost) {
		this.G_cost = G_cost;
	}

	
	public int getH_cost() {
		return H_cost;
	}

	
	public void setH_cost(int H_cost) {
		this.H_cost = H_cost;
	}

	public int getF_cost() {
		return G_cost + H_cost;
	}


	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	public Node getParent() {
		return parent;
	}

	
	@Override
	public int compareTo(Node E) {
        if(this.getF_cost() > E.getF_cost()) {
            return 1;
        } else if (this.getF_cost() < E.getF_cost()) {
            return -1;
        } else {
            if(this.getH_cost() > E.getH_cost()) {
            	return 1;
            }
            else {
            	return -1;
            }
        }
	}

	public boolean compare(Node temp) {
		if(this.getCol() == temp.getCol() && this.getRow() == temp.getRow()) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Node [row=" + row + ", col=" + col 
				+ "]";
	}

	

}