package Queue;

public class QueueUsingLinkedList {
	private LinkedListNode front;
	private LinkedListNode rear;
	private int size;
	
	public QueueUsingLinkedList() {
		front = rear = null;
		size = 0;
	}
	
	public void SetQueueFront(LinkedListNode frontNode) {
		this.front = frontNode;
	}
	
	public void SetQueueRear(LinkedListNode rearNode) {
		this.rear = rearNode;
	}
	
	public void SetQueueSize(int size) {
		this.size = size;
	}
	
	public void Enqueue(int data) {
		if(rear == null) {
			rear = front = new LinkedListNode(data);			
		}else {
			rear.SetLinkedListNodeNext(new LinkedListNode(data));
			rear = rear.GetLinkedListNodeNext();
		}
		size++;
	}
	
	public int Dequeue() {
		if(front == null) {
			System.out.println("Queue is empty!");
			return -1;
		}
		
		int value = front.GetLinkedListNodeData();
		front = front.GetLinkedListNodeNext();
		size--;
		return value;
	}
	
	public int GetSize() {
		return size;
	}
	
	public LinkedListNode GetFrontNode() {
		return front;
	}
	
	public LinkedListNode GetRearNode() {
		return rear;
	}
	
	public int Peek() {
		if(front == null) {
			System.out.println("Queue is empty! Can't peek anything!");
			return -1;
		}
		return front.GetLinkedListNodeData();
	}
}
