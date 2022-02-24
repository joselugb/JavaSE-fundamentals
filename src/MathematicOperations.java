public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);//constante PI
        System.out.println(Math.E);//constante Epsilum

        //devuelve un enterio hacia arriba
        System.out.println(Math.ceil(x));

        //devuelve un enterio hacia abajo
        System.out.println(Math.floor(x));

        //devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //area de un circulo
        //pi * r2
        System.out.println(Math.PI * Math.pow(y,2));

        //area de una esfera
        //4*PI*r2
        System.out.println(4*Math.PI * Math.pow(y,2));

        //volumen de un a esfera
        //(4/3)*PI*r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
