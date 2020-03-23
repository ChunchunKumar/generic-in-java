package com.psl.service;

import com.psl.model.Square;

public class SquareAreaCalculatorServiceImpl implements AreaCalculatorService<Square<Integer>, Integer> {

	@Override
	public Integer area(Square<Integer> t) {
		return t.getLength()*t.getLength();
	}

}
