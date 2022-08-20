package com.udemyspring.javaspring1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Javaspring1Application {

	//Waht are the beans?
	//What are the dependencies of the beans?
	//Where to search for the beans? => No need, they are all together here in the package

	public static void main(String[] args) {

		//BinarySearch binarySearch = new BinarySearch(new QuickSort());

		//Application Context -> maintains all the beans
		//SpringApplication.run(Javaspring1Application.class, args);

		ApplicationContext applicationContext = SpringApplication.run(Javaspring1Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);


		


	}

}
