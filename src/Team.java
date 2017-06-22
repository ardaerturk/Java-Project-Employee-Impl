package csc.b07.s17.e3;

import java.util.List;
import csc.b07.s17.e3.exceptions.InsufficientFundsException;

public class Team {

	private String teamName;
	private Manager manager;
	private List<Employee> teamMembers;
	private float payroll;
	private String companyName;
	private float funding;

	// create a constructor

	Team(Manager manager, List<Employee> teamMembers, String teamName, float payroll, String companyName,
			float funding) {
		this.manager = manager;
		this.teamMembers = teamMembers;
		this.teamName = teamName;
		this.payroll = payroll;
		this.companyName = companyName;
		this.funding = funding;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	/**
	 * gets the list of team members
	 * 
	 * @return a list of the team members including the manager
	 */
	public List<Employee> getTeamMembers() {
		return teamMembers;
	}

	/**
	 * add a member to the team
	 * 
	 * @param employee
	 * @return true if the employee is in the list, otherwise, return false
	 */
	public boolean addTeamMember(Employee employee) {
		boolean approved = true;
		if (teamMembers.contains(employee)) { // check whether given employee is
												// in the list or not
			teamMembers.add(employee); // if it is on the list, then add him/her
										// to the list
			return approved; // return true
		} else {
			return false; // otherwise, return false
		}
	}

	public String getName() {
		return teamName;
	}

	public void setName(String name) {
		this.teamName = name;
	}

	/**
	 * gets the total amount of money owed to all employees on the team.
	 * 
	 * @return the total payroll amount
	 */
	public float getPayrollAmount() {
		return payroll;
	}

	/**
	 * get the remaining funds that the team has available
	 * 
	 * @return the remaining funds
	 */
	public float getRemainingFunding() {
		return funding;
	}

	public void addFunding(float amount) {
		this.funding = funding + amount; // add the amount to the funding to get
											// the new amount
	}

	/**
	 * remove funding from the team.
	 * 
	 * @param amount
	 * @throws InsufficientFundsException
	 *             error if the result is a negative number
	 */
	public void removeFunding(float amount) throws InsufficientFundsException {
		if (amount < 0) { // check whether the amount is negative
			throw new InsufficientFundsException("The new amount is negative!"); // if
																					// it
																					// is
																					// negative
																					// then
																					// throw
																					// InsufficientFundsException
		} else {
			this.funding = funding - amount; // otherwise substract the amount
												// from funding
		}
	}

	/**
	 * removes a team member
	 * 
	 * @param employee
	 * @return true if the member is on the list, otherwise, return false
	 */
	public boolean fireTeamMember(Employee employee) {
		boolean success = true;
		if (teamMembers.contains(employee)) { // check whether given employee is
												// in the list or not.
			employee.setStatus("LET GO"); // if he/she is on the list, then set
											// their status to LET GO
			return success; // return true
		} else { // otherwise return false
			return false;
		}
	}

	/**
	 * finds a team member from the list
	 * 
	 * @param employee
	 * @return true if the given employee if found in the list, otherwise return
	 *         false
	 */
	public boolean findTeamMember(Employee employee) {
		boolean onTeam = true;
		if (teamMembers.contains(employee)) { // check whether the given
												// employee is in the list or
												// not
			return onTeam; // return true if he/she is on the list
		} else {
			return false; // otherwise return false
		}
	}

}
