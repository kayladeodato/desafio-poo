package br.com.faculdade.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nCurso: " + getTitulo() + '\n' +
                "Descricao: " + getDescricao() + '\n' +
                "Carga Horaria: " + cargaHoraria + " horas ";
    }

}
