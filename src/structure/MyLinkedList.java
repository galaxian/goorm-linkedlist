package structure;

import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {

	private Node<E> head;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.size = 0;
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
		size++;
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
		size--;
	}

	public void print() {
		Node<E> curNode = this.head;
		while (curNode != null) {
			System.out.println(curNode.getData());
			curNode = curNode.getNext();
		}
	}

	public int getSize() {
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		return new MyIterable();
	}

	private class MyIterable implements Iterator<E> {
		private Node<E> idx;

		public MyIterable() {
			idx = head;
		}

		@Override
		public boolean hasNext() {
			return idx != null;
		}

		@Override
		public E next() {
			if (!hasNext()) {
				throw new IndexOutOfBoundsException();
			}
			E target = idx.getData();
			idx = idx.getNext();
			return target;
		}
	}
}
