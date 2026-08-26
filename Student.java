public class Student{

    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    //Default Constructor
    public Student(){
        System.out.println("Student Default Constructor called.");
    }

    //Parameterised Constructor
    public Student(int id,int age, String name, int nos,String gf){
        System.out.println("Student Parameterised Constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //Copy Constructor
    public Student(Student src){ //src -> A
        System.out.println("Student Copy Constructor Called");
        this.id = src.id;
        this.age = src.age;
        this.name = src.name;
        this.nos = src.nos;
    }

    //Methods or Behaviours
    public void study(){
        System.out.println(name + " is studying!");
    }
    public void bunk() {
        System.out.println(name + " is bunking!");
    }
    public void sleep() {
        System.out.println(name + " is sleeping!");
    }
    private void gfchatting(){
        System.out.println(name + " is chatting with GF");
    }
}