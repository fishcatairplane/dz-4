public class Main {
    public static void main(String[] args) {
        Motorna MotornaPrint = new Motorna();
        int PrintValue = MotornaPrint.print();
        String newValue = String.format ("\"~~~ <%d> ~~~\"%n", PrintValue);
        System.out.println(newValue);

    }
}