package dataFactory;

import pojo.ComponentPojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Play Station 5");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentPojo>  componentes = new ArrayList<>();

        ComponentPojo componente = new ComponentPojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(1);

        ComponentPojo segundoComponente = new ComponentPojo();
        segundoComponente.setComponenteNome("Memory card");
        segundoComponente.setComponenteQuantidade(2);

        componentes.add(componente);
        componentes.add(segundoComponente);
        produto.setComponentes(componentes);

        return produto;
    }
}
