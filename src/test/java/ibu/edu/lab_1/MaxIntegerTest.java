package ibu.edu.lab_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ibu.ebu.lab1.MaxInteger;

class MaxIntegerTest {
	static int[] numbers;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		numbers = MaxInteger.readNumbers("C:\\Users\\Basil\\Documents\\Code\\numbers.txt");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		numbers = null;
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMaxNumber() {
		int maxNumber = MaxInteger.findMax(numbers);
		assertEquals(987, maxNumber);
	}
	
	@Test
	void testNotMaxNumber() {
		int maxNumber = MaxInteger.findMax(numbers);
		assertNotEquals(986, maxNumber);
	}

}
