package aplicacao;

import java.util.Date;

import entidade.Pedido;
import entidade.enums.PedidoStatus;

public class ProgramaEnum {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.PAGAMENTO_PENDENTE);

		System.out.println(pedido);
		
		//Conversao de String para enum
		PedidoStatus os1 = PedidoStatus.ENTREGADO;
		PedidoStatus os2 = PedidoStatus.valueOf("ENTREGADO");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
