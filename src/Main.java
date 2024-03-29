import java.util.Iterator;

import structure.MyLinkedList;
import structure.MyQueue;
import structure.MyStack;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(11);
		linkedList.add(2);
		linkedList.add(9);

		linkedList.print();

		Integer getNodeData = linkedList.get(2);
		System.out.println(getNodeData);

		linkedList.delete(4);
		linkedList.print();

		Iterator<Integer> iterator = linkedList.iterator();
		System.out.println("----iter----");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("----foreach----");
		for (Integer val : linkedList) {
			System.out.println(val);
		}

		System.out.println("----stack----");
		MyStack<Integer> stack = new MyStack<>();
		stack.add(1);
		stack.add(2);
		stack.add(4);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println("----queue----");
		MyQueue<Integer> queue = new MyQueue<>();
		queue.add(1);
		queue.add(100);
		queue.add(-2);

		System.out.println(queue.popLeft());
		System.out.println(queue.popLeft());
		System.out.println(queue.popLeft());
	}
}
