public class PongPaddle {
    private int x;
    private int y;
    private int width;
    private int height;

    public PongPaddle(int w, int h, int left, int top) {
        x = left;
        y = top;
        width = w;
        height = h;
    }

    public int getBottomY() {
        return y + height;
    }

    public int getLeftX() {
        return x;
    }

    public int getRightX() {
        return x + width; 
    }

    public int getTopY() {
        return y;
    }

    public void moveDown(int d) {
        y = y + d; 
    }

    public void moveUp(int d) {
        y = y - d; 
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
