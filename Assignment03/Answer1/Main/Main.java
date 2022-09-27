package co.Assignment03.Answer1.Main;

import co.Assignment03.Answer1.Services.StudentServices;

public class Main {
	public static void main(String[] args) {
		try {
			String[] studentsInformation = {
					"22, Rajesh", 
						"23, Dinesh", 
						"22, Aboli", 
						"26, Mayuresh", 
						"25, Sarika", 
						"24, Ketaki"
					};
			StudentServices services = new StudentServices();
			services.MakeList(studentsInformation);
				
			
			services.sortByName();
			services.sortById();
			services.filterFirst();
			services.filterSecond();
			services.lengthLessThanFive();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
