package csc.b07.s17.e3;

import csc.b07.s17.e3.exceptions.WrongSignException;

public class TechnicalEmployees extends Employee {

	private float maxLieu;
	private float lieuEmp;

	// create a constructor
	protected TechnicalEmployees(String name, String lastName, long employeeId, String commonName, float monthlySalary,
			String status, String teamName, float lieu) {
		// use super class Employee
		super(name, lastName, employeeId, commonName, monthlySalary, status, teamName);
		monthlySalary = 50.00002f; // set the salary
		lieu = lieuEmp; // set the employers lieu time

	}

	public float getMaxLieuTime() {
		return maxLieu;
	}

	public void setMaxLieuTime(float MaxLieuTime) {
		this.maxLieu = MaxLieuTime;
	}

	/**
	 * give an employee more lieu time
	 * 
	 * @param lieuTime
	 * @return false if the amount of time surpasses their maximum, otherwise
	 *         return true
	 * @throws WrongSignException
	 *             if the result is negative
	 */
	public boolean addLieuTime(float lieuTime) throws WrongSignException {
		boolean added = true;
		if (lieuTime < 0) { // if the input is negative, throwWrongSignException
			throw new WrongSignException("The amount is less than 0!");
		} else if (lieuEmp < lieuTime) { // check whether the current lieu time
											// is less than the given amount
			lieuEmp += lieuTime; // if it is, then add the new amount to the
									// current lieu time
			return added;
		}
		return added;

	}

	/**
	 * take away lieu time from the available lieu time
	 * 
	 * @param lieuTime
	 * @return false if the amount is greater than the available lieu time,
	 *         otherwise return true
	 * @throws WrongSignException
	 *             if the input is a positive number
	 */
	public boolean deductLieuTime(float lieuTime) throws WrongSignException {
		boolean deducted = true;
		if (lieuTime > 0) { // if the input is negative, throwWrongSignException
			throw new WrongSignException("The amount is less than 0!");
		} else if (lieuTime > lieuEmp) { // check whether the current lieu time
											// is greater than the given amount
			lieuEmp -= lieuTime; // if it is, then substract the new amount from
									// the current lieu time
			return deducted;
		}
		return deducted;
	}
}
