public class App {
    public static void main(String[] args) {
        /*Student A = new Student();
        A.id = 1;
        A.age = 14;
        A.name = "Aryan";
        A.nos = 5;
        System.out.println(A.name);

        A.bunk();
        A.study();
        A.sleep();*/

        //Parameterised Constructor
        Student A = new Student(1,12,"Rahul",3,"Kiara");
        //Copy Constructor 
        Student B = new Student(A);
        System.out.println(B.name);
    }
}
