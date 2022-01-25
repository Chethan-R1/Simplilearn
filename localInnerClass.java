package com.simpli.first;

public class localInnerClass {
	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("autheticate user");
				}
			}
			Inner inner = new Inner();
			inner.test();
		}
		else
		{
			System.out.println("Not aut");
		}
	}
	public static void main(String[] args) {
		localInnerClass local = new localInnerClass();
		local.validate(5);
	}

}
