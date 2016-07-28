package misc;

import java.util.Stack;

public class sortingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stInt = new Stack<Integer>();
		stInt.push(100);
		stInt.push(2);
		stInt.push(34);
		stInt.push(1);
		stInt.push(98);
		stInt.push(430);
		stInt.push(45);
		stInt.push(867);
		stInt.push(52);
		Stack<Integer> stTemp = new Stack<Integer>();
		stTemp.push(stInt.pop());
		while(!stInt.isEmpty())
		{
			int e1 = stTemp.pop();
			int e2 = stInt.pop();
			if(e1>e2)
			{
				stTemp.push(e2);
				stTemp.push(e1);
			}
			else
			{
				stTemp.push(e1);
				stTemp.push(e2);
			}
		}
		

	}

}
