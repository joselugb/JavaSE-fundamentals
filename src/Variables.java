public class Variables {
    public static void main(String[] args) {
        // Declarar la variable speed de tipo int (números enteros)
        int spped;

        // Actualizar el contenido de la variable speed:
        spped = 10; // si ya habías declarado la variable
        System.out.println("Variable spped = "+spped);

        // Declarar una variable y asignarle un valor al mismo tiempo:
        int salary = 1000;
        System.out.println("Variable salary = "+salary);

        // Crear una variable de tipo String:
        String eployeeName = "Anahí Salgado";
        System.out.println("Variable eployeeName = "+eployeeName);

        int numInt = 123456789;
        long numLong = 1234567890L;

        double numDouble = 123.456;
        float numFloat = 123.456F;

        var salaryVar = 1090; //int
        var pension = salaryVar * 0.0945; //double
        var totalSalary = salary - pension;//double

        var employeeName = "JOSE LUIS";
    }
}
