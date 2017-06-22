package csc.b07.s17.e3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class OrgStructureTest {

	Manager mang1;
	Manager mang2;
	Employee emp1;
	Employee emp2;
	Employee emp3;
	Employee emp4;
	Employee emp5;
	Employee emp6;
	Employee emp7;
	Employee emp8;
	Employee emp9;
	Employee emp10;

	@Test
	public void testgetCompanyName() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);
		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);

		assertEquals("team1", company1.getCompanyName());
	}

	@Test
	public void testgetTeams() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);
		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);

		assertEquals(allteams, company1.getTeams());
	}

	@Test
	public void testgetTeamsnoTeams() {

		OrgStructure company1 = new OrgStructure("team1", null);

		assertEquals(null, company1.getTeams());
	}

	@Test
	public void testaddTeam() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);

		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		Team newTeam = new Team(mang2, teamlist2, "team3", 129.32f, "tesla", 654643.32f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);

		assertTrue("Success", company1.addTeam(newTeam));
	}

	@Test
	public void testaddTeam2() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);

		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);
		boolean a = company1.addTeam(team1);

		assertTrue("Should fail, because the team is already works for company", a);
	}

	@Test
	public void testremoveTeam() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);

		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);

		assertTrue("Success", company1.removeTeam(team1));
	}

	@Test
	public void testremoveTeam2() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);

		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		Team newTeam = new Team(mang2, teamlist2, "team3", 129.32f, "tesla", 654643.32f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("team1", allteams);

		boolean a = company1.removeTeam(newTeam);

		assertTrue("Should fail, because the team is already works for company", a);

	}

	@Test
	public void testtoString() {
		List<Employee> teamlist1 = Arrays.asList(emp1, emp2, emp3);
		List<Employee> teamlist2 = Arrays.asList(emp4, emp5, emp6);

		Team team1 = new Team(mang1, teamlist1, "team1", 312.32f, "google", 32131.2f);
		Team team2 = new Team(mang2, teamlist2, "team2", 534.32f, "microsoft", 98.03450f);

		List<Team> allteams = new ArrayList<Team>();
		allteams.add(team1);
		allteams.add(team2);

		OrgStructure company1 = new OrgStructure("company1", allteams);

		assertEquals("company1 team1 team2", company1.toString());
	}

}
