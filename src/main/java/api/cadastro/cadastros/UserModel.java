package api.cadastro.cadastros;
import jakarta.persistence.*;

@Entity//Transformando a classe em uma entidade no DB
@Table(name = "tb_cadastro")//nome da tabela/ tb no começo do nome é uma boa prática e usamos o padrão snake case tbm
public class UserModel {

    @Id//usado para informar que a variavel abaixo é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//usado para informar qual é a estratégia para guardar o ID
    Long id;
    String name;
    String email;
    int age;
    String cep;

    public UserModel() {
    }

    public UserModel(String name, String email, int age, String cep) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.cep = cep;
    }
}
