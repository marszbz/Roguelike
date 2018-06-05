package Roguelike;

public class HPBootle extends bottle{

	private int ID;
	private String name;
	private int type;
	private int value;
	public HPBootle(int ID,int type,int value){
		this.ID=ID;
		this.type=type;
		this.name="Ѫƿ";
		this.value=value;
	}
	@Override
	
	public int use() {
		// TODO Auto-generated method stub
		return value;//????
		
	}

	@Override
	public void setType(int type) {
		// TODO Auto-generated method stub
		this.type=type;
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return type;
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

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		this.value=value;
	}
	
}
