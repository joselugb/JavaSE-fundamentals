public class Casting {
    public static void main(String[] args) {
        //en un año ubicar 30 perritos
        //cuantos serian al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //exactitud
        int a = 30; int b = 12;
        System.out.println((double)a/b);

        char n = '1';
        int nI = n;

        System.out.println(nI);//imprime el #ASCII de 1

        short nS = (short) n;
        System.out.println(nS);
    }
}
