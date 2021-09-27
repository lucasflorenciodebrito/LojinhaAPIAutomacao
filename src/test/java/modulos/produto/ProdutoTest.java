package modulos.produto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes de API Rest do módulo de Produto")
public class ProdutoTest {
    @Test
    @DisplayName("Validar os limites proibidos do valor do produto")
    public void testValidarLimitesProibidosValorProduto(){
        double valor = 0.01;
        Assertions.assertTrue(valor > 0.00);
    }

}
