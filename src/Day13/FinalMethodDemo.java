package Day13;

class Chess {
	enum ChessPlayer {
		WHITH, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITH;
	}

}

class WorldChess extends Chess {
	// chessPlayer getFirstPlayer(){}
}

public class FinalMethodDemo {
	public static void main(String[] args) {
		WorldChess w = new WorldChess();
		System.out.println(w.getFirstPlayer());

	}
}
