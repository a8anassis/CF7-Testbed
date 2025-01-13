package gr.aueb.cf.ch14.services;

public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {

    }

    // Lazy instantiation
    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello!!");
    }
}
