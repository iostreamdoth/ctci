package chap2;

public class problem2 {

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
		System.out.println();
		nthfromlast(lList.header,2);
		
	}

	public static void nthfromlast(Node header, int n) {
		Node firstrunner = header;
		Node secondrunner = header;
		int count = 0;
		while (firstrunner != null) {
			firstrunner = firstrunner.next;
			count++;
		}
		while (count!=n)
		{
			secondrunner = secondrunner.next;
			count--;
		}
		System.out.println((int)secondrunner.value);

	}

}
