package com.valtech.training.corejava.day5;

import java.util.List;

public class CachedFactorial {
	List<Long> cache;

	public long factorial(int n) {
		if (cache.size() >= (n)) {
			System.out.println("returning from cache");
			return cache.get(n - 1);
		}
		if (n == 1) {
			cache.add(1L);
			return 1;

		}
		long fact = factorial(n - 1);
		long factn = n * fact;
		cache.add(fact);
		return factn;
	}
}