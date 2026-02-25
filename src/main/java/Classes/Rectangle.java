package Classes;

public class Rectangle {
    double width=0.0;
    double height=0.0;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public Rectangle(double width){
        this.width=width;
    }

    public double calculateArea(){
        if(height!=0.0){
            double area=height*width;
            return area;
        }else{
            double area=width*width;
            return area;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(12,14);
        Rectangle rectangle2=new Rectangle(15);
        System.out.println("The area is: " + rectangle2.calculateArea());
    }

}
