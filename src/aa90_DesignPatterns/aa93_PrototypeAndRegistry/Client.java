package aa90_DesignPatterns.aa93_PrototypeAndRegistry;

import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.IntelligentStudent;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.Student;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.StudentUtil;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.Human;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.HumanRegistry;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.RaceType;

public class Client
{
    public static void main(String[] args) {
        Student student = new Student("Rohit", 23, 57);

        IntelligentStudent intelligentStudent
                = new IntelligentStudent("Intelligent Rohit", 23, 90, 105);

        StudentUtil.doCopy(student);
        StudentUtil.doCopy(intelligentStudent);

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
}
