package chap2;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node lList = null;

		lList = new Node(0);
		lList.append(new Node(3));
		lList.append(new Node(1));
		lList.append(new Node(5));
		
		
		Node lList2 = null;
		lList2 = new Node(0);
		lList2.append(new Node(5));
		lList2.append(new Node(9));
		lList2.append(new Node(2));
		Node result = addll(lList,lList2).header;
		Node runner1 = lList.header;
		Node runner2 = lList2.header;

		while(runner1 !=null)
		{
			System.out.print((int)runner1.value + "->");
			runner1 = runner1.next;
		}
		System.out.println();
		while(runner2 !=null)
		{
			System.out.print((int)runner2.value + "->");
			runner2 = runner2.next;
		}
		System.out.println();
		
		while(result !=null)
		{
			System.out.print((int)result.value + "->");
			result = result.next;
		}

	}

	public static Node addll(Node lList,Node lList2) {
		Node result = null;
		Node runner1 = lList.header;
		Node runner2 = lList2.header;
		int carryover = 0;
		while (runner1 != null && runner2 != null) {
			int temp = 0;
			if (runner1 != null) {
				temp += (int) runner1.value;
				runner1 = runner1.next;

			}
			System.out.println("Hello");
			if (runner2 != null) {
				temp += (int) runner2.value;
				runner2 = runner2.next;
			}
			temp += carryover;
			carryover = temp / 10;
			temp = temp % 10;

			if (result == null) {
				result = new Node(0);
				result.append(new Node(temp));
				
			} else {
				result.append(new Node(temp));
			}

		}
		return result;

	}

}
