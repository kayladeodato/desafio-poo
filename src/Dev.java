public class Dev {

    private String nome;
    private String conteudosInscritos;
    private String conteudosConcluidos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(String conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public String getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(String conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos='" + conteudosInscritos + '\'' +
                ", conteudosConcluidos='" + conteudosConcluidos + '\'' +
                '}';
    }

    //metodos: inscrever, progredir e calcular total xp
}
