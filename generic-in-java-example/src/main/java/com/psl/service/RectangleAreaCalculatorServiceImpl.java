package com.psl.service;

import com.psl.model.Rectangle;

public class RectangleAreaCalculatorServiceImpl implements AreaCalculatorService<Rectangle<Integer>, Integer> {
	
	@Override
	public Integer area(Rectangle<Integer> t) {	
		return t.getLength()*t.getWidth();
	}


}
