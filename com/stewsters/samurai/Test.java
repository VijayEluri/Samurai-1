package com.stewsters.samurai;

import java.text.ParseException;

import com.stewsters.samurai.Units.Samurai;
import com.stewsters.samurai.enums.Gender;
import com.stewsters.samurai.enums.SocialClass;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		World.init();
		
		
		Samurai musashi = new Samurai();
		Samurai tokugawa = new Samurai();
		
		musashi.print();
		tokugawa.print();
		
		musashi.attack(tokugawa);
		tokugawa.attack(musashi);
		
		musashi.print();
		tokugawa.print();
		
		for(int i =0; i < 100; i++)
		{
			System.out.println(NameGenerator.getName(SocialClass.SAMURAI, Gender.MALE));
		}
//		NameGenerator.printString();
		
	}

}
