public class runner {

    public static void main(String[] args){
        Car vroomvroom = new Car(1851, "toad", 405, "frog");
        System.out.println(vroomvroom.toString());

        vroomvroom.drive(20);
        System.out.println(vroomvroom.toString());

        Rectangle triangle = new Rectangle(13,12);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getDiagnal());
        System.out.println(triangle.isSquare());


    }


}
