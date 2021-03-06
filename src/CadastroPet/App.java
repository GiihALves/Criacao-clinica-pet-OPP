package CadastroPet;

public class App {
    public static void main(String[] args) {
        Responsavel pessoa = new Responsavel(
                "Gislaine",
                "Alves",
                "04852-506",
                "03",
                23,
                "gislaaineealves@gmail.com",
                "11 99275-6559"
        );

        System.out.println(pessoa.getCep());
        System.out.println(pessoa.getEmail());
        System.out.println(pessoa.getTelefone());


        Pet animal = new Pet(
                "Thor",
                "Cachorro",
                "Vira-lata",
                5,
                "Amarelo",
                pessoa,
                Pet.TiposCuidado.Fisioterapia.toString()
        );

        pessoa.retornarDsdosBasicos();

        animal.retornarDadosPet();

        System.out.println(animal.dono.retornarTodosDados());
        System.out.println(animal.retornarDadosPet());
        System.out.println(pessoa.getIdade());



    }
}
