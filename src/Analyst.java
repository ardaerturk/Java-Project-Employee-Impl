package csc.b07.s17.e3;

import csc.b07.s17.e3.exceptions.WrongSignException;

public class Analyst extends TechnicalEmployees {
	// set the max lieu and the employers lieu times

	private float lieuEmp;

	// create a constructor
	Analyst(String name, String lastName, long employeeId, String commonName, float monthlySalary, String status,
			String teamName, float lieu) {
		// use the superclass of technical employees
		super(name, lastName, employeeId, commonName, monthlySalary, status, teamName, lieu);
		monthlySalary = (float) 50.00002; // set the monthly salary
		lieu = (float) (lieuEmp * 1.5); // set the lieu time. it is 1.5x of
										// developers.
	}

	public float getMaxLieuTime() {
		return super.getMaxLieuTime();
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
		return super.addLieuTime(lieuTime);
	}

	public void setMaxLieuTime(float MaxLieuTime) {
		super.setMaxLieuTime(MaxLieuTime);
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
		return super.deductLieuTime(lieuTime);
	}

}
