import java.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.logging.Logger;

public class Usuario extends Cajero{
    private int intentos=0;
    private boolean salir=false;
    private double saldoDiponible=1000;
    private double saldoDepositar=0;
    private double retirar=0;

    public Usuario(double dineroDisponible, double dineroRetirar, double dineroDepositar, int intentoContraseña, int continuar, String contraseña, int intentos, boolean salir, double saldoDiponible, double saldoDepositar, double retirar) {
        super(dineroDisponible, dineroRetirar, dineroDepositar, intentoContraseña, continuar, contraseña);
        this.intentos = intentos;
        this.salir = salir;
        this.saldoDiponible = saldoDiponible;
        this.saldoDepositar = saldoDepositar;
        this.retirar = retirar;
    }

    public Usuario(double dineroDisponible, double dineroRetirar, double dineroDepositar, int intentoContraseña, int continuar, String contraseña) {
        super(dineroDisponible, dineroRetirar, dineroDepositar, intentoContraseña, continuar, contraseña);

    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }

    public double getSaldoDiponible() {
        return saldoDiponible;
    }

    public void setSaldoDiponible(double saldoDiponible) {
        this.saldoDiponible = saldoDiponible;
    }

    public double getSaldoDepositar() {
        return saldoDepositar;
    }

    public void setSaldoDepositar(double saldoDepositar) {
        this.saldoDepositar = saldoDepositar;
    }

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public void MenuUsuario() {

        boolean salir = false;
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        String clave;

try {
    String filePath= "C:\\POO_NO_ABRIR\\UsuarioCajero.txt";
    FileWriter fw=new FileWriter(filePath, true);
    String lineToAppend ="";
    fw.write(lineToAppend);
    do {

        System.out.println("=================Bienvenido al cajero automatico================");
        System.out.println("Dijite su contraseña: "); //La contraseña sera de los usuarios
        clave=teclado.next();
        fw.write("Usuario : "+clave+"\n");

        if (clave.equals("ErickPalomo")||clave.equals("Usuario2")||clave.equals("Usuario3")){
            while (!salir){

                System.out.println("=======CAJERO AUTOMATICO BIENVENIDO======");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Consultar");
                System.out.println("4. Salir");
                System.out.print("Dijite una opcion: ");
                op=teclado.nextInt();
                switch (op){

                    case 1:
                        System.out.println("Dijite la cantidad de dinero a depositar: ");
                        saldoDepositar=teclado.nextInt();
                        fw.write("Saldo usuario: "+saldoDiponible+"\n");
                        fw.write("Dinero depositado por el usuario: "+saldoDepositar+"\n");
                        saldoDiponible=saldoDiponible+saldoDepositar;
                        System.out.println("Su saldo actual es: "+saldoDiponible);
                        fw.write("Dinero despues del deposito: "+saldoDiponible+"\n");
                        System.out.println("Depositaste: "+saldoDepositar);
                        break;
                    case 2:
                        System.out.println("Dijite el dinero a retirar: ");
                        retirar=teclado.nextDouble();
                        fw.write("Dinero Retirado: "+retirar+"\n");
                        if (saldoDiponible<retirar){

                            System.out.println("No posees es cantidad intentalo :(");
                        } else if (saldoDiponible>retirar&&saldoDiponible==retirar) {
                            saldoDiponible=saldoDiponible-retirar;
                            System.out.print("Usted retiro: "+retirar);
                            System.out.println("Su saldo es: "+saldoDiponible);
                            fw.write("Dinero despues del retiro: "+saldoDiponible+"\n");
                        }

                        break;
                    case 3:
                        System.out.println("Su saldo actual es: "+saldoDiponible);
                        fw.write("Saldo Actual: "+saldoDiponible+"\n");
                        break;
                    case 4:
                        setContinuar(1);
                        salir=true;
                        System.out.println("Gracias :)");
                        break;
                    default:

                }
            }

        }

        else {
            System.out.println("****************************************");
            System.out.println("La contraseña es incorrecta :(");
            intentos++;
        }


    }while (getContinuar()==0);
    fw.close();

}catch (IOException ex){

    System.out.println("No se encontro el archivo txt");
}

    }
}
