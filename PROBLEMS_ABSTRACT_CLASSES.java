class monkey{
    void jump()
    {
        System.out.println("JUMPS LIKE A MONKEY");
    };

        void bite()
    {
        System.out.println("BITES LIKE A MONKEY");
    };
}
//---------------------------------------------------------------------
interface basicAnimal{
    void eat();
    void sleep();
}
//------------------------------------------------------------
class human extends monkey implements basicAnimal{
    public void eat()
    {
        System.out.println("EATING AS A BASIC ANIMAL");
    }
    public void sleep()
    {
        System.out.println("SLEEPS LIKE A BASIC ANIMAL");
    }
}



public class PROBLEMS_ABSTRACT_CLASSES {
    public static void main(String[] args) {
         human tushar = new human();
        System.out.println("TUSHAR CHARACTERISTICS");
         tushar.eat();
         tushar.sleep();
         tushar.bite();
         tushar.jump();

//         Polymorphism
        System.out.println("CHIRAG CHARACTERISTICS");
         monkey chirag = new human();
         chirag.jump();
         chirag.bite();

    }

}
