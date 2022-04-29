package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> colors = new ArrayList<>();
	colors.add("Red");
	colors.add("Green");
	colors.add("Black");
	colors.ensureCapacity(6);
	colors.add("White");
	colors.add("Pink");
		Collections.reverse(colors);
		System.out.println(colors);
		Collections.shuffle(colors);
		System.out.println(colors);
    }
}
