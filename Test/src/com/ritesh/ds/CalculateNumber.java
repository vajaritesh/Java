package com.ritesh.ds;

import java.util.List;

/**
 * Interface with find lowest and second lowest integer numbers methods
 * 
 * @author Ritesh Vaja
 * */
public interface CalculateNumber {

	public Integer findLowestInteger(List<Integer> inputList) throws Exception;

	public Integer findSecondLowestInteger(List<Integer> inputList) throws Exception;
}
