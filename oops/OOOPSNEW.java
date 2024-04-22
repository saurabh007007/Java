public class OOOPSNEW {
    
    public static void main(String args[]) {
        S s= new stu("SAa");
        System.out.println(s.name);
    }
}


class Pen{
    String color;
    int tip;
    void setColor(int newTip){
        tip=newTip;
    }
}
class StudentP{
    String name;
    int roll;
    float percentage;

}

// class Pen{
//     private String color;
//     private int tip;

//     void setColor(int newTip){
//         tip=newTip;
//     }
// }

// ENCAPSULATION 
// wrapping up of data method under a single unit.It also implement data hiding

class S{
    String name;
    int roll;
    
    stu (String name){
        System.out.println("name");

    }
}