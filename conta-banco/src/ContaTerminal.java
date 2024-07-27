public class ContaTerminal {
    private String nome;
    private final String agencia;
    private final int numero;
    private double saldo;

    // Construtor

    public ContaTerminal(String nome, String agencia, int numero, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

        imprimirMensagemDeAbertura();
    }

    private void imprimirMensagemDeAbertura() {
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    // Método para alterar campo nome

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos para acessar os campos

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
