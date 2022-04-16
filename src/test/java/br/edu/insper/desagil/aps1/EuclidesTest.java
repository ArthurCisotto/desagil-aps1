package br.edu.insper.desagil.aps1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EuclidesTest {
	private Euclides e;

	@BeforeEach
	private void setUp() {
		e = new Euclides();
	}

	@Test
	void devolve1SeRecebe0e1() {
		assertEquals(1, e.mdc(0, 1));
	}

	@Test
	void devolve1SeRecebe1e0() {
		assertEquals(1, e.mdc(1, 0));
	}

	@Test
	void devolve2SeRecebe0e2() {
		assertEquals(2, e.mdc(0, 2));
	}

	@Test
	void devolve2SeRecebe2e0() {
		assertEquals(2, e.mdc(2, 0));
	}

	@Test
	void devolve3SeRecebe0e3() {
		assertEquals(3, e.mdc(0, 3));
	}

	@Test
	void devolve3SeRecebe3e0() {
		assertEquals(3, e.mdc(3, 0));
	}

	@Test
	void devolve4SeRecebe0e4() {
		assertEquals(4, e.mdc(0, 4));
	}

	@Test
	void devolve4SeRecebe4e0() {
		assertEquals(4, e.mdc(4, 0));
	}

	@Test
	void devolve1SeRecebe1e2() {
		assertEquals(1, e.mdc(1, 2));
	}

	@Test
	void devolve1SeRecebe2e1() {
		assertEquals(1, e.mdc(2, 1));
	}

	@Test
	void devolve1SeRecebe1e3() {
		assertEquals(1, e.mdc(1, 3));
	}

	@Test
	void devolve1SeRecebe3e1() {
		assertEquals(1, e.mdc(3, 1));
	}

	@Test
	void devolve1SeRecebe1e4() {
		assertEquals(1, e.mdc(1, 4));
	}

	@Test
	void devolve1SeRecebe4e1() {
		assertEquals(1, e.mdc(4, 1));
	}

	@Test
	void devolve1SeRecebe2e3() {
		assertEquals(1, e.mdc(2, 3));
	}

	@Test
	void devolve1SeRecebe3e2() {
		assertEquals(1, e.mdc(3, 2));
	}

	@Test
	void devolve2SeRecebe2e4() {
		assertEquals(2, e.mdc(2, 4));
	}

	@Test
	void devolve2SeRecebe4e2() {
		assertEquals(2, e.mdc(4, 2));
	}

	@Test
	void devolve1SeRecebe3e4() {
		assertEquals(1, e.mdc(3, 4));
	}

	@Test
	void devolve1SeRecebe4e3() {
		assertEquals(1, e.mdc(4, 3));
	}

	@Test
	void devolve3SeRecebe9e15() {
		assertEquals(3, e.mdc(9, 15));
	}

	@Test
	void devolve3SeRecebe15e9() {
		assertEquals(3, e.mdc(15, 9));
	}

	@Test
	void devolve1SeRecebe5e11() {
		assertEquals(1, e.mdc(5, 11));
	}

	@Test
	void devolve1SeRecebe11e5() {
		assertEquals(1, e.mdc(11, 5));
	}

	@Test
	void devolve6SeRecebe12e18() {
		assertEquals(6, e.mdc(12, 18));
	}

	@Test
	void devolve6SeRecebe18e12() {
		assertEquals(6, e.mdc(18, 12));
	}

	@Test
	void devolve7SeRecebe35e77() {
		assertEquals(7, e.mdc(35, 77));
	}

	@Test
	void devolve7SeRecebe77e35() {
		assertEquals(7, e.mdc(77, 35));
	}

	@Test
	void devolve13SeRecebe143e221() {
		assertEquals(13, e.mdc(143, 221));
	}

	@Test
	void devolve13SeRecebe221e143() {
		assertEquals(13, e.mdc(221, 143));
	}

	@Test
	void devolve31SeRecebe713e1147() {
		assertEquals(31, e.mdc(713, 1147));
	}

	@Test
	void devolve31SeRecebe1147e713() {
		assertEquals(31, e.mdc(1147, 713));
	}
}
