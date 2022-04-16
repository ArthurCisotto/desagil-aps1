package br.edu.insper.desagil.aps1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumeroTest {
	private Numero n;

	@BeforeEach
	private void setUp() {
		n = new Numero();
	}

	@Test
	void devolveFalsePara1() {
		assertFalse(n.perfeito(1));
	}

	@Test
	void devolveFalsePara2() {
		assertFalse(n.perfeito(2));
	}

	@Test
	void devolveFalsePara3() {
		assertFalse(n.perfeito(3));
	}

	@Test
	void devolveTruePara6() {
		assertTrue(n.perfeito(6));
	}

	@Test
	void devolveFalsePara11() {
		assertFalse(n.perfeito(11));
	}

	@Test
	void devolveFalsePara17() {
		assertFalse(n.perfeito(17));
	}

	@Test
	void devolveFalsePara23() {
		assertFalse(n.perfeito(23));
	}

	@Test
	void devolveTruePara28() {
		assertTrue(n.perfeito(28));
	}

	@Test
	void devolveFalsePara150() {
		assertFalse(n.perfeito(150));
	}

	@Test
	void devolveFalsePara272() {
		assertFalse(n.perfeito(272));
	}

	@Test
	void devolveFalsePara384() {
		assertFalse(n.perfeito(384));
	}

	@Test
	void devolveTruePara496() {
		assertTrue(n.perfeito(496));
	}

	@Test
	void devolveFalsePara2404() {
		assertFalse(n.perfeito(2404));
	}

	@Test
	void devolveFalsePara4312() {
		assertFalse(n.perfeito(4312));
	}

	@Test
	void devolveFalsePara6220() {
		assertFalse(n.perfeito(6220));
	}

	@Test
	void devolveTruePara8128() {
		assertTrue(n.perfeito(8128));
	}
}
