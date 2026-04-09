public class knight {
	static int [][] board = new int[8][8];
	
	private int x , y ;
	private int color;
	
	
/*============This is Week_5 Add===============*/
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	
/*============This is Week_4 Add===============*/	
	
	public knight() {
		x=2;
		y=1;
		color=1;
	}
	
	public knight(int color) {
		this.color=color;
		x=2;
		y=1;
	}
	
	public knight (int color , int x , int y ) {
		this.color=color;
		this.x=x;
		this.y=y;
	}
	
/*=============================================*/
	
	
/*============This is Week_5 Add===============*/
/*	
	public boolean checker(int a , int b){
		if (board[a][b]==1) {
			return true;
			}
			return false;
	}	
*/
	
	
	public void fill (int x , int y) {
		knight.board[x][y]=color;
		
	}

/*============This is Week_5 Add===============*/
/*
	public void returner(int a ,int b) {
		knight.board[a][b]=0;
	}
*/
	
	public void setposition(int a , int b) {
		x=a;
		y=b;
		
	}
	public void showposition() {
		System.out.printf("knight in (%d,%d).\n", x , y );
	}
	public static void printGrid() {
		
	    System.out.println("Board:");

	    for(int i = 0; i < 8; i++) {
	        for(int j = 0; j < 8; j++) {
	            System.out.print(board[i][j] + " ");
	        }
	        System.out.println();
	    }

	    System.out.println();
	}
	
	private int newx = x ;
	private int newy = y ;
	
	
	public void move(int c) {
			
			switch(c) {
			case 1:
				newx=x+2;
				newy=y+1;
				break;
			case 2:
				newx=x+1;
				newy=y+2;
				break;
			case 3:
				newx=x-2;
				newy=y+1;
				break;
			case 4:
				newx=x-1;
				newy=y+2;
				break;
			case 5:
				newx=x+2;
				newy=y-1;
				break;
			case 6:
				newx=x-2;
				newy=y-1;
				break;
			case 7:
				newx=x-1;
				newy=y-2;
				break;
			case 8:
				newx=x+1;
				newy=y-2;
				break;
			}
			
/*============This is Week_5 Add===============*/			
			
			if (newx < 0 || newx >= 8 || newy < 0 || newy >= 8) {
				System.out.println("out of board! ~ move ignore ");
				return;
			}
			
			if (board[newx][newy] != 0 ) {
				System.out.println(" collisiion ! ~ move ignored ");
				return;
			}
			board[x][y] = 0;
			x = newx;
			y = newy;
			board[x][y] = color;
	}
}

	
	
/*
 * public void grid(String[] args) {
	for (int i=0;i<=8;i++) {
		for(int j=0;<=8;j++) {
			println
		}
	}
}
*/
	
	
	

