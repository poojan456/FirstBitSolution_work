public class animal {
    void sound() {
        System.out.println("eating...");
    }
}

class dog extends animal {
    void sound() {
        System.out.println("barking...");
    }
}

class cat extends animal {
    void sound() {
        System.out.println("meowing...");
    }
}

class tiger extends cat {
    void sound() {
        System.out.println("roaring...");
    }
}

class inheritance {
    public static void main(String[] arg) {
        tiger d = new tiger();
        d.sound();
    }
}
