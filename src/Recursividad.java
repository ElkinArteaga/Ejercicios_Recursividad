
import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Hola a todos, este es el resultado de la clase de AyP2 del 11/11/2020 xD\n"
                + "A continuación un menú que nadie pidió:\n"
                + "1. Fibonacci recursivo\n"
                + "2. Exponenciación\n"
                + "3. Combinatoria\n"
                + "4. Algoritmo de Euclides\n"
                + "5. Ocurrencias\n"
                + "6. Búsqueda de una subcadena");
        int ind = leer.nextInt();

        while (ind < 1 || ind > 6) {
            System.out.println("Te crees gracioso... Don Comedia ;-;\n"
                    + "Ingresa una opcion valida... O hay tabla");
            ind = leer.nextInt();
        }
        switch (ind) {
            case 1:
                System.out.println("Digite el valor de n en F(n)");
                int n = leer.nextInt();
                System.out.println("El valor de F(" + n + ")= " + FibonacciR(n));
                break;
            case 2:
                System.out.println("Digite la base de su exponenciación: ");
                int n1 = leer.nextInt();
                System.out.println("Digite el valor del exponente: ");
                int j = leer.nextInt();
                System.out.println("El valor de " + n1 + "^" + j + "=" + exponenciacion(n1, j));
                break;
            case 3:
                System.out.println("Digite el valor de n (n,m) ");
                int n2 = leer.nextInt();
                System.out.println("Digite el valor de m (n,m) ");
                int m = leer.nextInt();
                System.out.println("El valor de (" + n2 + "," + m + ")=" + combi(n2, m));
                break;
            case 4:
                System.out.println("Digite el valor a de mcd(a,b)");
                int a = leer.nextInt();
                System.out.println("Digite el valor b de mcd(a,b)");
                int b = leer.nextInt();
                System.out.println("El mcd(" + a + "," + b + ")=" + mcd(a, b));
                break;
            case 5:
                System.out.println("Digite la longitud del vector");
                int n3 = leer.nextInt();
                int A[] = new int[n3];
                for (int i = 0; i < n3; i++) {
                    System.out.println("Digite el valor de A[" + (i + 1) + "]: ");
                    A[i] = leer.nextInt();
                }
                System.out.println("Digite el elemento a buscar numero de ocurrencias: ");
                int elem = leer.nextInt();
                System.out.println("El numero de ocurrencias de " + elem + " es " + ocurrencias(A, n3, elem, 0));
                break;
            case 6:
                System.out.println("Digite una cadena: ");
                String st2 = leer.nextLine();
                System.out.println("Digite cadena a buscar: ");
                String st1 = leer.nextLine();
                System.out.println("..." + busqueda(st1, st2, 0));
                break;
        }
    }

    static int FibonacciR(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return (FibonacciR(i - 1) + FibonacciR(i - 2));
        }
    }

    static double exponenciacion(int n, int j) { //n es la base, j es el exponente
        if (j == 0) {
            return 1;
        } else {
            if (j == 1) {
                return n;
            } else {
                return n * exponenciacion(n, j - 1);
            }
        }
    }

    static double combi(int n, int m) {
        if (n == 1 || n == m || m == 0) {
            return 1;
        } else {
            return (combi(n - 1, m) + combi(n - 1, m - 1));
        }
    }

    static double mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    static int ocurrencias(int A[], int n, int elem, int pos) {
        if (pos > n) {
            return 0;
        } else {
            if (A[pos] == elem) {
                return 1 + ocurrencias(A, n, elem, pos + 1);
            } else {
                return ocurrencias(A, n, elem, pos + 1);
            }
        }
    }

    static boolean busqueda(String st1, String st2, int i) {
        if (i + (st1.length()) > st2.length()) {
            return false;
        } else {
            if (st1.equals(st2.substring(i, i + (st1.length())))) {
                return true;
            } else {
                return busqueda(st1, st2, i + 1);
            }
        }
    }
}
