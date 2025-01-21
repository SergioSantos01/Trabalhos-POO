
package Controler;

import model.Equipamentos;
import model.Cliente;
import model.Locacao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gestor {

    
    public List<Cliente> getClientes() {
        return clientes;
    }

    
    public List<Locacao> getLocacoes() {
        return locacoes;
    }
    private List<Equipamentos> equipamentos;
    private List<Cliente> clientes;
    private List<Locacao> locacoes;

    public Gestor() {
        this.equipamentos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.locacoes = new ArrayList<>();
    }

    public void cadastrarEquipamento(String nome, String descricao, double valorDiaria, int quantidade) {
        equipamentos.add(new Equipamentos(nome, descricao, valorDiaria, quantidade));
    }

    public List<Equipamentos> getEquipamentosDisponiveis() {
        return equipamentos.stream().filter(Equipamentos::isStatus).toList();
    }

    public void registrarLocacao(String nomeCliente, String cpf, String telefone, List<Equipamentos> equipamentosSelecionados,
                                 LocalDate dataInicio, LocalDate dataFim, double multaPercentual) {
        Cliente cliente = getClientes().stream()
                .filter(c -> c.getCPF().equals(cpf))
                .findFirst()
                .orElseGet(() -> {
                    Cliente novoCliente = new Cliente(nomeCliente, cpf, telefone);
                    getClientes().add(novoCliente);
                    return novoCliente;
                });

        Locacao locacao = new Locacao(cliente, equipamentosSelecionados, dataInicio, dataFim, multaPercentual);
        cliente.adicionarLocacao(locacao);
        getLocacoes().add(locacao);
    }

    public List<Locacao> buscarLocacaoPorCpf(String cpf) {
        return getLocacoes().stream().filter(l -> l.getCliente().getCPF().equals(cpf)).toList();
    }

    public void registrarDevolucao(Locacao locacao, LocalDate dataDevolucao) {
        locacao.getEquipamentos().forEach(e -> e.ajustarQuantidade(1));
        double multa = locacao.calcularMulta(dataDevolucao);
        System.out.printf("Devolução registrada. Multa: R$ %.2f%n", multa);
    }
}

 
