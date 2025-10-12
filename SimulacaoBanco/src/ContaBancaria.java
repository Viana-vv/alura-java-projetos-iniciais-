import javax.swing.plaf.PanelUI;

public class ContaBancaria{
   private double Saldo ;
    private double depositar;
private double sacar;



    public ContaBancaria() {
        this.Saldo = 100.0;
    }

    public ContaBancaria(double saldoInicial) {
        this.Saldo = saldoInicial;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            Saldo += valor;
        }
    }

    public double getSacar() {
        return sacar;
    }
public void sacar(double valor){
        if(valor > 0 ){
            Saldo -= valor;
        }
}

}
