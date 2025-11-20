public class Chess {
    public static void main(String[] args) {
        ChessPiece horse = new ChessPiece();
        horse.name = "HORSE";
        horse.color = "WHITE";
        horse.x = 2;
        horse.y = 2;
        horse.isCaptured = false;
        horse.move(3,1);
    }
}
