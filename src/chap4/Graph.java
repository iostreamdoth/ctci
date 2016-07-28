package chap4;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	public List<GraphNode> nodes;

	public Graph(List<GraphNode> list) {
		if (list == null) {
			this.nodes = new ArrayList<GraphNode>();
		} else {
			this.nodes = list;
		}
	}
}
