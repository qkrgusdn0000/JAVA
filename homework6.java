public class Homework6 {
    public static void main(String[] args){
        OfflineCourse course1= new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2= new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}

class OnlineCourse extends Course{
    OnlineCourse(String code,String name)
    {
        this.code=code;
        this.name=name;
    }
    public String toString(){
        String str="Code: " + code + ", Name: " + name + ", Type: Online";
                return str;
    }
}

class OfflineCourse extends Course{
    OfflineCourse(String code,String name)
    {
        this.code=code;
        this.name=name;
    }
    public String toString(){
        String str="Code: " + code + ", Name: " + name + ", Type: Offline";
        return str;
    }
}

class Course{
    protected String code;
    protected String name;
}