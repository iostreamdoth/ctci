package chap4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import chap4.GraphNode.State;

public class problem2 {

	public static boolean search(Graph g, GraphNode start, GraphNode end) {
		Stack<GraphNode> q = new Stack<GraphNode>();
		for (GraphNode n : g.nodes) {
			n.state = State.Unvisited;
		}

		start.state = State.Visiting;
		q.push(start);
		GraphNode x;
		while (!q.isEmpty()) {
			System.out.println("This clean 1");
			x = q.pop();
			System.out.println("This clean 2");

			if (x.adjacentNodes != null) {

				for (GraphNode gnode : x.adjacentNodes) {
					if (gnode.state == State.Unvisited) {
						System.out.println("Unvisited Node");
						if (gnode == end) {
							return true;
						} else {

							gnode.state = State.Visiting;
							q.push(gnode);
						}
					}
				}
			}
			x.state = State.Visited;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a graph

		GraphNode A = new GraphNode("A", null);
		GraphNode B = new GraphNode("B", null);
		GraphNode C = new GraphNode("C", null);
		GraphNode D = new GraphNode("D", null);
		GraphNode E = new GraphNode("E", null);
		GraphNode F = new GraphNode("F", null);
		GraphNode G = new GraphNode("G", null);
		GraphNode H = new GraphNode("H", null);
		GraphNode I = new GraphNode("I", null);

		List<GraphNode> k = new ArrayList<GraphNode>();
		k.add(D);
		A.adjacentNodes = k;

		k = new ArrayList<GraphNode>();
		k.add(E);
		k.add(F);
		k.add(I);
		D.adjacentNodes = k;

		/*
		 * k = new ArrayList<GraphNode>(); k.add(D); F.adjacentNodes = k;
		 */

		/*
		 * k = new ArrayList<GraphNode>(); k.add(D); I.adjacentNodes = k;
		 */
		k = new ArrayList<GraphNode>();
		k.add(G);
		E.adjacentNodes = k;

		k = new ArrayList<GraphNode>();
		k.add(F);
		G.adjacentNodes = k;

		k = new ArrayList<GraphNode>();
		k.add(C);
		B.adjacentNodes = k;

		/*
		 * k = new ArrayList<GraphNode>(); k.add(C); H.adjacentNodes = k;
		 */

		k = new ArrayList<GraphNode>();
		k.add(H);
		C.adjacentNodes = k;

		k = new ArrayList<GraphNode>();
		k.add(A);
		k.add(B);
		k.add(C);
		k.add(D);
		k.add(E);
		k.add(F);
		k.add(G);
		k.add(H);
		k.add(I);
		Graph g = new Graph(k);
		System.out.println(search(g, H, C));
	}

}
