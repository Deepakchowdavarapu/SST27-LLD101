
public class Square implements Quadrilateral {
    protected int side;
    public void setWidth(int w){ this.side = w; }
    public void setHeight(int h){ this.side = h; }
    public int area(){ return side*side; }
}