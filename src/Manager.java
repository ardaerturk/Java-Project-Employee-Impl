package csc.b07.s17.e3;

import java.util.List;
import csc.b07.s17.e3.exceptions.BonusOutOfBoundsException;

public class Manager extends Employee {

	private float managerBonus;

	Manager(String name, String lastName, long employeeId, String commonName, String status, String teamName,
			float bonusPayment, float monthlySalary, List<Employee> teamMembers) {

		super(name, lastName, employeeId, commonName, monthlySalary, status, teamName);
		managerBonus = bonusPayment; // set the bonus amount
		monthlySalary = 125.50050f; // set the salary

	}

	/**
	 * Gets the current managerial bonus for this employee
	 * 
	 * @return the bonus amount
	 */
	public float getBonus() {
		return managerBonus;
	}

	/**
	 * sets the managerial bonus.
	 * 
	 * @param bonus
	 * @throws BonusOutOfBoundsException
	 *             if the bonus is beyond the maximum bonus amount
	 */
	public void setBonus(float bonus) throws BonusOutOfBoundsException {
		this.managerBonus = bonus; // set the managerial bonus
		if (bonus > 30) { // if it is more than 30%
			throw new BonusOutOfBoundsException("The bonus amount is beyond the maximum value!"); // throw
																									// BonusOutOfBoundsException
		}
	}

}
