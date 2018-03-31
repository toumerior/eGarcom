package br.com.pcsist.mobile.restfood.presenter.pedido;

import java.util.List;

import br.com.pcsist.mobile.restfood.business.model.Produto;
import br.com.pcsist.mobile.restfood.business.model.Response;

public interface AdicionarProdutoAoPedidoCallback {

    void onProdutoAdicionado(Response response);
    void onAdicionarProdutoError(String error);
}
