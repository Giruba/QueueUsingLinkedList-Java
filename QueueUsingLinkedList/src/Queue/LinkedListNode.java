package Queue;

public class LinkedListNode {
	private int data;
	private LinkedListNode nextNode;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeData(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeNext(LinkedListNode nextnode) {
		this.nextNode = nextnode;
	}
	
	public int GetLinkedListNodeData() {
		return data;
	}
	
	public LinkedListNode GetLinkedListNodeNext() {
		return nextNode;
	}
}
