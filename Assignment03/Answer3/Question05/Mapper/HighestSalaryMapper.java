package co.Assignment03.Answer3.Question05.Mapper;

import co.Assignment03.Answer3.Question05.Model.HighestSalary;

public class HighestSalaryMapper {
		public static HighestSalary map(String data) {
			String []splitArray = data.split(", ");
			HighestSalary salary = null;
			try {
				Integer studentId = Integer.parseInt(splitArray[0]);
				String studentName = splitArray[1];
				String department = splitArray[2];
				Integer Salary = Integer.parseInt(splitArray[3]);
				salary =  new HighestSalary(studentId, studentName, department, Salary);
				
			}catch(NumberFormatException numberFormat) {
				System.out.println(numberFormat);
			}catch(Exception ex) {
				throw new RuntimeException(ex);
			}	
			return salary;
		}

}
