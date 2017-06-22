package csc.b07.s17.e3;

public class ClericalEmployees extends Employee {

	private ClericalEmployees(String name, String lastName, long employeeId, String commonName, String status,
			String teamName, float monthlySalary) {
		super(name, lastName, employeeId, commonName, monthlySalary, status, teamName);
		monthlySalary = (float) 55.13643;
	}

}
