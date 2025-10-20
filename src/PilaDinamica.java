import java.util.ArrayList;

public class PilaDinamica {
    //  Atributos
    private final ArrayList<Character> pila; // lista dinámica para la pila

    //  Constructor
    public PilaDinamica() {
        pila = new ArrayList<>(); // se inicializa vacía
    }

    // Metodo para insertar un elemento (PUSH)
    public void push(char nuevoCaractater){
        pila.add(nuevoCaractater);
        System.out.println("Caracter" + nuevoCaractater + "insertado en la pila");
    }

    // Metodo para sacar el ultimo elemeto
    public char pop(){
        if (estaVacia()){
            System.out.println("La pila esta vacia inserte un elemento");
        }
        return pila.remove(pila.size() -1);
    }

    // Metodo para ver el ultimo elemento sin eliminarlo
    public char peek(){
        if (estaVacia()){
            System.out.println("La pila esta vacia, no se puede ver el ultimo elemento");
        }
        return pila.get(pila.size() - 1);
    }

    //  Muestra el contenido completo de la pila
    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("📭 La pila está vacía.");
        } else {
            System.out.println("📚 Contenido actual de la pila: " + pila);
        }
    }
    public boolean verificarBalanceo(String expresion) {
        PilaDinamica pilaAux = new PilaDinamica();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pilaAux.push(c);
            } else if (c == ')') {
                if (pilaAux.estaVacia()) {
                    return false; // hay un ')' sin su '('
                }
                pilaAux.pop();
            }
        }
        return pilaAux.estaVacia(); // si queda vacía, está balanceada
    }


    // 🔹 Devuelve el tamaño actual de la pila
    public int getTamanio() {
        return pila.size();
    }

    // 🔹 Verifica si la pila está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }
}
