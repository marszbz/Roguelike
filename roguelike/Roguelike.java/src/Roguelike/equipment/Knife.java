package Roguelike.equipment;

import java.util.Random;

public class Knife extends Weapon{
	private int ID;	
	private String name;
	private int aggressivity;            //�����˺�
	private int strengthenLevel;         //����ǿ���ȼ�	
	private char correctionLevel;        /*�����ȼ� ��������ͨ����������
											�ߵ��������˺� �ȼ�Խ������Խ��*/
	private String correctionAttribute;  /*�������� ֻ���������Ժ�     
										    ��������  ����ͬ�������˺�*/
	private String information;          //��Ʒ����
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
		Random a=new Random(); //���������һ������ͻ���ֵ     �ó��˺�
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
