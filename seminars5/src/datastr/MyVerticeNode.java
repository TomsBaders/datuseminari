package datastr;

public class MyVerticeNode<Ttype> {
	private Ttype verticeElement;
	private MyEdgeNode firstEdgeNode = null;
	
	public MyVerticeNode(Ttype verticeElement) {
		setVerticeElement(verticeElement);
	}
	
	public Ttype getVerticeElement() {
		return verticeElement;
	}
	public MyEdgeNode getFirstEdgeNode() {
		return firstEdgeNode;
	}
	
	public void setVerticeElement(Ttype verticeElement) {
		if (verticeElement != null) {
			this.verticeElement = verticeElement;
		} else {
			this.verticeElement = (Ttype) new Object();
		}
	}
	public void setFirstEdgeNode(MyEdgeNode firstEdgeNode) {
		this.firstEdgeNode = firstEdgeNode;
	}
	
	public String toString() {
		String result = verticeElement + " -> ";
		
		MyEdgeNode currentEdgeNode = firstEdgeNode;
		
		while (currentEdgeNode != null) {
			result += currentEdgeNode.toString();
			result += "->";
			currentEdgeNode = currentEdgeNode.getNextEdge();
		}
		
		return result;
	}
}
