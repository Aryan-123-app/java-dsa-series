public class Student implements Comparable<Student> {

    /* 
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
        */

    /*public int rollNo;
    public String name;

    public Student(int roll, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override 
    public String toString() {
        return "Student{" + 
               "rollNo= " + rollNo +
               ", name= '" + name + '\'' +
               '}';
    }

    @Override 
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(rollNo);
    }
    */

    public int age;
    public String name;
    public int weight;

    public Student(int age, String name, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    @Override 
    public String toString() {
        return "Student{" +
               "age= " + age +
               ", name= " + name + 
               ", weight= " + weight +
               "}"; 
    }

    @Override 
    public int compareTo(Student that){
        //this method is called for current object
        //we will define our own sorting algorithm

        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        //sort basis on age
        //return this.age - that.age;
        //Descending order
        return that.age - this.age;
    }
}
