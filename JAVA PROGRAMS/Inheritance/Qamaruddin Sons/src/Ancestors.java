class Qamaruddin {
    static public void sonnames() {
        System.out.println("name of the sons");
        System.out.println("First Son name is :- Mazheruddin");
        System.out.println("Second Son name is :- Yousufuddin");
    }
}

class Mazheruddin extends Qamaruddin {
    static public void firstson() {
        System.out.println("Mazheruddin says assalamualaikum");
    }
}

class Yousufuffin extends Qamaruddin {
    static public void secondson() {
        System.out.println("Yousufuddin says walaikumsalaam");
    }
}

class Main {
    public static void main(String[] args) {
        Qamaruddin sonnames = new Qamaruddin();
        Qamaruddin firstname = new Qamaruddin();
        Qamaruddin secondname = new Qamaruddin();

        sonnames.sonnames();
        Mazheruddin.firstson();
        Yousufuffin.secondson();
    }
}
