package org.system;

public class Desktop extends Computer
{
	public void desktopSize() 
	{
		System.out.println("Desktop size is 25 inch");
	}
	public static void main(String[] args) 
	{
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}

}
