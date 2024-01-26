package structure;

public class MyStack<E> {

	private MyLinkedList<E> linkedList;

	public MyStack() {
		linkedList = new MyLinkedList<>();
	}

	public E pop() {
		E val = linkedList.get(linkedList.getSize()-1);
		linkedList.delete(linkedList.getSize()-1);
		return val;
	}

	public void add(E val) {
		linkedList.add(val);
	}
}
