package structure;

public class MyLinkedList<E> {

	private Node<E> head;

	public MyLinkedList() {
		this.head = null;
	}

	public void add(E data) {
		Node<E> curNode = head;
		if (curNode == null) {
			head = new Node<>(data);
		} else {
			while (curNode.getNext() != null) {
				curNode = curNode.getNext();
			}
			curNode.setNext(new Node<>(data));
		}
	}

	public void print() {
		Node<E> curNode = this.head;
		while (curNode != null) {
			System.out.println(curNode.getData());
			curNode = curNode.getNext();
		}
	}
}
