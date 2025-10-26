
import java.time.LocalDate;

public class Tarefas {
    private int id;
    private LocalDate data_tarefa;
    private String descricao_tarefa;
    private String observacao;
    private Prioridade prioridade;
    private Responsavel responsavel;

    public Tarefas() {
    }

    public Tarefas(int id, LocalDate data_tarefa, String descricao_tarefa, String observacao, Prioridade prioridade, Responsavel responsavel) {
        this.id = id;
        this.data_tarefa = data_tarefa;
        this.descricao_tarefa = descricao_tarefa;
        this.observacao = observacao;
        this.prioridade = prioridade;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_tarefa() {
        return data_tarefa;
    }

    public void setData_tarefa(LocalDate data_tarefa) {
        this.data_tarefa = data_tarefa;
    }

    public String getDescricao_tarefa() {
        return descricao_tarefa;
    }

    public void setDescricao_tarefa(String descricao_tarefa) {
        this.descricao_tarefa = descricao_tarefa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public void salvarTarefas() {
        System.out.println("Salvando tarefas: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    public void alterarTarefas() {
        System.out.println("Alterando prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    public void excluirTarefas() {
        System.out.println("Excluindo prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    public void pesquisarTarefas() {
        System.out.println("Pesquisando prioridade: ID=" + this.id + ", Descrição=" + this.descricao_tarefa);
    }
    

}
