package com.Assignment02.Answer5.Mapper;

import com.Assignment02.Answer5.HighestSalary.HighestSalary;

public class MapInput {
	public static HighestSalary map(String data) {
		String []splitArray = data.split(",");
		HighestSalary sal = new HighestSalary();
		
		try {
			String department = splitArray[2];
			Integer Salary = Integer.parseInt(splitArray[3]);
			
		
			sal.setDepartment(department);
			sal.setSalary(Salary);
			
		}catch(NumberFormatException numberFormat) {
			System.out.println(numberFormat);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return sal;
		
	}	

}
