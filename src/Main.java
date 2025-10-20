import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaDinamica pila = new PilaDinamica();
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE PILA DINÁMICA =====");
            System.out.println("1. Insertar carácter (PUSH)");
            System.out.println("2. Eliminar carácter (POP)");
            System.out.println("3. Ver cima de la pila (PEEK)");
            System.out.println("4. Mostrar pila completa");
            System.out.println("5. Verificar si una expresión está balanceada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
                                 //cualuier cosa profe este sigo  -> es el nuevo switch de JAVA para no usar break siempre 
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese un carácter: ");
                    char c = sc.next().charAt(0);
                    pila.push(c);
                }
                case 2 -> pila.pop();
                case 3 -> {
                    char cima = pila.peek();
                    if (cima != '\0') {
                        System.out.println(" Último carácter en la pila: " + cima);
                    }
                }
                case 4 -> pila.mostrarPila();
                case 5 -> {
                    System.out.print("Ingrese una expresión aritmética: ");
                    String expresion = sc.nextLine();
                    boolean balanceada = pila.verificarBalanceo(expresion);
                    if (balanceada) {
                        System.out.println("✅ La expresión está correctamente balanceada.");
                    } else {
                        System.out.println(" La expresión NO está balanceada.");
                    }
                }
                case 0 -> System.out.println(" Saliendo del programa...");
                default -> System.out.println(" Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }

    }
