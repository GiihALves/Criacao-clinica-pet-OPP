package CadastroPet;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class Responsavel {
    String nome;
    String sobrenome;
    String cep;
    String numeroResidencial;
    int idade;
    String email;
    String telefone;

    public Responsavel(String nome, String sobrenome, String cep, String numeroResidencial, int idade, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cep = cep;
        this.numeroResidencial = numeroResidencial;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

        public void retornarDsdosBasicos(){
            if (nome == "Jefferson"){
                System.out.println("Esse cara é do bem");
            }
            System.out.println("Nome: " + nome + "\n" + "E-mail: " +email);
    }

    public String retornarTodosDados() {
        return "Responsavel{" +
                "nome='" + nome + '\n' +
                ", sobrenome='" + sobrenome + '\n' +
                ", cep='" + cep + '\n' +
                ", numeroResidencial='" + numeroResidencial + '\n' +
                ", idade=" + idade +
                ", email='" + email + '\n' +
                ", telefone='" + telefone + '\n'+
                '}';
    }
    public boolean verificarMenorIdade(int idade){
            if(idade >=18);
            return true;
        }
    }

