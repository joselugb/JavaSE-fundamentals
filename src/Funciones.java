public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        /*
        * varias lineas
        * */

        /**
         * Para usarse en documentacion
         * */

        //double area = circleArea(y);
        System.out.println(circleArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolumen(y));

        System.out.println("PESOS MXN A DOLARES: " + convertToDolar(22856,"MXN"));
        System.out.println("PESOS COP A DOLARES: " + convertToDolar(45365789,"COP"));

    }
    public static double circleArea(double r){
        return (Math.PI * Math.pow(r,2));
    }
    public static double sphereArea(double r){
        return (4*Math.PI * Math.pow(r,2));
    }
    public static double sphereVolumen(double r){
        return ((4/3) * Math.PI * Math.pow(r,3));
    }
/**
 * Descripcion: funcion que especificando la moneda convierte una cantidad de diner a dolares
 *
 * @param quantity Cantidad de dinero
 * @param  currency Tipo de Moneda: Solo acepta MXN o COP
 * @return quantity Devuelve la conversion de valores
 * */
    public static double convertToDolar(double quantity, String currency){
        //MXNCOP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.049;
                break;
            case "COP":
                quantity = quantity * 0.00025;
                break;
        }
        return quantity;
    }
}
