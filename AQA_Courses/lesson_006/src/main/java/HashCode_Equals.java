import java.util.Objects;

public class HashCode_Equals {

    public static void main(String[] args) {

        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);

        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

       // System.out.println("Result of FileNotFoundException is: " + object1.equals(object2));// должно быть true, поскольку содержимое объектов эквивалентно
        System.out.println(object1.equals(object2));// должно быть true
        System.out.println(object1.hashCode() + "\n" + object2.hashCode());

        BlackBox object3 = new BlackBox(5, 10);
        BlackBox object4 = object3;
        System.out.println("3 " + object3.hashCode() + " 4 " + object4.hashCode());// Переменная object4 ссылается на
        //тот-же объект что и переменная object3
            System.out.println("object3 and object4 is :" + object3.equals(object4));//true

    }

    public static class BlackBox {
        int varA;
        int varB;

        BlackBox(int varA, int varB) {
            this.varA = varA;
            this.varB = varB;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BlackBox blackBox = (BlackBox) o;
            return varA == blackBox.varA &&
                    varB == blackBox.varB;
        }

       /* @Override
        public int hashCode() {
            return Objects.hash(varA, varB);
        }*/
    }

    /*  Класс Object  */

    public boolean equals(Object obj) {
        return (this == obj);
    }

  //  public native int hashCode();
    // c++
    //При вычислении хэш-кода для объектов класса Object по умолчанию используется Park-Miller RNG алгоритм.
    // В основу работы данного алгоритма положен генератор случайных чисел.
    // Это означает, что при каждом запуске программы у объекта будет разный хэш-код.

    /*static inline intptr_t get_next_hash(Thread * Self, oop obj) {
        intptr_t value = 0 ;
        if (hashCode == 0) {
            // This form uses an unguarded global Park-Miller RNG,
            // so it's possible for two threads to race and generate the same RNG.
            // On MP system we'll have lots of RW access to a global, so the
            // mechanism induces lots of coherency traffic.
            value = os::random() ;
        } else
        if (hashCode == 1) {
            // This variation has the property of being stable (idempotent)
            // between STW operations.  This can be useful in some of the 1-0
            // synchronization schemes.
            intptr_t addrBits = intptr_t(obj) >> 3 ;
            value = addrBits ^ (addrBits >> 5) ^ GVars.stwRandom ;
        } else
        if (hashCode == 2) {
            value = 1 ;            // for sensitivity testing
        } else
        if (hashCode == 3) {
            value = ++GVars.hcSequence ;
        } else
        if (hashCode == 4) {
            value = intptr_t(obj) ;
        } else {
            // Marsaglia's xor-shift scheme with thread-specific state
            // This is probably the best overall implementation -- we'll
            // likely make this the default in future releases.
            unsigned t = Self->_hashStateX ;
            t ^= (t << 11) ;
            Self->_hashStateX = Self->_hashStateY ;
            Self->_hashStateY = Self->_hashStateZ ;
            Self->_hashStateZ = Self->_hashStateW ;
            unsigned v = Self->_hashStateW ;
            v = (v ^ (v >> 19)) ^ (t ^ (t >> 8)) ;
            Self->_hashStateW = v ;
            value = v ;

        }*/
}