package volum2;

public class Task27 {

    public static void oneif() {
        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra + " es una vocal");
            } else {
                System.out.println(letra + " es una consonante");
            }
            letra++;
        }
    }

    public static void multif() {
        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            if (letra == 'a'){
                System.out.println(letra+" es vocal");
            } else if (letra == 'e') {
                System.out.println(letra+" es vocal");
            } else if (letra == 'i') {
                System.out.println(letra+" es vocal");
            } else if (letra == 'o') {
                System.out.println(letra+" es vocal");
            } else if (letra == 'u') {
                System.out.println(letra+" es vocal");
            } else {
                System.out.println(letra+" es consonante");
            }
            letra++;
        }
    }

    public static void swich() {
        char letra = 'a';
        for (int i = 0; i < 26; i++) {
            switch (letra){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': {
                    System.out.println(letra+ " es vocal");
                    break;
                }
                default: {
                    System.out.println(letra+ " es consonante");
                }
            }



            letra++;
        }
    }
    public static void main(String[] args) {
        //oneif();
        //multif();
        swich();
    }
}
