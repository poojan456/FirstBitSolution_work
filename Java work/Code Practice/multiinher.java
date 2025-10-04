public class multiinher {
    public static void main(String[] args) {
        class animal {
            void sound() {
                System.out.println("Every animal have different sound");
            }

            void eat() {
                System.out.println("Every animal eat different food");
            }

        }
        class cat extends animal {
            void fun1() {
                System.out.println("cat sound:meaw");
            }

            void fun2() {
                System.out.println("cat eat:milk and meat");
            }
        }
        class tiger extends animal {
            void fun3() {
                System.out.println("tiger sound:roar");
            }

            void fun4() {
                System.out.println("tiger eat:meat");
            }
        }
        tiger t = new tiger();
        cat c = new cat();
        c.fun1();
        c.fun2();
        t.fun3();
        t.fun4();

    }
}
