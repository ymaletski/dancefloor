package ru.mail.yura.io;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ru.mail.yura.exception.NegativeValueException;

public class IOData {
	
	Console console;
	static final Logger ioLogger = LogManager.getLogger(IOData.class);
	
	public ArrayList<Integer> getInstructions() {
		ArrayList<Integer> instructions = new ArrayList<Integer>();
		String inputStr;
		int i = 0;
		ioLogger.info("Enter instructions.");
		ioLogger.info("For example: 3 5 6 8 5 ...");
		Scanner scanner = new Scanner(System.in);
		inputStr = scanner.nextLine();
		scanner.close();
		try {
			for (String s : inputStr.split(" ")) {
				i = Integer.valueOf(s);
				if (i < 0) 
					throw new NegativeValueException(i);
				instructions.add(i);
			}
		} catch (NumberFormatException e1) {
			ioLogger.error("Entry of invalid data: " + e1.getMessage());
			instructions.clear();
			instructions.add(0);
		} catch (NegativeValueException e2) {
			ioLogger.error("Entry of invalid data: " + e2.getMessage());
			instructions.clear();
			instructions.add(0);
		}
		return instructions;
	}
	
	public void showResults(ArrayList<Integer> instructions, int stepsPassedTotal) {
		ioLogger.info("Instructions: ");
		for (int i : instructions)
			ioLogger.info(i + " ");
		ioLogger.info("Size of the dancefloor: " + instructions.size());
		ioLogger.info("Total number of passed steps: " + stepsPassedTotal);
	}
}
