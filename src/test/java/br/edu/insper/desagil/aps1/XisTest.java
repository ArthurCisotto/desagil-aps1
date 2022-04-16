package br.edu.insper.desagil.aps1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class XisTest {
	private Xis x;

	@BeforeEach
	private void setUp() {
		x = new Xis();
	}

	@Test
	void constroiPara1() {
		assertEquals(String.join("", "X\n"), x.constroi(1));
	}

	@Test
	void constroiPara2() {
		assertEquals(String.join("", "X X\n", " X\n", "X X\n"), x.constroi(2));
	}

	@Test
	void constroiPara3() {
		assertEquals(String.join("", "X   X\n", " X X\n", "  X\n", " X X\n", "X   X\n"), x.constroi(3));
	}

	@Test
	void constroiPara4() {
		assertEquals(String.join("", "X     X\n", " X   X\n", "  X X\n", "   X\n", "  X X\n", " X   X\n", "X     X\n"), x.constroi(4));
	}

	@Test
	void constroiPara5() {
		assertEquals(String.join("", "X       X\n", " X     X\n", "  X   X\n", "   X X\n", "    X\n", "   X X\n", "  X   X\n", " X     X\n", "X       X\n"), x.constroi(5));
	}
}
