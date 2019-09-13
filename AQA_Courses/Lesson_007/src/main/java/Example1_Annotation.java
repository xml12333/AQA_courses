import java.lang.annotation.*;
import java.lang.reflect.Method;

@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String param1() default "string";
    String param2();
}

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface MethodAnnotation {
}

@MyAnnotation(param2 = "test")
class Test1 {
    @MethodAnnotation
    public void myMethod() {
    }
}

public class Example1_Annotation {

    public static void main(String[] args) {
        final Class<?> cls = Test1.class;

        if (cls.isAnnotationPresent(MyAnnotation.class))
            System.out.println("Class is annotated");


        MyAnnotation myAnnotation = cls.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.param1() + ", " + myAnnotation.param2());

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodAnnotation.class)) {
                System.out.println("Method " + method.getName() + "is marked as MethodAnnotation");
            }
        }
    }
}