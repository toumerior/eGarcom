package br.com.pcsist.mobile.restfood.presenter.cardapio;

import java.util.List;

import br.com.pcsist.mobile.restfood.business.model.Produto;

public interface ExibirCardapioCallback {

    void onListagemDeCardapio(List<Produto> produtos);

    void onListagemDeCardapioError(String error);
}
