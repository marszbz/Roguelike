package Roguelike.equipment;

import java.util.Random;

public class Knife extends Weapon{
	private int ID;	
	private String name;
	private int aggressivity;            //武器伤害
	private int strengthenLevel;         //武器强化等级	
	private char correctionLevel;        /*补正等级 武器可以通过人物属性
											高低来增加伤害 等级越高增加越多*/
	private String correctionAttribute;  /*补正属性 只有人物属性和     
										    武器属才  性相同能增加伤害*/
	private String information;          //物品描述
	private boolean stateOfEquipment;
	
	
	public Knife(int ID,String name,int aggressivity,int strengthenLevel,
			char correctionLevel,String correctionAttribute,String information
			,boolean stateOfEquipment){

		  this.ID=ID;
		  this.name=name;
		  this.aggressivity=aggressivity;
		  this.strengthenLevel=strengthenLevel;
		  this.correctionLevel=correctionLevel;
		  this.correctionAttribute=correctionAttribute;
		  this.information=information;
		  this.stateOfEquipment=stateOfEquipment;
		}
	public void init(int randomValue,int baseValue){
		Random a=new Random(); //武器会根据一个随机和基础值     得出伤害
		this.aggressivity=a.nextInt(randomValue)+baseValue;
	}
	 
	
	@Override
	int getAggressivity() {
		return this.aggressivity;
	}

	@Override
	void setAggressivity(int Aggressivity) {
		this.aggressivity=Aggressivity;			
	}


	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		this.ID=ID;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String getInformation() {
		// TODO Auto-generated method stub
		return this.information;
	}
	@Override
	public void setInformation(String information) {
		// TODO Auto-generated method stub
		this.information=information;
	}
	@Override
	public char getCorrectionLevel() {
		// TODO Auto-generated method stub
		return this.correctionLevel;
	}
	
	@Override
	public void setCorrectionLevel(char CorrectionLevel) {
		// TODO Auto-generated method stub
		
	}
	public int getStrengthenLevel() {
		return strengthenLevel;
	}
	public void setStrengthenLevel(int strengthenLevel) {
		this.strengthenLevel = strengthenLevel;
	}
	public String getCorrectionAttribute() {
		return correctionAttribute;
	}
	public void setCorrectionAttribute(String correctionAttribute) {
		this.correctionAttribute = correctionAttribute;
	}
	public boolean isStateOfEquipment() {
		return stateOfEquipment;
	}
	public void setStateOfEquipment(boolean stateOfEquipment) {
		this.stateOfEquipment = stateOfEquipment;
	}
}
