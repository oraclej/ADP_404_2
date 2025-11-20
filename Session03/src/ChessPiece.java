public class ChessPiece {
    String name;
    String color;
    int x;
    int y;
    boolean isCaptured;

    ChessPiece(){
        isCaptured = false;
    }

    void move(int moveX, int moveY) {
        if (isAllowed(moveX, moveY))
            if (((x + moveX) <= 7 && (y + moveY) <= 7) && ((x + moveX) >= 0 && (y + moveY) >= 0)) {
                x += moveX;
                y += moveY;
            }
    }

    boolean isAllowed(int moveX, int moveY) {
        if (name.equals("HORSE")) {
            if (moveX != 0 && moveY != 0)
                if (Math.abs(moveX) + Math.abs(moveY) == 3)
                    return true;
            return false;
        } else if (name.equals("QUEEN")) {
            if (moveX != 0 && Math.abs(moveX) == Math.abs(moveY))
                return true;
            if ((moveX == 0 || moveY == 0) && (moveX != moveY))
                return true;
            return false;

        }
        return false;
    }
}
