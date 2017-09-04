package com.ritesh.ds;

import java.util.List;

/**
 * Class to find lowest and second lowest integer numbers
 * 
 * @author Ritesh Vaja
 * */
public class CalculateInteger implements CalculateNumber {

	/**
	 * Find the lowest integer number from list of integer numbers
	 * 
	 * @param List of Integer numbers
	 * @return Integer number | null
	 * @throws Exceptions if the data stored in the List is not an Integer value or null object.
	 * @author Ritesh Vaja
	 * */
	@Override
	public Integer findLowestInteger(List<Integer> integerList) throws Exception {
		Integer lowest;

		// Empty/null list check
		if (integerList == null || integerList.isEmpty()) {
			return null;
		}

		lowest = integerList.get(0);
		for (Integer number : integerList) {
			// NPE check
			if (number != null) {
				// If input list first element is null
				if (lowest == null) {
					lowest = number;
				}
				// If number is smaller than lowest then update lowest
				if (number < lowest) {
					lowest = number;
				}
			}
		}
		return lowest;
	}

	/**
	 * Find the second lowest integer number from list of integer numbers
	 * 
	 * @param List of Integer numbers
	 * @return Integer number | null
	 * @throws Exceptions if the data stored in the List is not an Integer value or null object. Also minimum List size
	 *         2 requires
	 * @author Ritesh Vaja
	 * */
	@Override
	public Integer findSecondLowestInteger(List<Integer> integerList) throws Exception {
		Integer lowest, secondLowest;

		// Empty/null list check
		if (integerList == null || integerList.isEmpty()) {
			return null;
		}
		// There should be at least two numbers in input list to find second lowest value
		if (integerList.size() < 2) {
			throw new Exception("Invalid Input. Minimum 2 integer numbers require");
		}

		lowest = secondLowest = integerList.get(0);
		for (Integer number : integerList) {
			// NPE check
			if (number != null) {
				// If input list first element is null
				if (lowest == null) {
					lowest = number;
				}
				// If number is smaller than lowest then update both lowest and secondLowest
				else if (number < lowest) {
					secondLowest = lowest;
					lowest = number;
				}
				// If input list first element is null
				else if (secondLowest == null || number != lowest) {
					secondLowest = number;
				}
			}
		}
		return secondLowest;
	}
}
