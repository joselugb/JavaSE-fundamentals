public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelect = "Dark";

        switch (colorModeSelect){
            case "Light":
                System.out.println("Seleccionste Light Mode");
                break;
            case "Night": //Ambar
                System.out.println("Seleccionste Night");
                break;
            case "Blue Dark":
                System.out.println("Seleccionste Blue Dark");
                break;
            case "Dark":
                System.out.println("Seleccionste Dark");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }
    }
}
