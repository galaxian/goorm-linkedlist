package structure;

public class MyQueue<E> {

	private MyLinkedList<E> linkedList;

	public MyQueue() {
		linkedList = new MyLinkedList<>();
	}

	public E popLeft() {
		E val = linkedList.get(0);
		linkedList.delete(0);
		return val;
	}

	public void add(E val) {
		linkedList.add(val);
	}
}
