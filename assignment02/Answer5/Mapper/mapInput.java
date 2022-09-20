package co.Assignment02.Answer5.Mapper;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;

public class mapInput {
	public static HighestSalary map(String data) {
		String []splitArray = data.split(",");
		String department = splitArray[2];
		Integer Salary = Integer.parseInt(splitArray[3]);
		
		HighestSalary sal = new HighestSalary();
		
		sal.setDepartment(department);
		sal.setSalary(Salary);
		
		return sal;
	}

}
