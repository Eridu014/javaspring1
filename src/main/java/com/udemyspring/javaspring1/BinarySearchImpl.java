package com.udemyspring.javaspring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgo sortAlgo;
    //cosntructor
    //public BinarySearch(SortAlgo sortAlgo) {
    //    super();
    //    this.sortAlgo =  sortAlgo;
    //}

    //Alternatively, just generate a setter
    public void setSortAlgo(SortAlgo sortAlgo) {
        this.sortAlgo = sortAlgo;
    }

    //Using simply @Autowired is the same as a Setter Injection
    //So, either use @Autowired or a Constructor
    
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
