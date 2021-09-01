package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 1;
	boolean found = false;

	while (!found)
    {
        int value = n * n * n - 1000* n*n;
        if (value > 1000000)
            found = true;
        else
            n++;
    }
        System.out.println(n);
    }
}
