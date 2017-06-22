package csc.b07.s17.e3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import csc.b07.s17.e3.exceptions.InsufficientFundsException;

public class TeamTest {
	Manager mang;
	Employee emp1;
	Employee emp2;
	Employee emp3;

	@Test
	public void testgetManager() {

		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);
		assertEquals(mang, team1.getManager());
	}

	@Test
	public void testgetName() {

		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);
		assertEquals(team1, team1.getName());
	}

	@Test
	public void testgetTeamMembers() {

		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);
		assertEquals(teamlist, team1.getTeamMembers());
	}

	@Test
	public void testaddTeamMember() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1, emp2);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);

		assertEquals(false, team1.addTeamMember(emp1));
	}

	@Test
	public void testaddTeamMember2() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);
		boolean a = team1.addTeamMember(emp2);

		assertTrue("Success", a);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testaddFunding() {
		Team team1 = new Team(mang, null, "team1", 70f, "google", 70f);

		team1.addFunding(20f);

		assertEquals(90f, team1.getRemainingFunding());
	}

	@Test(expected = InsufficientFundsException.class)
	public void testremoveFunding() throws InsufficientFundsException {
		Team team1 = new Team(mang, null, "team1", 70f, "google", 70f);

		team1.removeFunding(-50f);
	}

	@Test
	public void testremoveFunding2() throws InsufficientFundsException {
		Team team1 = new Team(mang, null, "team1", 70f, "google", 70f);

		team1.removeFunding(30f);
	}

	@Test
	public void testfireTeamMember() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1, emp2);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);

		assertEquals(true, team1.fireTeamMember(emp1));
	}

	@Test
	public void testfireTeamMember2() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);

		assertEquals(false, team1.fireTeamMember(emp2));
	}

	@Test
	public void testfindTeamMember1() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1, emp2);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);

		assertEquals(true, team1.findTeamMember(emp1));
	}

	@Test
	public void testfindTeamMember2() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);

		List<Employee> teamlist = Arrays.asList(emp1);
		Team team1 = new Team(mang, teamlist, "team1", 31232, "google", 321312);

		assertEquals(false, team1.findTeamMember(emp2));
	}

}
