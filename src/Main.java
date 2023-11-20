import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TextContainer container = new TextContainer("Hello world");
        var toClass = container.getClass();  //отримали
        SaveTo annotation = toClass.getAnnotation(SaveTo.class);
        Method[] methods = toClass.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Saver.class)) {
                m.invoke(container, annotation.path());
            }
        }
    }
}