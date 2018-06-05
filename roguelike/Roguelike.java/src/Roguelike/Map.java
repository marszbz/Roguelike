package Roguelike;
/*���� Mars
 *2018.6.4 
 */
class Map {
	// ��ʼ
	private int myPos=50;
	private int wall=51;
	private int x = 1;
	private int y = 1;
	private Hero myHero;
	private int[][] a;
	private Monest[] myMonest;
	public Map(int [][] a,Hero myHero,Monest myMonest[]){
		this.a=a;
		this.a[x][y]=50;//��ʼλ��
		this.myHero=myHero;
		this.myMonest=myMonest;
	}
	public int[][] getA(){
		return this.a;
	}
	public void move(String key){
		 // �ж�һ��,�������ƶ�
        switch (key) {
        case "w":
           //�ж��Ƿ�Ϊ���� �ǹ־�battle
        	if(a[x - 1][y] >=1&&a[x - 1][y] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x - 1][y]]);
        		myBattle.run();
        	}
        	 // �ж��ƶ�λ���Ƿ�Ϊǽ
            if (a[x - 1][y] != wall) {
                // ��ԭ����Ϊ0
                a[x][y] = 0;
                // �����ƶ� �޸����� - 1
                x--;
                // ��λ�ñ��myPos��ֵ
                a[x][y] = myPos;
                
            }
            break;
        case "a":
        	//�ж��Ƿ�Ϊ���� �ǹ־�battle
        	if(a[x][y-1] >=1&&a[x][y-1] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x][y-1]]);
        		myBattle.run();
        	}
            // �ж��ƶ�λ���Ƿ�Ϊǽ
            if (a[x][y - 1] != wall) {
                // ��ԭ����Ϊ0
                a[x][y] = 0;
                // �����ƶ� �޸����� - 1
                y--;
                // ��λ�ñ��myPos��ֵ
                a[x][y] = myPos;
            }       
            break;
        case "s":
        	//�ж��Ƿ�Ϊ���� �ǹ־�battle
        	if(a[x + 1][y] >=1&&a[x + 1][y] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x + 1][y]]);
        		myBattle.run();
        	}
            // �ж��ƶ�λ���Ƿ�Ϊǽ
            if (a[x + 1][y] != wall) {
                // ��ԭ����Ϊ0
                a[x][y] = 0;
                // �����ƶ� �޸����� + 1
                x++;
                // ��λ�ñ��myPos��ֵ
                a[x][y] = myPos;
            }
            break;
        case "d":
        	//�ж��Ƿ�Ϊ���� �ǹ־�battle
        	if(a[x][y+1] >=1&&a[x][y+1] <=7){
        		Battle myBattle=new Battle(myHero, myMonest[a[x][y+1]]);
        		myBattle.run();
        	}
            // �ж��ƶ�λ���Ƿ�Ϊǽ
            if (a[x][y + 1] != wall) {
                // ��ԭ����Ϊ0
                a[x][y] = 0;
                // �����ƶ� �޸����� + 1
                y++;
                // ��λ�ñ��myPos��ֵ
                a[x][y] = myPos;
            }
            break;
        default:
            break;
        }
        // �޸ĺ��ٴ�ӡһ���ͼ
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
