package Roguelike.equipment;

public abstract class Equipment extends Object {
	public abstract int  getStrengthenLevel();
	public abstract void setStrengthenLevel(int strengthenLevel);
	public abstract String getCorrectionAttribute();
	public abstract void setCorrectionAttribute(String correctionAttribute);
	public abstract char getCorrectionLevel();
	public abstract void  setCorrectionLevel(char CorrectionLevel);
	public abstract String getInformation();
	public abstract void setInformation(String information);
	public abstract void setID(int ID);
	public abstract int getID();
	public abstract String getName();
	public abstract void setName(String name);
	public abstract boolean isStateOfEquipment();
	public abstract void setStateOfEquipment(boolean StateOfEquipment);
}
