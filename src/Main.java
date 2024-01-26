import structure.MyLinkedList;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(11);

		linkedList.print();
	}
}
