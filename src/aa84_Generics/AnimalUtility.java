package aa84_Generics;

import java.util.List;

public class AnimalUtility
{
    public static void printName(Animal animal)
    {
        System.out.println(animal.getName());
    }

    public static void printFromList(List<Animal> animals)
    {
        for (Animal animal : animals)
        {
            printName(animal);
        }
    }

    public static <T extends Animal> T printFromListGeneric(List<T> animals)
    {
        // Syntax private static "class definition" "return type" name ("generic variable")
        // Marked Dog / any sub animal class can be used as input of list. Iterate over them and prints them.
        // T is used inside the method hence T as class def is needed
        for (T animal : animals)
        {
            printName(animal);
        }

        return animals.get(0);
    }

    public static void printListPlaceholder(List<? extends Animal> animals)
    {
        // T is not used anywhere ; Then why define them just a ? place holder is enough
        for (Animal animal : animals)
        {
            printName(animal);
        }
    }
}
