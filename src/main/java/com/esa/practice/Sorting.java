package com.esa.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.multithread.ExponentialProblem;

public class Sorting extends ExponentialProblem {

	Sorting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<File> validFilesList = new ArrayList<File>();
		validFilesList.add(new File("/opt/esa/conf/pmCounters/vg1_pmcounter.xml"));
		validFilesList.add(new File("/opt/esa/conf/pmCounters/vg1_pmcounter-revB.xml"));
//		Collections.sort(validFilesList);
		System.out.println(validFilesList);
	}

}
