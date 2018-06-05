package Roguelike;
/*作者 Mars
 *2018.6.4 
 * */
import java.util.Scanner;

import Roguelike.equipment.Equipment;

class Hero extends Creature{
	private int ID;
	private String name;
	private int posX;			//x轴
	private int posY;			//y轴
	private int leve;			//等级
	private int attack;			//攻击力
	private int HP;				//血量
	private int MP;				//魔法
	private int gold;
	private int maxExp;     	//
	private int exp;
	private Equipment myWeapon;
	private Equipment myShiled;
	private Boolean alive;
	public Hero(int ID,String name,int leve,int attack,int posX,
			int posY,int MP,int HP,int gold,Equipment myWeapon,
			Equipment myShiled,boolean alive) {
		// TODO Auto-generated constructor stub
		this.ID=ID;
		this.name=name;
		this.leve=leve;
		this.attack=attack;
		this.posX=posX;
		this.posY=posY;
		this.MP=MP;
		this.HP=HP;
		this.gold=gold;
		this.alive=alive;
		this.myWeapon=myWeapon;
		this.myShiled=myShiled;
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

	public void setMyShiled(Equipment myShiled) {
		this.myShiled = myShiled;
	}


	public void injure(int damage){
		HP=HP-damage;
	}
	public void fight(Monest myMonest){
		Scanner reader=new Scanner(System.in);
		
		System.out.println("1.赤手空拳");
		System.out.println("2.使用"+myWeapon.getName());
		int choice=reader.nextInt();
		switch (choice) {
		case 1:
			myMonest.injure(attack);
			System.out.println(name+"赤手空拳对"+myMonest.getName()
			+"造成"+attack+"点伤害");
			break;
		case 2:
			myMonest.injure( myWeapon).use());
			System.out.println(name+"使用"+myWeapon.getName()+"对"
			+myMonest.getName()+"造成"+myWeapon.use()+"点伤害");
			break;

		default :
			System.out.println("miss");
			break;
		}
		
	}
	
	public void show(){
		System.out.println(name+"还剩血量"+HP);
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
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}
	@Override
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

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
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
	public void setMyWeapon(Equipment myWeapon) {
		this.myWeapon = myWeapon;
	}
	public Boolean getAlive() {
		return alive;
	}
	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	

}
