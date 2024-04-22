public class constructors {
    public static void main(String arg[]){
        Student s1 =new Student(5);
        Student s=new Student();
        Student s2=new Student("saurabh");
        Student s3 =new Student(123);
        Student s4 =new Student("KAJ");
        s1.password="sauranh";
        Student s8 =new Student(s1);
        s2.password="xyz";
        System.out.println(s);
    }
}
    class Student{
        int roll;
        String name;
        Student(){
        System.out.println("saurabh");
        }
        Student (Student s1){
            this.name=s1.name;
            this.roll=s1.roll;
            
        }
        Student(String name )
        {
            this.name = name;
        }
        Student(int roll){
            this.roll = roll;
        }
        String password;

         
    }