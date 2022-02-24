public class PracticaOne {
    public static void main(String[] args) {
        //char c = ‘z’; conviertelo a int
        char c = 'z';
        System.out.println((int) c);

        //int i = 250; conviertelo a long y luego de long a short
        int i = 250;
        long j = (long) i;
        System.out.println(j);
        short k = (short) j;
        System.out.println(k);

        //double d = 301.067; conviertelo a long
        double d = 301.067;
        System.out.println((long) d);

        //int i = 100; súmale 5000.66 y conviertelo a float
        int iI = 100; iI += 5000.66;
        System.out.println((float) iI);

        //int i = 737; multiplícalo por 100 y conviertelo a byte
        int iII = 737;
        iII = iII * 100; byte nB; nB = (byte)iII;
        System.out.println(nB);

        //double d = 298.638; divídelo entre 25 y conviertelo a long
        double dL = 298.638;
        dL /= 25;
        System.out.println((long)dL);

        byte x = 1;
        byte y = 1;
        byte z = (byte) (i+j);
        System.out.println(z);
    }
}
