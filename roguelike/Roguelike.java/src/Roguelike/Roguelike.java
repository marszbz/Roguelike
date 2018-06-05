package Roguelike;

import java.util.Scanner;

public class Roguelike {
	public static void main(String[] args){
		String key="s";
		System.out.println(key);
		int[][] a={
				 // y    0 1 2 3 4 5 6 7 8 9
						{51,51,51,51,51,51,51,51,51,51}, //0
						{51,50,00,00,00,00,00,00,00,51}, //1
						{51,00,00,00,00,00,00,00,00,51}, //2
						{51,00,00,00,01,00,00,00,00,51}, //3
						{51,00,00,00,00,00,00,00,00,51}, //4
						{51,00,00,00,00,00,00,00,00,51}, //5
						{51,00,00,00,00,00,00,00,00,51}, //6
						{51,00,00,00,00,00,00,00,00,51}, //7
						{51,00,00,00,00,00,00,00,00,51}, //8
						{51,51,51,51,51,51,51,51,51,51}, //9
				};
		Weapon myWeapon=new Weapon(99, "alex", 7);
		Hero myHero=new Hero(51, "DoubleJian", 0, 5, 1, 1, 20,
				50, 0, true,myWeapon);
		Monest[] myMonest=new Monest[10];
		myMonest[1]=new Monest(1, "fjj", 0, 3, 0, 0, 0, 20, 0, true);
		Map myMap=new Map(a,myHero,myMonest);
		myMap.printMyMap();
		Scanner reader =new Scanner(System.in);
		key=reader.nextLine();

		while(key.equals("w")||key.equals("s")||key.equals("d")||key.equals("a")){
			myMap.move(key);
			key=reader.nextLine();
		}
		reader.close();
	}
	
}
