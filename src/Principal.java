/*
Readme explicativo con capturas de pantalla del programa y manual de usuario. 2 pts
Pdf con capturas de pantalla y código. 3 pts.
*/

public class Principal {
    public static void main(String[] args) {

        /*Debe crearse una carpeta con la siguiente direccion: C:\POO_NO_ABRIR\*/
        /*LA CONTRASEÑA SERA LOS USUARIOS:
        * Contraseña 1= ErickPalomo
        * Contraseña 2= Usuario2
        * Contraseña 3= Usuario3*/
        int intentos=0;
        int continuar=0;
        boolean salir=false;
        double saldoDiponible=1000;
        double saldoDepositar=0;
        double retirar=0;
        String contraseña="";



        Usuario usuario=new Usuario(saldoDiponible,retirar,saldoDepositar,intentos,continuar,contraseña,intentos,salir,saldoDiponible,saldoDepositar,retirar);
        usuario.MenuUsuario();
    }
}
