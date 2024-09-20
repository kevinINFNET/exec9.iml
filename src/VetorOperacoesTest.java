import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class VetorOperacoesTest {
    private VetorOperacoes vetorOperacoes;
    private int[] vetor1;
    private int[] vetor2;

    @BeforeEach
    public void setUp() {
        vetorOperacoes = new VetorOperacoes();
        vetor1 = new int[]{5, 4, 3, 2, 1};
        vetor2 = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testSomarVetor() {
        int numero = 3;
        int[] resultadoEsperado = {8, 7, 6, 5, 4};
        int[] resultado = vetorOperacoes.somarVetor(vetor1, numero);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSomarVetorComZero() {
        int numero = 0;
        int[] resultadoEsperado = {5, 4, 3, 2, 1};
        int[] resultado = vetorOperacoes.somarVetor(vetor1, numero);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testOrdenarVetor() {
        int[] resultadoEsperado = {1, 2, 3, 4, 5};
        int[] resultado = vetorOperacoes.ordenarVetor(vetor1);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testOrdenarVetorJaOrdenado() {
        int[] vetorOrdenado = {1, 2, 3, 4, 5};
        int[] resultadoEsperado = {1, 2, 3, 4, 5};
        int[] resultado = vetorOperacoes.ordenarVetor(vetorOrdenado);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSomarVetores() {
        int[] resultadoEsperado = {6, 6, 6, 6, 6};
        int[] resultado = vetorOperacoes.somarVetores(vetor1, vetor2);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSomarVetoresComTamanhosDiferentes() {
        int[] vetorDiferente = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            vetorOperacoes.somarVetores(vetor1, vetorDiferente);
        });
    }

    @Test
    public void testObterNumerosPares() {
        int[] vetor = {1, 2, 3, 4, 5};
        List<Integer> resultadoEsperado = Arrays.asList(2, 4);
        List<Integer> resultado = vetorOperacoes.obterNumerosPares(vetor);
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testObterNumerosParesComVetorSemPares() {
        int[] vetor = {1, 3, 5, 7, 9};
        List<Integer> resultadoEsperado = Arrays.asList();
        List<Integer> resultado = vetorOperacoes.obterNumerosPares(vetor);
        assertEquals(resultadoEsperado, resultado);
    }
}
