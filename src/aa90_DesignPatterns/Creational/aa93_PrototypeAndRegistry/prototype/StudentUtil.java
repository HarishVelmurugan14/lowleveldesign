package aa90_DesignPatterns.Creational.aa93_PrototypeAndRegistry.prototype;

public class StudentUtil
{
    public static void doCopy(Student student)
    {
        Student copyStudent = student.copy();
        System.out.println(copyStudent.getName());
    }
}
