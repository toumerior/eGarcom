package br.com.pcsist.mobile.restfood.presenter.pedido;

import br.com.pcsist.mobile.restfood.business.model.Valor;

public interface ConsultarValorDoPedidoCallback {

    void valorConsultado(Valor valor);
    void onConsultarError(String error);
}
