import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Test {
}

public class Summer {
    public static int sum(int... x) {
        int res = 0;
        for (int i : x) {
            res += i;
        }
        return res;
    }

    @Test
    public static boolean testMe() {
        return (sum(1, 2, 3, 4) == 10);
    }
}

class Mult {
    public static int mult(int... x) {
        int res = 1;
        for (int i : x) {
            res *= i;
        }
        ;
        return res;
    }

    @Test
    public static boolean selfTest() {
        return (mult(2, 2) == 4);
    }
}

class Tester {
    public static boolean test(Class<?>... ls) {
        try {
            for (Class<?> cls : ls) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class)) {
                        Boolean b = (Boolean) method.invoke(null);
                        if (!b)
                            return false;
                    }
                }
            }
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

class Reflection1 {
    public static void main(String[] args) {
        System.out.println(Tester.test(Summer.class, Mult.class));
    }
}