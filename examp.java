public class examp {
    public static void main(String[] args)
{
 hod h=new hod();
 mentor m=new mentor();
 student_ex s=new student_ex();
 h.profile();
 m.profile();
 s.profile();

}    
}
class hod{
    void profile(){
        System.out.println("this is hod profile :");
    }
}
class mentor extends hod{
    void profile(){
        System.out.println("this is mentor profile ");
    }
}
class student  extends mentor{
    void profile(){
        System.out.println(":this is student profile ");
    }
}

