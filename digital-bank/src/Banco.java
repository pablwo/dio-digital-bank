
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        System.out.println(String.format("======= %s =======", this.nome));

        int i = 1;
        for (Conta conta : contas) {
            System.out.println(
                    String.format("%d - Agencia: %d | Conta: %s | Titular: %s",
                            i++,
                            conta.getAgencia(),
                            conta.getNumero(),
                            conta.getCliente().getNome()));
        }
    }
}
