package com.testing.collection;

import java.util.Arrays;

public class PracticeCollection {

	int[] bag = { 200, 5, 9, 6, 100 };

	void getArrayValue() {
		int mybag = bag[0];
		for (int i = 0; i < bag.length; i++) {
			if (bag[i] < mybag) {
				mybag = bag[i];
			}

		}

		System.out.println(mybag);

	}

	public static void main(String[] args) {
		PracticeCollection obagj = new PracticeCollection();
		obagj.getArrayValue();

	}

}
