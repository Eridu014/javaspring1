package com.udemyspring.javaspring1;


import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class BubbleSort implements SortAlgo {
    public int[] sort(int[] numbers) {
        //logic for bubble sort
        return numbers;
    }
}
