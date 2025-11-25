package aa90_DesignPatterns.aa91_Singleton;

public class SingletonPattern {

    public static void purposeAndSolution() {

//        1. Creational Patterns
//        - Deal with object creation mechanisms.
//        - Examples: Singleton, Builder, Prototype, Factory Method, Abstract Factory.

//       Need: Ensure only one instance of a class exists (e.g., shared resource, config, manager).
//       How it solves: Restricts object creation and provides a single global access point.
//       Example:
//        Database connection manager — you don’t want 50 DB connections created unnecessarily; one shared instance handles all queries
//        Inventory in e-Commerce : Every order, return, warehouse update talks to the same inventory instance so stock levels stay consistent.
    }


    public static void main() {

        purposeAndSolution();

        SingletonPattern sp = new SingletonPattern();

        sp.SingleThreadSingletonPattern(); // Good but only used for single threaded problems

        sp.InEfficient(); // Thread safe but not efficient | do not use

        sp.BasicEagerApproach(); // Thread safe with good efficiency || Good for web application with few cons
        sp.LazyApproach(); // Thread safe good eff || double checking singleton pattern
        sp.StaticHolderSingleton(); // Avoids variable load on class startup

        sp.EnumSingleton(); // Best possible singleton approach

    }


    private void SingleThreadSingletonPattern() {
        DBConnectionPool1_STSP instance = DBConnectionPool1_STSP.getInstance();
        instance.doSomething();
        // NOTE : This is implementable for single thread
        // Implements singleton pattern for single threads
        // return only one instance which is created once inside getInstance method
        // CONS :
        // NOTE : Not thread safe : at a time multiple threads tries to access.
        // If condition allows by checking as it won't instantiated then later causes duplicate object creation
    }

    private void InEfficient() {
        DBConnectionPool2_MT_INF_SP instance = DBConnectionPool2_MT_INF_SP.getInstance();
        instance.doSomething();
        // Thread safe by using synchronized so only N number of objects created for N threads available
        // CONS :
        // There may be 1000 instructions executed by 10 threads but this way causes
        // NOTE : All threads wait for thread acquiring.
        // But we only need that for 10 instantiation
    }

    private void BasicEagerApproach() {
        DBConnectionPool3_MT_EAGER_SP instance = DBConnectionPool3_MT_EAGER_SP.getInstance();
        instance.doSomething();
        // Ensures thread safety
        // NOTE : This loads once when the class loads so we don't need synchronized to ensure thread safety
        // CONS :
        // Application startup takes much time
        // Memory acquired even if doesn't have a need
        // Custom configuration dynamic values cannot be included in constructor
        // Exception cause application crash
    }

    private void LazyApproach() {
        DBConnectionPool4_MT_LAZY_SP instance = DBConnectionPool4_MT_LAZY_SP.getInstance();
        instance.doSomething();
        instance.markedAsVolatile();
        // NOTE : DOUBLE CHECKING SINGLETON PATTERN
        // Marked as volatile
        // if non instantiated go into synchronize else return instance
        // this way avoids overhead of every thread going into locking and unlocking
        // Best for ANDROID Apps as it cannot apply huge startup time
    }

    private void StaticHolderSingleton() {
        DBConnectionPool5_MT_STATICHolder_SP instance = DBConnectionPool5_MT_STATICHolder_SP.getInstance();
        instance.doSomething();
        //NOTE : Best possible lazy version by making changes in eager approach
    }


    private void EnumSingleton() {
        // Best possible singleton approach
    }
}
