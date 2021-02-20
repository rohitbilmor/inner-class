package com.Innerclasses;
class Outerclass
{
	public int x=10;
	class Innerclass
	{
		public int y=20;
		void innerDisplay()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
void outerDisplay()
{
	Innerclass ic=new Innerclass();
	ic.innerDisplay();
	System.out.println(ic.y);
}
}
public class Nested_inner_class {

	public static void main(String[] args) {
		Outerclass o=new Outerclass();
		o.outerDisplay();
		Outerclass.Innerclass oc=new Outerclass().new Innerclass();
		oc.innerDisplay();
	}

}
