public class Student {
    int roll;
    String name;
    Student(){
        roll=99;
    }

    Student(int r, String n){
        name = n;
        roll = r;

    }
    Student(Student a){
        roll =  a.roll;
        name = a.name;
    }
    void print(){
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
    }
    public static void main(String[] args) {
        
       Student obj = new Student(232, "Rajvir");
       obj.print();
       Student obj2 = new Student(188, "Sid");
       obj2.print();
       Student obj3 = new Student();
       obj3.print();
       Student obj4 = new Student(234, "ginne");
       obj4.print();
    }
}