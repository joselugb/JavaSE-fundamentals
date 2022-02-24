public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono 200
        salary = salary + 200; //bono
        System.out.println("EL sueldo + bono es: "+salary+" USD");
        salary = salary - 50; //pension
        System.out.println("EL sueldo + bono - pension es: "+salary+" USD");
        salary = salary + (30*2) - 45;//dos horas extras - comida
        System.out.println("EL sueldo + bono  - pension + 2 horas extras - comida es: "+salary+" USD");

        //nombre del empleado
        String employeeName = "Jose Luis Gavilanes";
        employeeName = employeeName + " Blacio";
        System.out.println("Nombre del colaborador: "+employeeName);
    }
}
