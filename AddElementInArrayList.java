package com;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class AddElementInArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l1= new ArrayList();
        l1.add(0,"Yug");// Element at 1st index
        l1.add("Rahul");
        l1.add("Shyam");
        System.out.println("Index of 1st elmenet"+
        l1.indexOf("Yug"));
        
        //Traversing
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}


