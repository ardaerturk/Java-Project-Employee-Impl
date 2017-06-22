package csc.b07.s17.e3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import csc.b07.s17.e3.exceptions.BonusOutOfBoundsException;

public class ManagerTest {

	@Test
	public void testgetBonus() {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Anm", "vc", 3766645, "tomtom", "employee", "team1", 4, 312141, null);
		Employee emp3 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);
		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Manager man1 = new Manager("Tom", "tar", 312321, "tomtom", "employee", "team1", (float) 8.1, 31241, teamlist);

		assertEquals(13, 13, man1.getBonus());
	}

	@Test(expected = BonusOutOfBoundsException.class)
	public void testsetBonuswithException() throws Exception {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Anm", "vc", 3766645, "tomtom", "employee", "team1", 4, 312141, null);
		Employee emp3 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);
		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Manager man1 = new Manager("Tom", "tar", 312321, "tomtom", "employee", "team1", (float) 13.13, 31241, teamlist);

		man1.setBonus(50); // Test pass
	}

	@Test
	public void testsetBonuswithoutException() throws Exception {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Anm", "vc", 3766645, "tomtom", "employee", "team1", 4, 312141, null);
		Employee emp3 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);
		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Manager man1 = new Manager("Tom", "tar", 312321, "tomtom", "employee", "team1", (float) 13.13, 31241, teamlist);

		man1.setBonus(5); // Test pass
	}

	@Test
	public void testCaseWhereExceptionWontBeThrown() throws Exception {
		Employee emp1 = new Manager("Emp", "da", 312321, "tomtom", "employee", "team1", 5, 31241, null);
		Employee emp2 = new Manager("Anm", "vc", 3766645, "tomtom", "employee", "team1", 4, 312141, null);
		Employee emp3 = new Manager("Tom", "tar", 423904932, "tomtom", "employee", "team1", 6, 67641, null);
		List<Employee> teamlist = Arrays.asList(emp1, emp2, emp3);
		Manager man1 = new Manager("Tom", "tar", 312321, "tomtom", "employee", "team1", (float) 13.13, 31241, teamlist);

		man1.setBonus(0); // Test pass
	}

}
