package WhatClass_mvc;

import java.util.Random;

public class WhatClassModel {


	String player;           // the hand played by the player
	String computer;         // the hand played by the computer
	String winner;
	Random rng;              // a random number generator


	int roundsPlayed;        // the number of rounds played
	int roundsWonByPlayer;   // the number of rounds won by the player
	int roundsWonByComputer; // the number of rounds won by the computer
	int roundsDrawn;         // the number of rounds that resulted in a draw




	public WhatClassModel(long seed) {

		this.player = "";
		this.computer = "";
		this.winner = "";
		this.rng = new Random(seed);
		this.roundsPlayed = 0;
		this.roundsWonByPlayer = 0;
		this.roundsWonByComputer = 0;
		this.roundsDrawn = 0;

	}


	/**
	 * Play a round: 
	 * 
	 * hand drawn randomly for computer, and compared to hand of the player
	 * result: (player wins, computer wins, hand is drawn) stored in class fields
	 * roundsPlayed is increased by 1
	 * 
	 * @param player
	 */
	public void playRound(String player) {

		// set players hand
		this.player = player;

		// calc computer hand
		int randInt = this.rng.nextInt(3);
		switch(randInt) {
		case 0:	this.computer = WhatClassGame.SCISSORS;	break;
		case 1: this.computer = WhatClassGame.PAPER; 		break;
		case 2: this.computer = WhatClassGame.ROCK;		break;
		}

		//System.out.println(this.player + " versus " + this.computer);
		
		// compare computer hand to player hand
		if (draw()) {
			this.roundsDrawn++;
			this.winner = WhatClassGame.DRAW;
			
		}
		else if(playerWins()) {
			this.roundsWonByPlayer++;
			this.winner = WhatClassGame.PLAYER;
		}
		else if (computerWins()) {
			this.roundsWonByComputer++;
			this.winner = WhatClassGame.COMPUTER;
		}
		
		System.out.println(this.winner);
		this.roundsPlayed++;

	}

	/**
	 * returns hand most recently played by the computer
	 * 
	 * @return
	 */
	public String getComputerHand() {

		return this.computer;

	}


	/**
	 * Returns <code>true</code> if the most recently played hand resulted in a
	 * draw and <code>false</code> otherwise.
	 * 
	 * @return <code>true</code> if the most recently played hand resulted in a
	 *         draw and <code>false</code> otherwise
	 */
	public boolean draw() {
		
		return (this.player.equals(this.computer));

	}



	/**
	 * Returns <code>true</code> if the most recently played hand resulted in a
	 * win for the computer and <code>false</code> otherwise.
	 * 
	 * @return true if the most recently played hand resulted in a win for the
	 *         computer and false otherwise
	 */
	public boolean computerWins() {


		boolean win = false;

		switch (this.computer) {

		case WhatClassGame.SCISSORS:
			win = (this.player.equals(WhatClassGame.PAPER)); break;
		case WhatClassGame.PAPER:
			win = (this.player.equals(WhatClassGame.ROCK)); break;
		case WhatClassGame.ROCK:
			win = (this.player.equals(WhatClassGame.SCISSORS)); break;

		}

		return win;

	}


	/**
	 * Returns <code>true</code> if the most recently played hand resulted in a
	 * win for the player and <code>false</code> otherwise.
	 * 
	 * @return true if the most recently played hand resulted in a win for the
	 *         player and false otherwise
	 */
	public boolean playerWins() {

		boolean win = false;

		switch (this.player) {

		case WhatClassGame.SCISSORS:
			win = (this.computer.equals(WhatClassGame.PAPER)); break;
		case WhatClassGame.PAPER:
			win = (this.computer.equals(WhatClassGame.ROCK)); break;
		case WhatClassGame.ROCK:
			win = (this.computer.equals(WhatClassGame.SCISSORS)); break;

		}

		return win;

	}

	/**
	 * Returns the total number of rounds played.
	 * 
	 * @return the total number of rounds played
	 */
	public int getRoundsPlayed() {
		return this.roundsPlayed;

	}

	/**
	 * Returns the number of rounds won by the player.
	 * 
	 * @return the number of rounds won by the player
	 */
	public int getRoundsWonByPlayer() {

		return this.roundsWonByPlayer;
	}

	/**
	 * Returns the number of rounds won by the computer.
	 * 
	 * @return the number of rounds won by the computer
	 */
	public int getRoundsWonByComputer() {
		
		return this.roundsWonByComputer;

	}

	/**
	 * Returns the number of rounds played that resulted in draw.
	 * 
	 * @return the number of rounds played that resulted in draw
	 */
	public int getRoundsDrawn() {
		
		return this.roundsDrawn;

	}
	
	public String getWinner() {
		return this.winner;
	}
}
