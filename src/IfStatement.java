public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Favor encender el Bluetooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
