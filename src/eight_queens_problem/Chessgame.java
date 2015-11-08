package eight_queens_problem;

public class Chessgame {
	
	private int n = 8;
	private int[] chessboard;
	private int solutionCounter = 0;
	
	public static void main(String[] args) {
		Chessgame c = new Chessgame();
		c.positionQueen(0);
	}
	
	public Chessgame(){
		chessboard = new int[n];
		createEmptyChessboard();
	}


	private void createEmptyChessboard() {
		for(int i = 0; i < chessboard.length; i++){
			chessboard[i] = -100;
		}
		
	}

	public void positionQueen(int column){
		if(column == n){
			solutionPrint(chessboard, solutionCounter, n);
			
				
		
			
		}else{
			for(int row = 0; row < chessboard.length; row++){
				chessboard[column] = row;
				if(isSave(column, row)){
					positionQueen(column+1);
				}
					chessboard[column] = -100;
			}
		}
	}


	private boolean isSave(int column, int row) {
		for(int i = 0; i < chessboard.length; i++){
			//horizontal Check
			if(chessboard[i] == row && i != column){
				return false;
			}
			//ascending Diagonal check
			else if(chessboard[i] - i == row - column && chessboard[i] != row && i != column ){
				return false;
			}
			//descending Diagonal check
			else if((chessboard[i] + i) == (column + row) && chessboard[i] != row && i != column)
				return false;
	}
		return true;	
			
	}

		public void solutionPrint(int[] chessboard, int counter, int n) {
			solutionCounter += 1;
			int[][]printBoard= new int[n][n];
			System.out.println("Counter:"+solutionCounter);
			for(int i = 0; i < chessboard.length; i++){
				printBoard[i][chessboard[i]]=1;
				for (int m=0;m<chessboard.length; m++){
				System.out.printf("%1d ", printBoard[i][m]);
				}
				System.out.println();
			}}
	}

