public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    // Construtor
    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Carro - Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao);
    }
}
