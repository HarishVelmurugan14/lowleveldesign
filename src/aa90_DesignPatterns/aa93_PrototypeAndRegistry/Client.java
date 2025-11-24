package aa90_DesignPatterns.aa93_PrototypeAndRegistry;

import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.IntelligentStudent;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.Student;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.prototype.StudentUtil;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.Human;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.HumanRegistry;
import aa90_DesignPatterns.aa93_PrototypeAndRegistry.registry.RaceType;

public class Client {

    static void purpose(){
//        Prototype Pattern
//        -----------------
//        Need: Create new objects by copying an existing object instead of building from scratch.
//        runtime polymorphism can be solved easily by overriding copy and calling copy constructor
//        How it solves: Uses cloning to quickly produce similar objects with small variations.
//
//        Business Examples:
//        1. Invoice Template Prototype – Copy an existing invoice format and adjust details.
//        2. Product Catalog Item Prototype – Duplicate a product entry and modify only price or stock.
//        3. User Profile Prototype – Clone a default user profile setup and update specific fields.

//        Registry Pattern
//        ----------------
//        Need: Keep a central place to store and retrieve shared objects by name/key.
//        How it solves: Maintains a global lookup table so objects/services can be accessed anywhere without recreating them.
//
//        Business Examples:
//        1. Global Feature Toggle Registry – Fetch feature flags (ON/OFF) from one central place.
//        2. Tax Rule Registry – Retrieve region-specific tax rules used across billing modules.
//        3. Notification Channel Registry – Get SMS/Email/Push channel handlers from one shared registry.
    }

    public static void main(String[] args) {

        //----------------------------------------------------------------------------------------
        Student student = new Student("Rohit", 23, 57);

        IntelligentStudent intelligentStudent
                = new IntelligentStudent("Intelligent Rohit", 23, 90, 105);
        Student s1 = prototypePattern(student);
        Student s2 = prototypePattern(intelligentStudent);
        //----------------------------------------------------------------------------------------

        // Need : Assume i have 4 races (human, elf, orc and zombie) all derived from human but they have certain characteristics
        // I need to create 10 character in each race. What should I do ?

        // Way 1 : Create a class for each : but they are the same with modified characteristics
        // so having different classes extending human is pointless

        // Way 2 : Create a class for human, Maintain characteristics of each race by modifying human and have a db entry
        // once a new elf is needed fetch the human property append the elf properties and then return too much hassle

        // Proper way : Instead of fetching db every time register human properties, elf properties and
        // others once in registry and fetch as many times as we need
        // Kind of caching :  fetch from db and save in registry for repeated usages

        // NOTE : INTERVIEW EXPLANATION
        // The Registry Pattern here acts like a central dictionary that stores character instances by type.
        // Whenever the game needs a character (Human, Elf, or Orc), it looks it up from the registry instead of manually creating it.
        // This helps if new characters are added later — just register them once, and any part of the game can access them by name.

        registryPattern();
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

    private static void registryPattern(){
        HumanRegistry humanRegistry = new HumanRegistry();

        // Player 1 is a ELF : Instead of fetching from db fetch elf property from registry
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
