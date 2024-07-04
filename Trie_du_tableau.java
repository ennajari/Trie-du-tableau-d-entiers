import java.util.*;
// by Ennajari
public class Trie_du_tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombres vous pouvez Entrer ? ");
        int sizeT = sc.nextInt();
        int[] T = new int[sizeT];
        for (int i = 0; i < sizeT; i++) {
            System.out.println("Taper element " + (i + 1));
            T[i] = sc.nextInt();
        }
        Arrays.sort(T); // Sorting the temp array
        System.out.println("-------------------------Sorted elements:---------------------------");
        for (int j = 0; j < sizeT; j++) {
            System.out.println(T[j]);
        }
    }
}
