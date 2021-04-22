import java.util.Arrays;

public class First {
    public static void main(String[] args) {
/*
        System.out.println("Hello, World!");
        System.out.println(text("Vitya", 38));
        ourArray();
        persons();
*/
        int[] a = new int[] {2,5,1,4,6,100,8,4,3,1,7,2,4,6};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        }

        System.out.println(Arrays.toString(a));

        /*
        Выбрать из массива все элементы больше 10. И напечатать.

        Написать функцию которая выберет из массива все элементы больше К. И напечатать.
        */
    }

    private static String text(String name, int age) {
        byte b = 0 - 1; // byte = 1 byte (-127...+127)
        short s = 0 - 1; // short = 2 byte (-32000...+32000)
        char c = 'q'; // char = 2 byte (-32000...+32000)
        int i = 10 * 100; // int = 4 byte (-2,000,000,000...+2,000,000,000)
        long l = 10 / 100; // long = 8 byte (-9,223,372,036,854,775,808...+9,223,372,036,854,775,807)

        float f = 0.1f + 100; // int = 4 byte (-2^126...+2^127)
        double d = 0.1 - 100; // int = 8 byte (-2^1022...+2^1023)

        boolean bt = true;
        boolean bf = false;

        String text = "My name is " + name + " (и мне " + age + " лет)";

        return text;
    }

    private static int[] ourArray() {
        int[] a = new int[] {1,2,3,4,5,6,7,8,9,0, 11, 12, 1444,121413,1341344,32423,423423};
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        int j = 0;

        while (j < b.length) {
            System.out.println(b[j]);
            j++;
        }

        return a;
    }

    private static void persons() {
        Person a = new Person("Vasya", 100, 0);
        Person b = new Person("Kolya", 10, 1);

        a.sayHello();
        b.sayHello();
    }

    private static class Person {
        private final String name;
        private final int age;
        private final long taxId;

        public Person(String personName, int age, long taxId) {
            name = personName;
            this.age = age;
            this.taxId = taxId;
        }

        public void sayHello() {
            System.out.println("Hi, " + name);
        }
    }
}
