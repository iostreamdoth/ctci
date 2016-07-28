package chap4;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	public enum State
	{
		Unvisited,Visited,Visiting;
	}
	List<GraphNode> adjacentNodes;
	Object data;
	State state;
	GraphNode(Object o,List<GraphNode> l)
	{
		this.adjacentNodes = null;
		this.data = o;
		this.state = State.Unvisited;
	}
}
