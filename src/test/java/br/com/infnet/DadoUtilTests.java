package br.com.infnet;

import br.com.infnet.util.DadoUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DadoUtilTests {
    @Test
    public void teste1() {
        DadoUtil dadoUtil = new DadoUtil();
        for(int i = 0; i < 1000; i++) {
            int valorDoDado = dadoUtil.rollD10();
            assertTrue(valorDoDado <= 10);
        }
    }
    @Test
    public void teste2() {
        DadoUtil dadoUtil = new DadoUtil();
        for(int i = 0; i < 1000; i++) {
            int valorDoDado = dadoUtil.rollD6();
            assertTrue(valorDoDado <= 6);
        }
    }
}
