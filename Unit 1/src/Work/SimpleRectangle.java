package Work;


public class SimpleRectangle {

    private int height;
    private int width;

    public SimpleRectangle(int givenWidth, int givenHeight){

        height = givenHeight;
        width = givenWidth;

    }

    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){

        height = h;
    }

    public int getWidth(){

        return width;
    }
    public int getHeight(){

        return height;
    }

    public void grow(int w, int h){

        height += 2 * h;
        width += 2 * w;
    }
    public void shrink(int w, int h){

        height -= 2 * h;
        width -= 2 * w;
    }

    public int getArea(){

        return width * height;
    }
    public int getPerimeter(){

        return ((2 * height) + (2 * width));
    }
    public double getHypotenuse(){
        return (Math.sqrt((height * height) + (width * width)));
    }

}
