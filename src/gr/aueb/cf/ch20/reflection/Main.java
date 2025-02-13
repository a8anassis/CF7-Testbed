package gr.aueb.cf.ch20.reflection;

import javax.sound.midi.MetaEventListener;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Teacher.class;
        Class<?> aClass = Class.forName("gr.aub.cf.ch20.reflection.Teacher");

        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        Constructor<?>[] constructorsList = Teacher.class.getDeclaredConstructors();

        Constructor<?> defaultCtor = clazz.getDeclaredConstructor();
        defaultCtor.setAccessible(true);

        Teacher teacher = (Teacher) defaultCtor.newInstance();

        Constructor<?> intCtor = Teacher.class.getConstructor((Long.class));

        Constructor<?> overloadedCtor = clazz.getConstructor(Long.class, String.class, String.class);

        Method sayHello = clazz.getMethod("sayHello");
        sayHello.invoke(teacher);
    }
}
