package com.test.staging;

public class TestTwo {

	static TestOne to;

	public final String a;
	int ab;
	float b;
	double c;
	char t;
	boolean g;

	public TestTwo() {
		this.a = "abxc";
	}

	@Override
	public String toString() {
		return ab + "_" + b + "_" + c + "_" + t + "_" + g;
	}


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ab;
		result = prime * result + Float.floatToIntBits(b);
		long temp;
		temp = Double.doubleToLongBits(c);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (g ? 1231 : 1237);
		result = prime * result + t;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestTwo other = (TestTwo) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (ab != other.ab)
			return false;
		if (Float.floatToIntBits(b) != Float.floatToIntBits(other.b))
			return false;
		if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
			return false;
		if (g != other.g)
			return false;
		if (t != other.t)
			return false;
		return true;
	}

	public static void main(String[] args) {
		TestTwo t = new TestTwo();
		System.out.println(t);
		try {
			System.exit(1);
			throw new NullPointerException();
		} catch (Exception e) {
			throw new NullPointerException();
		}finally{
			System.out.println("finally");
		}
		
	}
}
