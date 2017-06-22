package csc.b07.s17.e3;

import java.util.List;

public class OrgStructure {

	private String companyName;
	private List<Team> teams;

	// create a constructor
	OrgStructure(String companyName, List<Team> teams) {
		this.companyName = companyName;
		this.teams = teams;
	}

	public void setCompanyName(String name) {
		this.companyName = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	/**
	 * adds a team to the company.
	 * 
	 * @param team
	 * @return true if the team is not a part of the company, otherwise return
	 *         false
	 */
	public boolean addTeam(Team team) {
		boolean added = true;
		if (teams.contains(team)) { // check whether the team is a part of
									// company or not.
			return false; // if it is, then return false
		} else {
			teams.add(team); // if it is not a part of the company, then add the
								// team to the company
			return added; // return true
		}
	}

	/**
	 * removed team from the company
	 * 
	 * @param team
	 * @return true if the team is a part of the company, otwerwise return false
	 */
	public boolean removeTeam(Team team) {
		boolean removed = true;
		if (teams.contains(team)) { // check whether the team is a part of
									// company or not.
			teams.remove(team); // if it is, remove the team
			return removed; // return true
		} else { // if it is not a part of the company, return false
			return false;
		}
	}

	/**
	 * 
	 * @return gets the list of teams in the company
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * @returns the name of the company, followed by the names of each team
	 */
	public String toString() {
		return companyName + " " + ((Team) teams).getName();
	}

}
