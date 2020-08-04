package com.designpatterns;

import com.designpatterns.controllers.ScoreBoard;
import com.designpatterns.model.Balloon;
import com.designpatterns.model.Clow;
import com.designpatterns.model.SquareBallon;

public class Main {
	public static void main(String[] args) {
		System.out.println("Design Pattern - Strategy");
		ScoreBoard sb = new ScoreBoard();
		
		System.out.println("Ballon Tap Score:");
		sb.algorithmBase = new Balloon();
		sb.showScore(10, 5);
		
		System.out.println("Clown Tap Score:");
		sb.algorithmBase = new Clow();
		sb.showScore(10, 5);
		
		System.out.println("SquareBallon Tap Score:");
		sb.algorithmBase = new SquareBallon();
		sb.showScore(10, 5);
	}
}
