package csc.b07.s17.e3;

import static org.junit.Assert.*;

import org.junit.Test;

import csc.b07.s17.e3.exceptions.*;

public class TechnicalEmployeesTest {

	@Test(expected = WrongSignException.class)
	public void testaddLieuTime1() throws WrongSignException {

		TechnicalEmployees emp1 = new TechnicalEmployees("donald", "trump", 42424332L, "don", 312312.534543f,
				"president", "team Trump", 13f);

		emp1.addLieuTime(-1f);

	}

	@Test(expected = WrongSignException.class)
	public void testaddLieuTime2() throws WrongSignException {

		TechnicalEmployees emp1 = new TechnicalEmployees("donald", "trump", 42424332L, "don", 312312.534543f,
				"president", "team Trump", 13f);

		emp1.addLieuTime(0f);

	}

	@Test
	public void testaddLieuTime3() throws WrongSignException {

		TechnicalEmployees emp1 = new TechnicalEmployees("donald", "trump", 42424332L, "don", 312312.534543f,
				"president", "team Trump", 13f);
		boolean a = emp1.addLieuTime(32f);

		assertTrue("Should pass", a);

	}

	@Test(expected = WrongSignException.class)
	public void testdeductLieuTime1() throws WrongSignException {

		TechnicalEmployees emp1 = new TechnicalEmployees("donald", "trump", 42424332L, "don", 312312.534543f,
				"president", "team Trump", 13f);
		boolean a = emp1.deductLieuTime(10f);

		assertTrue("Should pass", a);

	}

	@Test
	public void testdeductLieuTime2() throws WrongSignException {

		TechnicalEmployees emp1 = new TechnicalEmployees("donald", "trump", 42424332L, "don", 312312.534543f,
				"president", "team Trump", 13f);
		boolean a = emp1.deductLieuTime(-10f);

		assertTrue("Should pass", a);

	}

}
