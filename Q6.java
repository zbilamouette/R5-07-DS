public class Q6 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
    
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) System.out.print("x");
            System.out.println();
        }

        System.out.println("Fin du programme.");
    }
}