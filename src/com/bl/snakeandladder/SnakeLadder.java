package com.bl.snakeandladder;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println(" Welcome to Snake And Ladder ");
		int player1 = 0;// start position 0 uc1
		SnakeLadder sn = new SnakeLadder();
		sn.throwingDice();
	}
	
	public int throwingDice( ) {
		Random rand = new Random();
		int upperbound = 7;
		int lowerbound = 1;
		int randomDice = rand.nextInt(upperbound-lowerbound) + lowerbound;
		System.out.println("Random dice number:" + randomDice);
		return randomDice;
	}

}