public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length= length;
        this.width= width;
    }


    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getArea(){
        return (width*length);
    }

    public double getDiagnal(){
        return Math.hypot(width,length);
    }

    public boolean isSquare(){
        if(width == length){
            return true;
        }else{
            return false;
        }
    }

}
