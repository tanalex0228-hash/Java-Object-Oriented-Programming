public class knight {
	static int [][] board = new int[8][8];
	int x , y ;
	int color;
	
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
	
	
	public boolean checker(int a , int b){
		if (board[a][b]==1) {
			return true;
			}
			return false;
	}	
	public void fill (int x , int y) {
		knight.board[x][y]=1;
		
	}
	public void returner(int a ,int b) {
		knight.board[a][b]=0;
	}
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
	public void move(int c) {
			
			switch(c) {
			case 1:
				x=x+2;
				y=y+1;
				break;
			case 2:
				x=x+1;
				y=y+2;
				break;
			case 3:
				x=x-2;
				y=y+1;
				break;
			case 4:
				x=x-1;
				y=y+2;
				break;
			case 5:
				x=x+2;
				y=y-1;
				break;
			case 6:
				x=x-2;
				y=y-1;
				break;
			case 7:
				x=x-1;
				y=y-2;
				break;
			case 8:
				x=x+1;
				y=y-2;
				break;
			}
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
	
	
	

