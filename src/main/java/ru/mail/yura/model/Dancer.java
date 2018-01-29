package ru.mail.yura.model;

import java.util.ArrayList;

import ru.mail.yura.io.IOData;

public class Dancer implements Movement {
		
	public void dance() {	
		IOData ioData = new IOData();
		ArrayList<Integer> instructions = ioData.getInstructions();	
		int stepsPassedTotal = 0;
		stepsPassedTotal = move(instructions);
		ioData.showResults(instructions, stepsPassedTotal);
	}

}
