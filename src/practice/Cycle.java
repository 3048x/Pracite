package practice;

public class Cycle {
    public void play (){
        System.out.println("Cycle");
    }
    public static  void wheels(){
        System.out.println("Cycle轮子的数量"+"num");
    }
}
class Unicycle extends Cycle{
    public void play(){
        System.out.println("Unicycle");
    }
    public static void wheels(){
        System.out.println("Unicycle轮子的数量"+"1");
    }
}
class Bicycle extends Cycle{
    public void play(){
        System.out.println("Bicycle");
    }
    public static void wheels(){
        System.out.println("Bicycle轮子的数量"+"2");
    }
}
class Tricycle extends Cycle{
    public void play(){
        System.out.println("Tricycle");
    }
    public static void wheels(){
        System.out.println("Tricycle轮子的数量"+"3");
    }
}
class Ride{
    public static void ride(Cycle cycle) {
        cycle.play();
    }
    public static void main(String args[]){
        Unicycle unicycle =new Unicycle();
        Bicycle bicycle =new Bicycle();
        Tricycle tricycle =new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
        Unicycle.wheels();
        Bicycle.wheels();
        Tricycle.wheels();

    }
}

