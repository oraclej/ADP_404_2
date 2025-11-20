public class ChessPiece {
    String name;
    String color;
    int x;
    int y;
    boolean isCaptured;

    void move(int moveX, int moveY){
        if((x + moveX) <= 7 && (y + moveY) <= 7){
            x += moveX;
            y += moveY;
        }
    }

//    boolean isAllowed(int moveX, int moveY){
//        if(name.equals("HORSE")){
//            if(Math.abs(moveX) + Math.abs(moveY) == 3)
//                return true;
//            return false;
//        }
//    }
}
