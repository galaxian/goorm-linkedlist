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

	public E get(int i) {
		Node<E> node = this.head;
		int idx = 0;
		while (idx < i) {
			node = node.getNext();
			idx++;
		}
		return node.getData();
	}

	private Node<E> getNode(int i) {
		Node<E> node = this.head;
		int idx = 0;
		while (idx < i) {
			node = node.getNext();
			idx++;
		}
		return node;
	}

	//todo 마지막 요소 삭제 시 예외 처리 필요
	public void delete(int i) {
		if (i == 0) {
			head = head.getNext();
			return;
		}
		Node<E> prevNode = this.getNode(i - 1);
		prevNode.setNext(prevNode.getNext().getNext());
	}

	public void print() {
		Node<E> curNode = this.head;
		while (curNode != null) {
			System.out.println(curNode.getData());
			curNode = curNode.getNext();
		}
	}
}
