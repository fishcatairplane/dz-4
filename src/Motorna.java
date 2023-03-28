public class Motorna {
    public int MotornaPrint = 29;

    public int print() {
        String newValue = String.format ("\"---<%d>---\"%n", MotornaPrint);
        System.out.println (newValue);

        return MotornaPrint;
    }
}



