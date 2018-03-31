package br.com.pcsist.mobile.restfood.business.services;

import java.util.List;

import br.com.pcsist.mobile.restfood.business.model.Produto;
import br.com.pcsist.mobile.restfood.business.model.Response;
import br.com.pcsist.mobile.restfood.business.model.Valor;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface ProdutoService {


    @POST("restfood/services/atendimento/iniciarpedido")
    Observable<Response> iniciarPedido();

    @POST("restfood/services/atendimento/listarcardapio")
    Observable<List<Produto>> listarCardapio();

    @POST("restfood/services/atendimento/listarprodutopedido")
    Observable<List<Produto>> listarPedido();

    @POST("restfood/services/atendimento/adicionarproduto")
    Observable<Response> adicionarProdutoAoPedido(@Body Produto produto);

    @POST("restfood/services/atendimento/consultarvalortotaltotalpedido")
    Observable<Valor> consultarValorTotal();
}
