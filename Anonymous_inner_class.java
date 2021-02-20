package com.Innerclasses;
abstract class My
{
	abstract public void show();
}
class Outer4
{
	public void display()
	{
		new My()
				{
			public void show()
			{
				System.out.println("hello");
				//m.show();
			}
				}.show();
	}
}
public class Anonymous_inner_class {

	public static void main(String[] args) {
		Outer4 o =new Outer4();
		o.display();

	}

}
