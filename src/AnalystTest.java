package csc.b07.s17.e3;

import org.junit.Test;

import csc.b07.s17.e3.exceptions.WrongSignException;

public class AnalystTest {

	@Test(expected = WrongSignException.class)
	public void addLieuTimeWithException() throws Exception {
		Analyst man1 = new Analyst("Tom", "tar", 312321, "tomtom", 8.1f, "employee", "team1", 11);

		man1.addLieuTime(-1); // Test pass
	}

	@Test
	public void addLieuTimeWithoutException() throws Exception {
		Analyst man1 = new Analyst("Tom", "tar", 312321, "tomtom", 8.1f, "employee", "team1", 11);

		man1.addLieuTime(30); // Test pass
	}

	@Test(expected = WrongSignException.class)
	public void testdeductLieuTimeWithException() throws Exception {
		Analyst man1 = new Analyst("Tom", "tar", 312321, "tomtom", 8.1f, "employee", "team1", 11);

		man1.deductLieuTime(12);
	}

	@Test
	public void testdeductLieuTimeWitoutException() throws Exception {
		Analyst man1 = new Analyst("Tom", "tar", 312321, "tomtom", 8.1f, "employee", "team1", 11);

		man1.deductLieuTime(-14);
	}

	@Test
	public void testdeductLieuTimeWitoutException2() throws Exception {
		Analyst man1 = new Analyst("Tom", "tar", 312321, "tomtom", 8.1f, "employee", "team1", 11);

		man1.deductLieuTime(0);
	}

}
