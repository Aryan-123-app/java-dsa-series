import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Car c = new Car("Maruti", "800",4,5,"Automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();*/

       /*Motorcycle m = new Motorcycle( "Splendor", "XLine", 2, "U", "soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();*/

        /*Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,4,5));
        System.out.println(c.add(2,3,4,4.6));

        //Runtime Polymorphism
        Circle c = new Circle();
        c.draw();*/

        List<Student> students = new ArrayList<>();

        students.add(new Student(23,"Vipul",68));
        students.add(new Student(23,"Karan",95));
        students.add(new Student(21,"Aarya",54));
        students.add(new Student(7,"Priya",45));

        System.out.println(students);

        //Easy way to define comparison logic
        Collections.sort(students, new Comparator<Student>(){
            @Override 
            public int compare(Student o1, Student o2){
                return o1.weight - o2.weight;
            }
        });

        //Lambda Expression for above comparator
        //Collections.sort(students, (o1,o2) -> o1.weight - o2.weight);

        System.out.println(students);
    }
}
