package Roguelike;
/*作者 Mars
 *2018.6.4 
 */
class Map {
	// 起始
	private int myPos=50;
	private int wall=51;
	private int x = 1;
	private int y = 1;
	private Hero myHero;
	private int[][] a;
	private Monest[] myMonest;
	public Map(int [][] a,Hero myHero,Monest myMonest[]){
		this.a=a;
		this.a[x][y]=50;//起始位置
		this.myHero=myHero;
		this.myMonest=myMonest;
	}
	public int[][] getA(){
		return this.a;
	}
	public void move(String key){
		 // 判断一下,往哪里移动
        switch (key) {
        case "w":
           //判断是否为怪物 是怪就battle
        	if(a[x - 1][y] >=1&&a[x - 1][y] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x - 1][y]]);
        		myBattle.run();
        	}
        	 // 判断移动位置是否为墙
            if (a[x - 1][y] != wall) {
                // 把原来改为0
                a[x][y] = 0;
                // 向上移动 修改坐标 - 1
                x--;
                // 新位置变成myPos的值
                a[x][y] = myPos;
                
            }
            break;
        case "a":
        	//判断是否为怪物 是怪就battle
        	if(a[x][y-1] >=1&&a[x][y-1] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x][y-1]]);
        		myBattle.run();
        	}
            // 判断移动位置是否为墙
            if (a[x][y - 1] != wall) {
                // 把原来改为0
                a[x][y] = 0;
                // 向左移动 修改坐标 - 1
                y--;
                // 新位置变成myPos的值
                a[x][y] = myPos;
            }       
            break;
        case "s":
        	//判断是否为怪物 是怪就battle
        	if(a[x + 1][y] >=1&&a[x + 1][y] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x + 1][y]]);
        		myBattle.run();
        	}
            // 判断移动位置是否为墙
            if (a[x + 1][y] != wall) {
                // 把原来改为0
                a[x][y] = 0;
                // 向下移动 修改坐标 + 1
                x++;
                // 新位置变成myPos的值
                a[x][y] = myPos;
            }
            break;
        case "d":
        	//判断是否为怪物 是怪就battle
        	if(a[x][y+1] >=1&&a[x][y+1] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x][y+1]]);
        		myBattle.run();
        	}
            // 判断移动位置是否为墙
            if (a[x][y + 1] != wall) {
                // 把原来改为0
                a[x][y] = 0;
                // 向右移动 修改坐标 + 1
                y++;
                // 新位置变成myPos的值
                a[x][y] = myPos;
            }
            break;
        default:
            break;
        }
        // 修改后再打印一遍地图
        printMyMap();
    }
	public void printMyMap(){
		for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            System.out.print(a[i][j]);
	        }
	        System.out.println();
	    }
	}
	
}
