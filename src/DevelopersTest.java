package csc.b07.s17.e3;

import static org.junit.Assert.*;

import org.junit.Test;

import csc.b07.s17.e3.exceptions.BonusOutOfBoundsException;

public class DevelopersTest {

	@Test
	public void testgetBonus() {

		Developers man1 = new Developers("Tom", "tar", 312321, "tomtom", "employee", "team1", 8.1f, 31241);

		assertEquals(8, 1, man1.getBonus());
	}

	@Test(expected = BonusOutOfBoundsException.class)
	public void testsetBonuswithException() throws Exception {
		Developers man1 = new Developers("Tom", "tar", 312321, "tomtom", "employee", "team1", 8.1f, 31241);

		man1.setBonus(50);
		; // Test pass
	}

	@Test
	public void testsetBonuswithoutException() throws Exception {
		Developers man1 = new Developers("Tom", "tar", 312321, "tomtom", "employee", "team1", 8.1f, 31241);

		man1.setBonus(5); // Test pass
	}

	@Test
	public void testsetBonuswithoutException2() throws Exception {
		Developers man1 = new Developers("Tom", "tar", 312321, "tomtom", "employee", "team1", 8.1f, 31241);

		man1.setBonus(0); // Test pass
	}

}
