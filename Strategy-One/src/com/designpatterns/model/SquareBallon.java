package com.designpatterns.model;

import com.designpatterns.controllers.ScoreAlgorithmBase;

public class SquareBallon extends ScoreAlgorithmBase{

	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) + 40;
	}

}
