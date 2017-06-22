package csc.b07.s17.e3;

import csc.b07.s17.e3.exceptions.BonusOutOfBoundsException;

public class Developers extends Employee {

	private float developerBonus;

	// create a constructor
	Developers(String name, String lastName, long employeeId, String commonName, String status, String teamName,
			float bonusPayment, float monthlySalary) {

		// use super class
		super(name, lastName, employeeId, commonName, monthlySalary, status, teamName);
		developerBonus = bonusPayment; // set the bonus
		monthlySalary = 110.11010f; // set the salary

	}

	/**
	 * Gets the current managerial bonus for this employee
	 * 
	 * @return the bonus amount
	 */
	public float getBonus() {
		return developerBonus;
	}

	/**
	 * sets the managerial bonus.
	 * 
	 * @param bonus
	 * @throws BonusOutOfBoundsException
	 *             if the bonus is beyond the maximum bonus amount
	 */
	public void setBonus(float bonus) throws BonusOutOfBoundsException {
		this.developerBonus = bonus; // set the bonus
		if (bonus > 10) { // check whether the bonus is greater than %10, if it
							// is raise BonusOutOfBoundsException
			throw new BonusOutOfBoundsException("The bonus is greater than the maximum amount!");
		}
	}
}
