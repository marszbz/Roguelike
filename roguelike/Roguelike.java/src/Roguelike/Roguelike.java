package Roguelike;
import Roguelike.creature.*;
import Roguelike.equipment.*;
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
		Knife myWeapon=new Knife(100, "�����̵�", 10,1, 'B', "����", "��", false);
		/*
		 * hero��ID����������ǰ�ȼ�������������������Xλ�ã�Yλ�ã�
		 *ħ��ֵ������ֵ����ǰ��������ٶȣ�����ֵ�������࣬���࣬
		 *�Ƿ���ţ�����ֵ������ֵ������ֵ�����˵㣬������������
		 */
		Hero myHero=new Hero(50, "DoubleJian", 1, 5, 1, 0, 0,
				10,50,0,20,0,myWeapon,null,
				true,10,10,10,10,0);
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
