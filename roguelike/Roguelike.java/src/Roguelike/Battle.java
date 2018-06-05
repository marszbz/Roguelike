package Roguelike;
/*作者 Mars
 *2018.6.4 
 * */
public class Battle {
	private Hero myHero;
	private Monest myMonest;
	public Battle(Hero myHero,Monest myMonest) {
		// TODO Auto-generated constructor stub
		this.myHero=myHero;
		this.myMonest=myMonest;
	}

	public void run(){
		int i;
		for(i=0;;i++)  
        {
			i+=1;  
			System.out.println("\n第"+i+"回合战斗开始");  
			myHero.fight(myMonest);
			if(myMonest.getHP()<=0){
				myMonest.setAlive(false);
				break;  
			}
			myMonest.fight(myHero);
			if(myHero.getHP()<=0){
				myHero.setAlive(false);
				break;
			}
			System.out.println("第"+i+"回合战斗结束");  
			System.out.println("战斗统计");  
			myHero.show();  
			myMonest.show();  
			i-=1;  
			
			
        }
        if(myHero.getAlive()==false){
        	System.out.println("\n你已经死亡");  
        	System.out.println("\n战胜方是"+myMonest.getName());  
            System.out.println("\n战争统计");  
            i+=1;  
            System.out.println(myHero.getName()+"与"+ myMonest.getName()+
            		"战斗"+i+"次"); 
        }
        if(myMonest.getAlive()==false){
        	
        	System.out.println("\n战胜方是"+myHero.getName());  
            System.out.println("\n战争统计");  
            i+=1;  
            System.out.println(myHero.getName()+"与"+ myMonest.getName()+"战斗"+
            i+"次"); 
        }
	}
}
