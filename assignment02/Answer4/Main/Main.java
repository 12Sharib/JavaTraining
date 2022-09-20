package co.Assignment02.Answer4.Main;

import co.Assignment02.Answer4.Operations.Operations;

public class Main {

	public static void main(String[] args) {
		String input [] = {  "22, Data Structures,45", "23, English,52", "22, English,51",
				"26, Data Structures,72", "23, Data Structures,61", "24, English,81"};
		
		Operations op = new Operations();
		
		op.mapInput(input);
		
		Integer minimumIdInList = op.findMinimumInList();
	
		Float average =  op.findAverage(minimumIdInList);
		op.printOutput(average);
		
	}

}
 