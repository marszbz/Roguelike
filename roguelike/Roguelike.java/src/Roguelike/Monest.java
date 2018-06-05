package Roguelike;
/*作者 Mars
 *2018.6.4 
 * */
import java.nio.channels.ShutdownChannelGroupException;

public class Monest extends Creature{
	private int ID;
	private String name;
	private int leve;//等级
	private int attack;//攻击力
	private int posX;//x轴
	private int posY;//y轴
	private int MP;
	private int HP;//血量
	private int gold;
	private boolean alive;
	public Monest(int ID,String name,int leve,int attack,int posX,
			int posY,int MP,int HP,int gold,boolean alive) {
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
	}
	public void injure(int damage){
		HP=HP-damage;
	}
	public void show(){
		System.out.println(name+"还剩血量"+HP);
	}
	public void fight(Hero myHero){
		myHero.injure(attack);
		System.out.println(name+"对"+myHero.getName()+"造成"+attack+"点伤害");
	}
	
	
	
	@Override
	public void setLeve(int leve) {
		// TODO Auto-generated method stub
		this.leve=leve;
	}

	@Override
	public int getLeve() {
		// TODO Auto-generated method stub
		return this.leve;
	}

	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack=attack;
	}

	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return this.attack;
	}

	@Override
	public void setMP(int MP) {
		// TODO Auto-generated method stub
		this.MP=MP;
	}

	@Override
	public int getMP() {
		// TODO Auto-generated method stub
		return this.MP;
	}

	@Override
	public void setHP(int HP) {
		// TODO Auto-generated method stub
		this.HP=HP;
	}

	@Override
	public int getHP() {
		// TODO Auto-generated method stub
		return this.HP;
	}

	@Override
	public void setPosX(int poX) {
		// TODO Auto-generated method stub
		this.posX=poX;
	}

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return this.posX;
	}

	@Override
	public void setPosY(int poY) {
		// TODO Auto-generated method stub
		this.posY=poY;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return this.posY;
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
	public boolean getAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
