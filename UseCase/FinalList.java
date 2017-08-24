package com.rcm.req.crit;

import java.util.ArrayList;
import java.util.List;

public class FinalList {

	public static void test(final List<Integer> list){
		list.add(89126);
		list.add(132);
		System.out.println(list);
	}
	public static void main(String[] args) {
		 List<Integer> list=new ArrayList<>();
		 list.add(1);
		 list.add(3746);
		 test(list);
	}
}
