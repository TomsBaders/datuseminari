package datastr;

public class MyGraph<Ttype> {
	private MyVerticeNode<Ttype>[] verticeNodes;
	private final int DEFAULT_SIZE = 10;
	private int size = DEFAULT_SIZE;
	private int howManyElements = 0;
	
	public MyGraph() {
		verticeNodes = new MyVerticeNode[size];
	}
	public MyGraph(int size) {
		if (size > 0) {
			this.size = size;
		}
		verticeNodes = new MyVerticeNode[this.size];
	}

	public int getHowManyElements() {
		return howManyElements;
	}
	
	public boolean isEmpty() {
		return (howManyElements <= 0);
	}
	public boolean isFull() {
		return (howManyElements >= size);
	}
	
	private void resize() {
		int newSize = (howManyElements < 200) ? (size * 2) : (int)(size * 1.5);
		MyVerticeNode<Ttype>[] newVerticeNodes= new MyVerticeNode[newSize];
		
		for(int i = 0; i < howManyElements; i++) {
			newVerticeNodes[i] = verticeNodes[i];
		}
		
		verticeNodes = newVerticeNodes;
		size = newSize;	
		System.gc();	
	}
	
	public void addVertice(Ttype element) throws Exception {
		if (element == null) {
			throw new Exception("Nav ievaditi dati.");
		}
		
		int indexOfVertice = findVerticeIndex(element);
		if (indexOfVertice > -1) {
			throw new Exception("Tāda virsotne "+element+" eksistē grafā.");
		}
		
		if (isFull()) {
			resize();
		}
		
		verticeNodes[howManyElements] = new MyVerticeNode<Ttype>(element);
		howManyElements++;
	}
	
	private int findVerticeIndex(Ttype element) {
		for (int i = 0; i < howManyElements; i++) {
			if (verticeNodes[i].getVerticeElement().equals(element)) {
				return i;
			}
		}
		return -1;
	}
}
