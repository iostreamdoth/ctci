package chap2;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node lList = null;

		lList = new Node(1);
		lList.append(new Node(12));
		lList.append(new Node(32));
		Node n = new Node(43);
		lList.append(n);
		lList.append(new Node(41));
		lList.append(new Node(42));
		lList.append(new Node(22));
		lList.append(new Node(45));
		lList.append(new Node(62));
		lList.append(new Node(49));
		Node l = new Node(75);
		l.next = n;
		lList.append(l);
		// lList.append(new Node(22));

		int trav = 18;

		Node runner = lList.header;
		while (trav != 0) {
			System.out.print((int) runner.value + " -> ");
			runner = runner.next;
			trav--;
		}
		System.out.println();

		Node runner1 = lList.header;
		Node runner2 = lList.header;

		int count1 = 0;
		int count2 = 0;
		while (runner1 != runner2 || count1 == 0) {
			runner1 = runner1.next;
			runner2 = runner2.next.next;
			count1++;
			count2 += 2;
		}
		runner1 = lList.header;
		while(runner1 != runner2 )
		{
			runner1 = runner1.next;
			runner2 = runner2.next;
		}
		
		System.out.println(count1 + "," + count2);
		System.out.println((int)runner1.value + "," + (int)runner2.value );

	}

}
