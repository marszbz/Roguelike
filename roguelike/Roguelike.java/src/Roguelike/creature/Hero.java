package Roguelike.creature;
/*���� Mars
 *2018.6.4 
 * */
import java.util.Scanner;

import Roguelike.equipment.Equipment;
import Roguelike.equipment.Weapon;

public class Hero extends Creature{
	private int ID;
	private String name;
	private int posX;			//x��
	private int posY;			//y��
	private int leve;			//�ȼ�
	private int attack;			//������
	private int defend;         //������
	private int HP;				//Ѫ��
	private int MP;				//ħ��
	private int speed;          //�ٶ�
	private int lucky;          //����ֵ
	private int gold;
	private int maxExp;     	// exp /maxExp  ��100/1000
	private int exp;			//exp Ϊ���ھ��� maxExpΪ������Ҫ����
	private Weapon myWeapon;
	private Weapon myShiled;
	private Boolean alive;       //�Ƿ����
	private int str;             //����
	private int agl;             //����
	private int tal;             //����
	private int luc;             //����
	private int point;          //��������;
	public Hero(int ID,String name,int leve,int attack,int defend,int posX,
			int posY,int MP,int HP,int gold,int speed,int lucky,Weapon myWeapon,
			Weapon myShiled,boolean alive,int str,int agl,int tal,int luc,int point) {
		// TODO Auto-generated constructor stub
		this.ID=ID;
		this.name=name;
		this.leve=leve;
		this.attack=attack;
		this.defend=defend;
		this.posX=posX;
		this.posY=posY;
		this.MP=MP;
		this.HP=HP;
		this.gold=gold;
		this.alive=alive;
		this.myWeapon=myWeapon;
		this.myShiled=myShiled;
		this.str=str;
		this.agl=agl;
		this.tal=tal;
		this.luc=luc;
		this.point=point;
		this.lucky=lucky;
		this.speed=speed;
	}
	public int Levelup() {
		if(this.maxExp>=this.exp) {
			this.leve++;
			this.point+=5;
			this.exp-=this.maxExp;
			this.maxExp+=250;
			return 1;
		}
		return 0;
	}
	public void UsePoint(int number) {
		if(number==1) {
			this.str++;
			this.HP+=50;
		}
		else if(number==2) {
			this.agl++;
			this.speed++;
		}
		else if(number==3) {
			this.tal++;
			this.MP+=50;
		}
		else if(number==4) {
			this.luc++;
			this.lucky++;
		}
		else
			System.out.println("Error");
		this.point--;
	}
	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Equipment getMyShiled() {
		return myShiled;
	}

	public void setMyShiled(Weapon myShiled) {
		this.myShiled = myShiled;
	}


	public void injure(int damage){
		HP=HP-damage;
	}
	public void fight(Monest myMonest){
		Scanner reader=new Scanner(System.in);
		
		System.out.println("1.���ֿ�ȭ");
		System.out.println("2.ʹ��"+myWeapon.getName());
		int choice=reader.nextInt();
		switch (choice) {
		case 1:
			myMonest.injure(attack);
			System.out.println(name+"���ֿ�ȭ��"+myMonest.getName()
			+"���"+attack+"���˺�");
			break;
		case 2:
			myMonest.injure(myWeapon.getAggressivity());
			System.out.println(name+"ʹ��"+myWeapon.getName()+"��"
			+myMonest.getName()+"���"+myWeapon.getAggressivity()+"���˺�");
			break;

		default :
			System.out.println("miss");
			break;
		}
		if(myMonest.getAlive()==false){
			System.out.println("you win");
        }
	}
	
	public void show(){
		System.out.println(name+"��ʣѪ��"+HP);
	}
	
	public String toString() {
		String show;
		show=Integer.toString(ID)+name+Integer.toString(posX)+Integer.toString(posY)+
				Integer.toString(leve)+Integer.toString(attack)+Integer.toString(defend)+
				Integer.toString(HP)+Integer.toString(MP)+Integer.toString(speed)+
				Integer.toString(lucky)+Integer.toString(gold)+Integer.toString(maxExp)+
				Integer.toString(exp)+Integer.toString(str)+Integer.toString(agl)+
				Integer.toString(tal)+Integer.toString(luc)+Integer.toString(point);
		return show;
	}
	
	
	@Override
	public void setLeve(int leve) {
		// TODO Auto-generated method stub
		this.leve=leve;
	}

	@Override
	public int getLeve() {
		// TODO Auto-generated method stub
		return leve;
	}

	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack=attack;
	}

	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}

	@Override
	public void setMP(int MP) {
		// TODO Auto-generated method stub
		this.MP=MP;
	}

	@Override
	public int getMP() {
		// TODO Auto-generated method stub
		return MP;
	}

	@Override
	public void setHP(int HP) {
		// TODO Auto-generated method stub
		this.HP=HP;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return HP;
	}
	
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}
	public void setID(int ID) {
		// TODO Auto-generated method stub
		this.ID=ID;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	public Equipment getMyWeapon() {
		return myWeapon;
	}
	public void setMyWeapon(Weapon myWeapon) {
		this.myWeapon = myWeapon;
	}
	public Boolean getAlive() {
		return alive;
	}
	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public int getDefend() {
		return defend;
	}

	public void setDefend(int defend) {
		this.defend = defend;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getAgl() {
		return agl;
	}

	public void setAgl(int agl) {
		this.agl = agl;
	}

	public int getTal() {
		return tal;
	}

	public void setTal(int tal) {
		this.tal = tal;
	}

	public int getLuc() {
		return luc;
	}

	public void setLuc(int luc) {
		this.luc = luc;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}
	public int getLucky() {
		return lucky;
	}


	public void setLucky(int lucky) {
		this.lucky= lucky;
	}
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
