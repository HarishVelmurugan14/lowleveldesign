package aa84_Generics;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        usingObjects();
        usingGenerics();
        rawTypesAllowed(); // Not advisable
        animalListProblem(); // How generics solve inheritance problems

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

//        AnimalUtility.printListPlaceholder(integerList);
//        AnimalUtility.printFromListGeneric(integerList);

        Set<Integer> integerSet = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

    }

    private static void usingObjects() {
        // WAY Before Generics : Using Objects works well if all are configured correctly
        // Causes class cast / type cast exception
        Pair pair = new Pair();
        pair.setFirst("Abhishek");
        pair.setSecond(34.0); // second is a double
        pair.setSecond("Kumar"); // assigned string which is accepted in compile time but throws error in run time

        Double d = (Double) pair.getSecond();
    }

    private static void usingGenerics() {
        // Avoids run time exception and still allow generalization
        GenericPair<String, Double> genericPair = new GenericPair<>(); // second element is marked as double on the class level
        genericPair.setFirst("Abhishek");
        genericPair.setSecond(34.0);

//        genericPair.setSecond("Kumar"); // will throw error
    }

    private static void rawTypesAllowed() {
        // Java advocates backward compatibility strongly so raw types are allowed
        // What is T,V here ? What data type ?
        // They are Objects :  so it defeats the purpose of generics
        GenericPair genericPair2 = new GenericPair<>(); // Raw Type => genericPair2
        List list = new ArrayList(); // Raw Type => list
    }

    private static void animalListProblem() {
        Animal animal = new Animal("Rocky");
        Dog dog = new Dog("Bruce", "Alsatian");

        // Dog is a type of animal so places where Animal (singular) is refed : Dog can be used
        AnimalUtility.printName(animal);
        AnimalUtility.printName(dog);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);

        problemWithListOfChildClass(animalList, dogList);
        solutionUsingGenerics(animalList, dogList);
    }

    private static void problemWithListOfChildClass(List<Animal> animalList, List<Dog> dogList) {

//        But List<Dog> is not equal to List<Animal>
//        Dog is an Animal → Dog dog = new Dog(); Animal a = dog; ✅
//        List<Dog> is not a List<Animal> → List<Animal> animals = new ArrayList<Dog>(); ❌
//        Java uses invariant generics for type safety.
//        List<Dog> dogs = new ArrayList<>();
//        List<Animal> animals = dogs; // Suppose this is allowed
//        animals.add(new Cat());      // Cat is also an Animal

        AnimalUtility.printFromList(animalList);
//        AnimalUtility.printFromList(dogList);
    }

    private static void solutionUsingGenerics(List<Animal> animalList, List<Dog> dogList) {
        // Go to definition for better picture
        // Here using generics we solved the problem
        // T is used
        AnimalUtility.printFromListGeneric(animalList);
        AnimalUtility.printFromListGeneric(dogList);

        // T is not used inside method ? is acted as a place holder
        AnimalUtility.printListPlaceholder(animalList);
        AnimalUtility.printListPlaceholder(dogList);
    }
}
