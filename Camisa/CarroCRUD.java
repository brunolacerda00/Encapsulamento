import java.util.ArrayList;
import java.util.List;

public class CarroCRUD {
    private List<Carro> carros;

    public CarroCRUD() {
        carros = new ArrayList<>();
    }

    // Create (Adicionar um novo carro)
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    // Read (Mostrar todos os carros)
    public void mostrarCarros() {
        if (carros.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carro carro : carros) {
                carro.exibirInfo();
            }
        }
    }

    // Update (Atualizar os atributos de um carro específico)
    public void atualizarCarro(int index, String marca, String modelo, int anoFabricacao) {
        if (index >= 0 && index < carros.size()) {
            Carro carro = carros.get(index);
            carro.setMarca(marca);
            carro.setModelo(modelo);
            carro.setAnoFabricacao(anoFabricacao);
            System.out.println("Carro atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Delete (Excluir um carro pelo índice)
    public void excluirCarro(int index) {
        if (index >= 0 && index < carros.size()) {
            carros.remove(index);
            System.out.println("Carro excluído com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
