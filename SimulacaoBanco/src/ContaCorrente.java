public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 0.10;

    public void saldoComTarifa(){
        if(getSaldo() > tarifaMensal){
            setSaldo(getSaldo() - tarifaMensal);
        }else{
            System.out.println("Valor insuficiente para cobrar a tarifa!");
        }

    }
}

