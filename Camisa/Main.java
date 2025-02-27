public class Main {
    public static void main(String[] args) {
        // Operações com Camisa
        System.out.println("------ CAMISAS ------");
        CamisaCRUD camisaCRUD = new CamisaCRUD();
        
        // Criando e adicionando camisas
        camisaCRUD.adicionarCamisa(new Camisa("Azul", "M", "Polo"));
        camisaCRUD.adicionarCamisa(new Camisa("Preta", "G", "Social"));
        
        // Exibindo todas as camisas
        System.out.println("Camisas cadastradas:");
        camisaCRUD.mostrarCamisas();
        
        // Atualizando uma camisa
        camisaCRUD.atualizarCamisa(0, "Verde", "M", "Polo");
        
        // Exibindo as camisas após a atualização
        System.out.println("Camisas após atualização:");
        camisaCRUD.mostrarCamisas();
        
        // Excluindo uma camisa
        camisaCRUD.excluirCamisa(1);
        
        // Exibindo as camisas após a exclusão
        System.out.println("Camisas após exclusão:");
        camisaCRUD.mostrarCamisas();
        
        // Operações com Carro
        System.out.println("\n------ CARROS ------");
        CarroCRUD carroCRUD = new CarroCRUD();
        
        // Criando e adicionando carros
        carroCRUD.adicionarCarro(new Carro("Honda", "Civic", 2020));
        carroCRUD.adicionarCarro(new Carro("Ford", "Fusion", 2018));
        
        // Exibindo todos os carros
        System.out.println("Carros cadastrados:");
        carroCRUD.mostrarCarros();
        
        // Atualizando um carro
        carroCRUD.atualizarCarro(0, "Toyota", "Corolla", 2021);
        
        // Exibindo os carros após a atualização
        System.out.println("Carros após atualização:");
        carroCRUD.mostrarCarros();
        
        // Excluindo um carro
        carroCRUD.excluirCarro(1);
        
        // Exibindo os carros após a exclusão
        System.out.println("Carros após exclusão:");
        carroCRUD.mostrarCarros();
    }
}
