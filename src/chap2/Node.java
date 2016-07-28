package chap2;

public class Node {
	Node next;
	Object value;
	Node header = null;
	private Node end;
	public int count;
	public void append(Node o) {
		count++;
		if (header == null) {
			header = o;
			end = header;
			//System.out.println("First Node");
		}
		else
		{
			end.next = o;
			end = o;
			//System.out.println("Next Node");
		}
	}
	public Node(Object value)
	{
		this.value = value;
		this.next = null;
		
	}
}
