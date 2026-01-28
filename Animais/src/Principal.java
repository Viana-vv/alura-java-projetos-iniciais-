//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import br.com.animais.Animais;
import br.com.animais.Cachorro;
import br.com.animais.Gato;

public class Principal {
    public static void main(String[] args) {
        int acontecimentos = 0;
        int acontecimentosDoGato = 0;
        int necessidadesDoCachorro = 0;
        int necessidadesDoGato = 0;
        Animais cachorro = new Animais();
        Cachorro cachorroAcao = new Cachorro();
        cachorro.setNome("Bob");
        cachorro.setBarulho("latido");
        cachorro.setComer("Comeu ração");
        cachorro.setCorrer("Correu pela casa");
        cachorro.setDeitar("Deitou na casinha!");
        cachorro.setPular("Pulou pelos sofás");
        cachorro.setNecessidades("Fez as necessidades");
cachorroAcao.getAcao();


        Animais gato = new Animais();
        Gato gatoAcao = new Gato();
        gato.setNome("Tom");
        gato.setPular("Pulou entre os sofás");
        gato.setBarulho("Miado");
        gato.setCorrer("Correu pela casa");
        gato.setComer("comeu a ração");
        gato.setNecessidades("fez as necessidades");
        gato.setDeitar("Deitou no sofá");
gatoAcao.getAcao();
        System.out.println("Ações dos animais pela manhã!");
        System.out.println("\nO " + cachorro.getNome() + " Fez pela manhã");

        //ações do cachorro
        while (acontecimentos < 7 ) {
            int numeroSorteado = (int) (Math.random() * 8);
            switch (numeroSorteado) {
                case 0:
                    System.out.println("Ficou quieto por 1 hora");
                    acontecimentosDoGato++;
                    break;
                case 1:
                    System.out.println(cachorro.getComer());
                    acontecimentos++;
                    break;
                case 2:
                    System.out.println(cachorro.getBarulho());
                    acontecimentos++;
                    break;
                case 3:
                    System.out.println(cachorro.getCorrer());
                    acontecimentos++;
                    break;
                case 4:
                    System.out.println(cachorro.getDeitar());
                    acontecimentos++;
                    break;
                case 5:
                    System.out.println(cachorro.getPular());
                    acontecimentos++;
                    break;
                case 6:
                    if(necessidadesDoCachorro < 1){
                        System.out.println(cachorro.getNecessidades());
                        necessidadesDoCachorro++;
                        acontecimentos++;
                    }else{
                        System.out.println("Bebeu água");
                    }

                    break;

                default:
                    System.out.println(cachorroAcao.getAcao());
                    acontecimentos++;
                    break;
            }

        }
        System.out.println("\nO que fez o " + gato.getNome() + " pela manhã");
        //ações do cachorro
        while (acontecimentosDoGato < 7 ) {
            int numeroSorteado = (int) (Math.random() * 8);
            switch (numeroSorteado) {
                case 0:
                    System.out.println("Ficou quieto por 1 hora");
                    acontecimentosDoGato++;
                    break;
                case 1:
                    System.out.println(gato.getComer());
                    acontecimentosDoGato++;
                    break;
                case 2:
                    System.out.println(gato.getBarulho());
                    acontecimentosDoGato++;
                    break;
                case 3:
                    System.out.println(gato.getCorrer());
                    acontecimentosDoGato++;
                    break;
                case 4:
                    System.out.println(gato.getDeitar());
                    acontecimentosDoGato++;
                    break;
                case 5:
                    System.out.println(gato.getPular());
                    acontecimentosDoGato++;
                    break;
                case 6:
                    if(necessidadesDoCachorro < 1){
                        System.out.println(gato.getNecessidades());
                        necessidadesDoGato++;
                        acontecimentos++;
                    }else{
                        System.out.println("Bebeu água");
                    }

                    break;
                default:
                    System.out.println(gatoAcao.getAcao());
                    acontecimentosDoGato++;
                    break;
            }
        }
    }

}
