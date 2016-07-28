package chap2;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node lList = null;

		lList = new Node(1);
		lList.append(new Node(23));
		lList.append(new Node(34));
		lList.append(new Node(8));
		lList.append(new Node(43));
		lList.append(new Node(98));
		lList.append(new Node(12));
		lList.append(new Node(75));
		lList.append(new Node(43));
		lList.append(new Node(32));
		lList.append(new Node(41));
		lList.append(new Node(75));
		lList.append(new Node(22));

		Node runner = lList.header;
		while (runner != null) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
		}
		Node delnode = lList.header;
		int number = 5;
		while (number != 1) {
			delnode = delnode.next;
			number--;
		}

		System.out.println();
		removenode(delnode);
		runner = lList.header;
		while (runner != null) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
		}
		System.out.println();
		removenode(delnode);
		runner = lList.header;
		while (runner != null) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
		}
		System.out.println();
		removenode(delnode);
		runner = lList.header;
		while (runner != null) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
		}
	}

	public static void removenode(Node delnode) {
		while (delnode.next != null) {
			delnode.value = delnode.next.value;
			if (delnode.next.next != null) {
				delnode = delnode.next;
			} else {
				delnode.next = null;
			}

		}
	}

}
