package com.udemyspring.javaspring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private SortAlgo sortAlgo;
    //cosntructor
    public BinarySearch(SortAlgo sortAlgo) {
        super();
        this.sortAlgo =  sortAlgo;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //implementing sorting logic
        //bubble algorithm
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedNumbers = sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        //quick sort algorithm
        //search the array
        return 3;
    }
   

}
