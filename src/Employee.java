package csc.b07.s17.e3;

import csc.b07.s17.e3.exceptions.SalaryOutOfBoundsException;

public abstract class Employee {

	// TODO complete as stated on the exercise sheet. Be sure to use abstract
	// methods, where logical
	private String name;
	private String lastName;
	private long employeeId;
	private String commonName;
	private float monthlySalary;
	private String status;
	private String teamName;
	private int salaryMin;
	private int salaryMax;

	// create a constructor
	protected Employee(String name, String lastName, long employeeId, String commonName, float monthlySalary,
			String status, String teamName) {
		this.name = name;
		this.lastName = name;
		this.employeeId = employeeId;
		this.commonName = commonName;
		this.monthlySalary = monthlySalary;
		this.status = status;
		this.teamName = teamName;

	}

	public long getId() {
		return employeeId;
	}

	public String getFirstName() {
		// this.getFirstName
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the name the employee goes by
	 * 
	 * @return the employee's first name if field is empty.
	 */
	public String getCommonName() {
		return commonName;
	}

	public float getSalary() {
		return monthlySalary;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public void setFirstName(String firstName) {
		this.name = firstName;
	}

	/**
	 * Adjust the employee’s salary by the given amount. If the status RETIRED
	 * or LET GO return false
	 * 
	 * @param adjustment
	 * @return true if the salary adjusted
	 * @throws SalaryOutOfBoundsException
	 *             if the amount is higher than the salary range
	 */
	public boolean adjustSalary(double adjustment) throws SalaryOutOfBoundsException {
		boolean adjusted = true;
		if (monthlySalary + adjustment > salaryMax && monthlySalary + adjustment < salaryMin) { // check
			// whether the new amount is in the price range
			throw new SalaryOutOfBoundsException("The new salary is higher or lower than the range");
			// throw SalaryOutOfBoundsException if it is not in range
		} else if (getStatus() == "LET GO" || getStatus() == "RETIRED") {
			// if the status is let go or retired don't adjust and return false
			return false;
		} else {
			this.monthlySalary = (float) (monthlySalary + adjustment);
			// otherwise adjust the salary by adding the adjustment it to the
			// current salary.
			return adjusted;
		}
	}

	/**
	 * sets the employee's status, either ACTIVE, RETIRED, or LET GO
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	/**
	 * @returns employees name (last, first, common if different than first),
	 *          employee number, Team name, salary.
	 */
	public String toString() {
		return lastName + " " + name + " " + commonName + " " + employeeId + " " + teamName + " " + monthlySalary;
	}
}
