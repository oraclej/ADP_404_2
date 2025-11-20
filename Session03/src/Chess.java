public class Chess {
    ChessPiece[] pieces = new ChessPiece[32];

    ChessPiece[] whitePieces = new ChessPiece[16];
    ChessPiece[] blackPieces = new ChessPiece[16];

    ChessPiece[][] pieces2 = new ChessPiece[2][16];

    public static void main(String[] args) {
        ChessPiece horse = new ChessPiece();
        horse.name = "HORSE";
        horse.color = "WHITE";
        horse.x = 2;
        horse.y = 2;
        horse.isCaptured = false;
        horse.move(2,1);

        ChessPiece queen = new ChessPiece();
    }
}
