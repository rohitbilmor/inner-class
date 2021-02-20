package com.Innerclasses;
class Outer
{
	void display()
	{
		class Inner
		{
			void innerDisplay()
			{
				System.out.println("Hello");
			}
		}
		Inner i=new Inner();
		i.innerDisplay();
	}
}
public class Local_inner_class {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();
	}

}
