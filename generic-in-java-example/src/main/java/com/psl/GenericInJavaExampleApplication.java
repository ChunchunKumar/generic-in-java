package com.psl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.psl.model.Rectangle;
import com.psl.model.Square;
import com.psl.service.AreaCalculatorService;
import com.psl.service.RectangleAreaCalculatorServiceImpl;
import com.psl.service.SquareAreaCalculatorServiceImpl;

@SuppressWarnings("rawtypes")
@SpringBootApplication
public class GenericInJavaExampleApplication {
	
	public static <T> void printfun(T t) {
		System.out.println(t.toString());
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SpringApplication.run(GenericInJavaExampleApplication.class, args);
		Rectangle<Integer> rectangle = new Rectangle<Integer>(1, 2);
		Square<Integer> square = new Square<Integer>(4);
		AreaCalculatorService areaCalculatorService = new RectangleAreaCalculatorServiceImpl();
		System.out.println(areaCalculatorService.area(rectangle));
		areaCalculatorService = new SquareAreaCalculatorServiceImpl();
		System.out.println(areaCalculatorService.area(square));
		printfun(square);
		printfun(rectangle);

	}

}
