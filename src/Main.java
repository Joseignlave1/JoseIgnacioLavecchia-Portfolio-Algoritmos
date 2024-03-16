//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int i = 3;
        i++; // 3 + 1 = 4;
        System.out.println(i); // 4
        ++i; // 5
        System.out.println(i); // 5
        System.out.println(++i); // 6 acá primero incrementamos el valor de i, y después lo imprimimos
        System.out.println(i++); // 6, primero se imprime el valor de i, entonces i = 6; y después se incrementa
        System.out.println(i);  // 7
    }

}