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

class Player implements Runnable {
	int playerId;
	String playerName;
		
	public Player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		movePiece();
	}
}


class Shisima {

	static main(args) {		
		Board board = initializeBoard();
		Player player1 = new Player(1, "Sonu");
		new Thread(player1).start();
		Player player2 = new Player(2, "Monu");
		new Thread(player2).start();
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




