package br.edu.insper.desagil.aps1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeibnizTest {
	private static double DELTA = 0.000001;

	private Leibniz l;

	@BeforeEach
	private void setUp() {
		l = new Leibniz();
	}

	@Test
	void calculaPara1() {
		assertEquals(4, l.pi(1), DELTA);
	}

	@Test
	void calculaPara2() {
		assertEquals(2.666666, l.pi(2), DELTA);
	}

	@Test
	void calculaPara3() {
		assertEquals(3.466666, l.pi(3), DELTA);
	}

	@Test
	void calculaPara4() {
		assertEquals(2.895238, l.pi(4), DELTA);
	}

	@Test
	void calculaPara5() {
		assertEquals(3.339682, l.pi(5), DELTA);
	}

	@Test
	void calculaPara6() {
		assertEquals(2.976046, l.pi(6), DELTA);
	}

	@Test
	void calculaPara7() {
		assertEquals(3.283738, l.pi(7), DELTA);
	}

	@Test
	void calculaPara8() {
		assertEquals(3.017071, l.pi(8), DELTA);
	}

	@Test
	void calculaPara9() {
		assertEquals(3.252365, l.pi(9), DELTA);
	}

	@Test
	void calculaPara10() {
		assertEquals(3.041839, l.pi(10), DELTA);
	}
}
