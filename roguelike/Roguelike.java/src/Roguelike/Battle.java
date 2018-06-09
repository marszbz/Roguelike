package Roguelike;
import Roguelike.creature.Monest;
import Roguelike.creature.Hero;
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
       
        
	}
}
