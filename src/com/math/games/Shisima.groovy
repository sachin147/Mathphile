/**
 * 
 */
package com.math.games

/**
 * @author sachin
 *
 */

class Node {
	int nodeNumber;
}

class Board {
	List<Node> nodes;
}

class Player {
	int playerId;
	String playerName;
}


class Shisima {

	static main(args) {		
		Board board = initializeBoard();
	}
	
	public Board initializeBoard() {
		int numberOfNodes = 7;
		Board board = new Board();
		List<Node> nodes = new ArrayList<>();
		for(int i=0; i<numberOfNodes; i++) {
			Node node = new Node();
			node.nodeNumber = i;
			nodes.add(node);
		}
		board.nodes = nodes;
	}

}




