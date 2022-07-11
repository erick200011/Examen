public class Cajero {
    private double DineroDisponible=10000;
    private double DineroRetirar;
    private  double DineroDepositar;
    private int intentoContraseña=0;
    private int continuar=0;
    String contraseña;

    public Cajero(double dineroDisponible, double dineroRetirar, double dineroDepositar, int intentoContraseña, int continuar, String contraseña) {
        DineroDisponible = dineroDisponible;
        DineroRetirar = dineroRetirar;
        DineroDepositar = dineroDepositar;
        this.intentoContraseña = intentoContraseña;
        this.continuar = continuar;
        this.contraseña = contraseña;
    }

    public double getDineroDisponible() {
        return DineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        DineroDisponible = dineroDisponible;
    }

    public double getDineroRetirar() {
        return DineroRetirar;
    }

    public void setDineroRetirar(double dineroRetirar) {
        DineroRetirar = dineroRetirar;
    }

    public double getDineroDepositar(double v) {
        return DineroDepositar;
    }

    public void setDineroDepositar(double dineroDepositar) {
        DineroDepositar = dineroDepositar;
    }

    public int getIntentoContraseña() {
        return intentoContraseña;
    }

    public void setIntentoContraseña(int intentoContraseña) {
        this.intentoContraseña = intentoContraseña;
    }

    public int getContinuar() {
        return continuar;
    }

    public void setContinuar(int continuar) {
        this.continuar = continuar;
    }

    public String getContraseña(String next) {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
