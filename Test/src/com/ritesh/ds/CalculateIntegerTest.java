package com.ritesh.ds;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * jUnit to test lowest and second lowest method of class CalculateInteger
 * 
 * @author Ritesh Vaja
 * */
public class CalculateIntegerTest {

	private CalculateInteger sut;

	// For exception
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void setup() {
		sut = new CalculateInteger();
	}

	// unitOfWork should expectedBehavior when stateUnderTest
	/************************************** findLowestInteger() *********************/
	@Test
	public void findLowestInteger_null_emptyList() throws Exception {
		// Arrange
		List<Integer> integerList = new ArrayList<Integer>();
		Integer expect = null;

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expect, actual);
	}

	@Test
	public void findLowestInteger_null_nullList() throws Exception {
		// Arrange
		List<Integer> integerList = null;

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(null, actual);
	}

	@Test
	public void findLowestInteger_integer_singleNumberList() throws Exception {
		// Arrange
		Integer expected = Integer.MAX_VALUE;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(expected);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_allDuplicatesList() throws Exception {
		// Arrange
		Integer expected = 16;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(16);
		integerList.add(16);
		integerList.add(16);
		integerList.add(16);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_allDuplicatesNullList() throws Exception {
		// Arrange
		Integer expected = null;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_nullIntegerList() throws Exception {
		// Arrange
		Integer expected = -1;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
		integerList.add(-1);
		integerList.add(10);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_nullOnlyList() throws Exception {
		// Arrange
		Integer expected = null;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);

		// Act
		Integer actual = sut.findLowestInteger(integerList);
		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_maxMinList() throws Exception {
		// Arrange
		Integer expected = Integer.MIN_VALUE;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(16);
		integerList.add(Integer.MAX_VALUE);
		integerList.add(Integer.MIN_VALUE);
		integerList.add(-16);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findLowestInteger_integer_anyIntegerList() throws Exception {
		// Arrange
		Integer expected = -1;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(16);
		integerList.add(-1);
		integerList.add(10);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	@Ignore
	public void findLowestInteger_integer_anyIntegerConvertedList() throws Exception {
		// Arrange
		Integer expected = -1;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.parseInt("Ritesh"));
		integerList.add(-1);
		integerList.add(10);

		// Act
		Integer actual = sut.findLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	/************************************** findSecondLowestInteger() *********************/
	@Test
	public void findSecondLowestInteger_null_emptyList() throws Exception {
		// Arrange
		Integer expected = null;
		List<Integer> integerList = new ArrayList<Integer>();

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_null_nullList() throws Exception {
		// Arrange
		Integer expected = null;
		List<Integer> integerList = null;

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_exception_nullOnlyList() throws Exception {
		// Arrange
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);

		exception.expect(Exception.class);
		exception.expectMessage("Invalid Input. Minimum 2 integer numbers require");
		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);
	}

	@Test
	public void findSecondLowestInteger_exception_singleNumberList() throws Exception {
		// Arrange
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.MAX_VALUE);

		exception.expect(Exception.class);
		exception.expectMessage("Invalid Input. Minimum 2 integer numbers require");
		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);
	}

	@Test
	public void findSecondLowestInteger_integer_allDuplicatesList() throws Exception {
		// Arrange
		Integer expected = 16;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(16);
		integerList.add(16);
		integerList.add(16);
		integerList.add(16);

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_integer_allDuplicatesNullList() throws Exception {
		// Arrange
		Integer expected = null;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);
		integerList.add(null);

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_integer_nullIntegerList() throws Exception {
		// Arrange
		Integer expected = 1;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
		integerList.add(-1);
		integerList.add(10);
		integerList.add(1);

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_integer_maxMinList() throws Exception {
		// Arrange
		Integer expected = -16;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(16);
		integerList.add(Integer.MAX_VALUE);
		integerList.add(Integer.MIN_VALUE);
		integerList.add(-16);

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void findSecondLowestInteger_integer_anyIntegerList() throws Exception {
		// Arrange
		Integer expected = 1;
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(-1);
		integerList.add(-1);
		integerList.add(10);
		integerList.add(1);

		// Act
		Integer actual = sut.findSecondLowestInteger(integerList);

		// Assert
		assertEquals(expected, actual);
	}
}
