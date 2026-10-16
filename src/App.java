import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan", "laptop", 15000.0, "juan@gmail.com");
        PedidoService pedidoService = new PedidoService();
        pedidoService.realizar(pedido);
    }
}
