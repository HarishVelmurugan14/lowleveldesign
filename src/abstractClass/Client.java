package abstractClass;

public class Client
{
    public static void main(String[] args)
    {

        // HK NOTES :
        // Abstract class does not instantiate an object instead some child class extends it and uses its method
        // Child class can override normal methods but absolutely override abstract methods

        // Bird bird = new Bird(); COMPILE TIME ISSUE

         Bird bird = new Sparrow();
         bird.fly();
    }
}
