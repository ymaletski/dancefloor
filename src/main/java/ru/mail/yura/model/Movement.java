package ru.mail.yura.model;

import java.util.ArrayList;

public interface Movement {
	
	default int move(ArrayList<Integer> instructions) {
		int sizeOfTheDancefloor = instructions.size();
		int stepsPassedTotal = 0, currentPosition = 0;
		if ((instructions.get(0) > 0) && (instructions.get(0) % 2 != 1)) {
			for(int oneStep : instructions) {
				if ((oneStep % 2) == 1) {
					if (oneStep > currentPosition) {
						stepsPassedTotal += currentPosition;
						break;
					} else {	
					currentPosition -= oneStep;
					stepsPassedTotal += oneStep;
					}
				} else {
					if(oneStep > (sizeOfTheDancefloor-currentPosition)) {
						stepsPassedTotal += currentPosition;
						break;
					} else {
						currentPosition += oneStep;
						stepsPassedTotal += oneStep;
					}
				}
				
			}
		}
		return stepsPassedTotal;	
	}
	
}
