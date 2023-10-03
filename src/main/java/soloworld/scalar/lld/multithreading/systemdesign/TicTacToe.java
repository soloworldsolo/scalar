package soloworld.scalar.lld.multithreading.systemdesign;

public class TicTacToe {
    public String tictactoe(int[][] moves) {

        int[] rows = new int[moves.length];
        int[] cols = new int[moves.length];
        int diagonal = 0;
        int antidiagonal = 0;
        int player = 1;
        int total = 3;
        ;
        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];
            rows[row] += player;
            cols[col] += player;
            if (row == col) {
                diagonal += player;
            }
            if (row + col == total) {
                antidiagonal += player;
            }
            if (rows[row] == total || cols[col] == total || diagonal == total || antidiagonal == total) {
                return player == 1 ? "A wins" : "B wins";
            }

            player *= -1;
        }
        return "Draw";
    }


}
