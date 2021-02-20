package com.Innerclasses;
interface My1
{
	void show();
}
class Outer_
{
	public void display()
	{
		new My1()
		{
			public void show()
			{
				System.out.println("Hello");
			}
		}.show();
	}
}
public class Static_inner_class {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();

	}

}
