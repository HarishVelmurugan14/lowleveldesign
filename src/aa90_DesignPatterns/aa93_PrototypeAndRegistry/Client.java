package aa90_DesignPatterns.aa93_PrototypeAndRegistry;

import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.IntelligentStudent;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.Student;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.StudentUtil;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.Human;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.HumanRegistry;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.RaceType;

public class Client {
    public static void main(String[] args) {

        //----------------------------------------------------------------------------------------
        Student student = new Student("Rohit", 23, 57);

        IntelligentStudent intelligentStudent
                = new IntelligentStudent("Intelligent Rohit", 23, 90, 105);
        Student s1 = prototypePattern(student);
        Student s2 = prototypePattern(intelligentStudent);
        //----------------------------------------------------------------------------------------

        HumanRegistry humanRegistry = new HumanRegistry();

        Human masterElf = humanRegistry.get(RaceType.Elf);
        masterElf.setName("Legolas");

        Human masterOrc = humanRegistry.get(RaceType.Orc);
        masterOrc.setName("Thrall");

        Human masterZombie = humanRegistry.get(RaceType.Zombie);
        masterZombie.setName("Walker");

        System.out.println(masterElf);
        System.out.println(masterOrc);
        System.out.println(masterZombie);
    }

    private static Student prototypePattern(Student student) {
        // NOTE : PROPER WAY
        StudentUtil.doCopy(student);
        // Solution :  By making a copy method and calling copy constructor in it makes this easier
        // if student is plain / student is intelligent runtime polymorphism takes care of this and calls equivalent copy method

        // Problem : break SRP & OCP : it has too many responsibilities
        // and for every inherited class we need to affect this if look
        // NOTE : OLD WAY
        if (student instanceof Student) {
            return new Student(student);
        } else if (student instanceof IntelligentStudent) {
            return new IntelligentStudent((IntelligentStudent) student);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
