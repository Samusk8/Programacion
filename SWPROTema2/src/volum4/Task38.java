// todo Genera sencers aleatòris entre un valor màxim i un valor mínim fins que els hagis generats tots. Mostra els valors generats i quantes iteracions has necessitat per conseguir-ho.

package volum4;

public class Task38 {
    public static void main(String[] args) {
        int Min = 0;
        int Max = 10;
        boolean[] valors = new boolean[Max + 1];
        boolean completo = false;
        int contador = 0;
        for (int i = 0; i < valors.length; i++) {
            valors[i]=false;
        }

            do {
                int aleatorio = Min + (int)(Math.random() * ((Max - Min) + 1));
                valors[aleatorio] = true;
                System.out.print(aleatorio + "    ");
                contador++;
                completo = true;
                for (int i = Min; i < valors.length && completo; i++) {
                    completo = valors[i];
                }
            } while (!completo);
            System.out.println();
            System.out.println("Repeticiones:" + contador);

    }
}
