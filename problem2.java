//POLYMORPHISM


abstract class telephone{
   abstract void ring();
   abstract void lift();
   abstract void disconnect();

}
class Smartphone extends telephone{
    void ring()
    {
        System.out.println("Ringing....");
    }
    void lift()
    {
        System.out.println("Lifting....");
    }
    void disconnect()
    {
        System.out.println("Disconnecting....");
    }
    void youtube()
    {
        System.out.println("WATCHING YOUTUBE....");
    }


}

public class problem2 {
    public static void main(String[] args) {
        telephone nokia = new Smartphone();
        nokia.disconnect();
        nokia.lift();
        nokia.ring();

    }
}
