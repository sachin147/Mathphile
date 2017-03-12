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
	boolean isEmpty;
	Stone stone;
}

class Board {
	List<Node> nodes;
	
	public List<Node> getNodes() {
		return nodes;
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
}

class Stone {
	String color;

	public Stone(String color) {
		super();
		this.color = color;
	}
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
		while(GameEngine.gameover) {			
			GameEngine.play(this);
			Thread.sleep(1000);
		}
		
	}
}

class GameEngine {
	public static boolean gameover;
	
	static synchronized void play(Player player) {
		if(isShisimaEmpty()) {
			
		}
	}
	
	static boolean isShisimaEmpty() {
		//if(board node 0 stone absent)
			
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
	
	public static Board initializeBoard() {
		int numberOfNodes = 9;
		Board board = new Board();
		List<Node> nodes = new ArrayList<>();
		for(int i=0; i<numberOfNodes; i++) {
			if(i==2 || i==3 || i==4) {	//bad code			
				Node node = new Node();
				node.nodeNumber = i;
				node.isEmpty = true;
				node.stone = new Stone('black');
				nodes.add(node);
			}
			if(i==6 || i==7 || i==8) { //bad code
				Node node = new Node();
				node.nodeNumber = i;
				node.isEmpty = true;
				node.stone = new Stone('white');
				nodes.add(node);
			}
			if(i==0 || i==1 || i==5) { //bad code
				Node node = new Node();
				node.nodeNumber = i;
				node.isEmpty = true;
				nodes.add(node);
			}
		}
		board.setNodes(nodes);
	}

}




