import java.util.ArrayList;
import java.util.List;

public class CamisaCRUD {
    private List<Camisa> camisas;

    public CamisaCRUD() {
        camisas = new ArrayList<>();
    }

    // Create (Adicionar uma nova camisa)
    public void adicionarCamisa(Camisa camisa) {
        camisas.add(camisa);
    }

    // Read (Mostrar todas as camisas)
    public void mostrarCamisas() {
        if (camisas.isEmpty()) {
            System.out.println("Nenhuma camisa cadastrada.");
        } else {
            for (Camisa camisa : camisas) {
                camisa.exibirInfo();
            }
        }
    }

    // Update (Atualizar os atributos de uma camisa específica)
    public void atualizarCamisa(int index, String cor, String tamanho, String tipo) {
        if (index >= 0 && index < camisas.size()) {
            Camisa camisa = camisas.get(index);
            camisa.setCor(cor);
            camisa.setTamanho(tamanho);
            camisa.setTipo(tipo);
            System.out.println("Camisa atualizada com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Delete (Excluir uma camisa pelo índice)
    public void excluirCamisa(int index) {
        if (index >= 0 && index < camisas.size()) {
            camisas.remove(index);
            System.out.println("Camisa excluída com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
