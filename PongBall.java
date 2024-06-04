public class PongBall {
    private int xCord;
    private int yCord;
    private int velocityX;
    private int velocityY;

    public PongBall(int x, int y, int vX, int vY) {
        xCord = x;
        yCord = y;
        velocityX = vX;
        velocityY = vY;
    }

    public int getX() {
        return xCord;
    }

    public int getY() {
        return yCord;
    }
    public int setX(int x) {
        return xCord = x;
    }

    public int setY(int y) {
        return yCord = y;
    }

    public void bounceX() {
        velocityX = -velocityX;
    }

    public void bounceY() {
        velocityY = -velocityY;
    }

    public void move() {
        xCord += velocityX;
        yCord += velocityY;
    }
}
