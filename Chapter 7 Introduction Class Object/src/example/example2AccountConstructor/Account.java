package example.example2AccountConstructor;

/*
  Variaveis de Instancia
  Mantem os dados de cada instancia (ocorrencia daquela classe)

* Modificador de Acesso
*
  Encapsulamento
  O acesso as variaveis de intancia sao feitos a partir de metodos
  nao se deve dar acesso direto as variaveis de instancia
* */

public class Account {
    private String name;

    // construtor que inicializa name atraves do parametro name
    public Account(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
