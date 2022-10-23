package br.com.thomazpoentes.springbootcommysql.viacep;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViaCEPChamada implements ViaCEPEvents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ViaCEPChamada().run();
    }

    public void run() {
        ViaCEP viaCEP = new ViaCEP(this);
        String cep;
        Scanner scan = new Scanner(System.in);





        System.out.println(ViaCEPChamada.class.getName() + " - digite sair para fechar o teste!");

        do {
            System.out.print("Digite um cep: ");
            cep = scan.next();
            // consulta
            if (!cep.equals("sair")) {
                try {
                    viaCEP.buscar(cep);
                } catch (ViaCEPException ex) {
                    System.err.println("Ocorreu um erro na classe " + ex.getClasse() + ": " + ex.getMessage());
                }
            }
        } while (!cep.equals("sair"));
    }

    public void onCEPSuccess(ViaCEP cep) {
        List<String> viaCepList = new ArrayList<>();
        System.out.println();
        System.out.println("CEP " + cep.getCep() + " encontrado!");
        viaCepList.add(cep.getCep());

        System.out.println("Logradouro: " + cep.getLogradouro());
        viaCepList.add(cep.getLogradouro());

        System.out.println("Complemento: " + cep.getComplemento());
        viaCepList.add(cep.getComplemento());

        System.out.println("Bairro: " + cep.getBairro());
        viaCepList.add(cep.getBairro());

        System.out.println("Localidade: " + cep.getLocalidade());
        viaCepList.add(cep.getLocalidade());

        System.out.println("UF: " + cep.getUf());
        viaCepList.add(cep.getUf());

        System.out.println("Gia: " + cep.getGia());
        viaCepList.add(cep.getGia());

        System.out.println("Ibge: " + cep.getIbge());
        viaCepList.add(cep.getIbge());
        System.out.println();
        System.out.println(viaCepList);
    }

    public void onCEPError(String cep) {
        System.out.println();
        System.out.println("Não foi possível encontrar o CEP " + cep + "!");
        System.out.println();
    }

}
