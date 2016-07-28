package chap2;

import java.util.HashMap;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Integer node
		int n = 12;
		Node lList = null;
		/*
		 * for (int i = 0; i < n; i++) { if (lList == null) { lList = new
		 * Node(i); } else { lList.append(new Node(i%5)); } }
		 */
		// System.out.println(lList.count);

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
		System.out.println();
		// removeduplicatesfromlinkedlist(lList.header);
		removeduplicatesfromlinkedlistwithouthashmap(lList.header);

		runner = lList.header;
		while (runner != null) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
		}
	}

	public static void removeduplicatesfromlinkedlist(Node header) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Node runner = header;
		map.put((int) runner.value, 1);
		while (runner.next != null) {
			if (map.containsKey((int) runner.next.value)) {
				if (runner.next.next != null) {
					runner.next = runner.next.next;
				} else {
					runner.next = null;
				}
			} else {
				map.put((int) runner.next.value, 1);
				runner = runner.next;
			}
		}
	}

	public static void removeduplicatesfromlinkedlistwithouthashmap(Node header) {
		Node firstrunner = header;
		Node secondrunner = header;
		while (firstrunner != null) {

			while (secondrunner.next != null) {
				if ((int) secondrunner.next.value == (int) firstrunner.value) {
					secondrunner.next = secondrunner.next.next;
				} else {
					secondrunner = secondrunner.next;
				}
			}
			firstrunner = firstrunner.next;
			secondrunner = firstrunner;
		}
	}

}
