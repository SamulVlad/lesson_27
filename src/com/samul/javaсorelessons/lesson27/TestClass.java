package com.samul.javaсorelessons.lesson27;

import java.util.Comparator;
import java.util.Objects;

class TestClass {
	int a;
	int b;
	
	static Comparator<TestClass> comp = new Comparator<TestClass>() {

		@Override
		public int compare(TestClass o1, TestClass o2) {
			if ((o1.a == o2.a) && (o1.b == o2.b)) {
				return 0;
			}
			if ((o1.a > o2.a) && (o1.b > o2.b)) {
				return o1.a - o2.a;
			}
			if ((o1.a < o2.a) && (o1.b < o2.b)) {
				return o1.a - o2.a;
			}
			
			return Integer.MAX_VALUE;
		}

		
	};
	
	public int compareTo(TestClass obj) {
		return comp.compare(this, obj);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass other = (TestClass) obj;
		return a == other.a && b == other.b;
	}
	
	
	

}
