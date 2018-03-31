package br.com.pcsist.mobile.restfood.presenter.pedido;

import java.util.List;

import br.com.pcsist.mobile.restfood.business.model.Produto;

public interface ListarPedidoCallback {

    void onListagemDePedidoRecebida(List<Produto> produtos);
    void onListarPedidoError(String error);
}
