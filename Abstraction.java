/*abstract class Bird {
    
    abstract void fly(); // abstract methods

    abstract void eat();
}

class Sparrow extends  Bird{

    @Override 
    void fly(){
        System.out.println("Sparrow is flying!");
    }

    @Override 
    void eat(){
        System.out.println("Sparrow is eating");
    }
}

public class Abstraction{
    public static void main(String[] args) {
        //Bird b = new Bird(); // Abstract class cannot be instantiated.
        Bird b = new Sparrow();
        b.eat();
        b.fly();
    }
}*/

// Interface - A new way to design abstraction method in Java
interface Bird{
    void fly();
    void eat();
}

class Sparrow implements Bird{

    @Override 
    public void fly(){
        System.out.println("Sparrow is flying!");
    }

    @Override 
    public void eat(){
        System.out.println("Sparrow is eating!");
    }
}

class Crow implements Bird{

    @Override 
    public void fly(){
        System.out.println("Crow is flying!");
    }

    @Override 
    public void eat(){
        System.out.println("Crow is eating!");
    }
}

public class Abstraction{
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}