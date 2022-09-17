package assignement01.Answer8;


public class Emp{
	private Integer empId;
	private String empName;
	private String empAddress;
	private Float empSalary;
	public Emp(int empId, String empName, String empAddress, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}
}
