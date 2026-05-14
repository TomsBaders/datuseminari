package datastr;

public class MyEdgeNode {
	private int indexToVertice;
	private float weight;//TODO var taisīt arī ar citu tipu vai Ttype
	private MyEdgeNode nextEdge = null;
	
	public int getIndexToVertice() {
		return indexToVertice;
	}
	public void setIndexToVertice(int indexToVertice) {
		if(indexToVertice >= 0)
		{
			this.indexToVertice = indexToVertice;
		}
		else
		{
			this.indexToVertice = 0;
		}
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		if(weight > 0) {
			this.weight = weight;
		}
		else
		{
			this.weight = 1;
		}
		
	}
	public MyEdgeNode getNextEdge() {
		return nextEdge;
	}
	public void setNextEdge(MyEdgeNode nextEdge) {
		this.nextEdge = nextEdge;
	}
	
	public MyEdgeNode(int indexToVertice, float weight) {
		setIndexToVertice(indexToVertice);
		setWeight(weight);
	}
	
	public String toString() {
		return "indexTo: " + indexToVertice + " (" + weight + ")"; 
	}
}
