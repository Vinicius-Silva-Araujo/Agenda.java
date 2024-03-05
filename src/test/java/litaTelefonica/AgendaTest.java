package litaTelefonica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {
    private Agenda agenda;
    private Contato ct1;
    private Contato ct2;

    @BeforeEach
    void setUp() {
        agenda = new Agenda();
        ct1 = new Contato("Vincius", "62-992302894", "vini@g.com");
        ct2 = new Contato("Silva", "62-992302894", "Silva@g.com");

    }

    @Test
    @DisplayName("Testa adicionar contato")
    void adicionar() {
        // adicionar contato
        boolean add1 = agenda.adicionar(ct1);
        boolean add2 = agenda.adicionar(ct2);
        // assertiva
        assertTrue(add1);
        assertTrue(add2);
    }

    @Test
    @DisplayName("Testa adicionar contato nulo")
    void adicionarnulo() {
        // adicionar contato
        boolean add1 = agenda.adicionar(ct2);
        boolean add2 = agenda.adicionar(ct2);

        // assertiva
        assertTrue(add1);
        assertFalse(add2);
    }

    @Test
    @DisplayName("Testa adicionar contato que ja existe")
    void adicionarJaExistente() {
        // adicionar contato
        boolean add1 = agenda.adicionar(null);
        boolean add2 = agenda.adicionar(ct2);
        // assertiva
        assertFalse(add1);
        assertTrue(add2);
    }

    @Test
    @DisplayName("Remover contato da lista")
    void remover() {
        // adicionar contato
        agenda.adicionar(ct1);
        agenda.adicionar(ct2);
        // remove contato
        agenda.remover(ct1);
        // assertiva
        assertTrue(agenda.adicionar(ct1));
        assertTrue(agenda.remover(ct1));
    }

    @Test
    @DisplayName("Busca contato na lista")
    void bucarContato() {
        // adicionar contato
        boolean add1 = agenda.adicionar(ct1);
        // busca contato
        agenda.buscarContato(ct1);
        // assertiva
        assertTrue(add1);
        assertTrue(agenda.buscarContato(ct1));

    }

    @Test
    @DisplayName("Busca contato na lista que nao existe")
    void bucarContatoinexistente() {
        // adicionar contato
        boolean add1 = agenda.adicionar(ct1);
        // busca contato
        agenda.buscarContato(ct1);
        // assertiva
        assertTrue(add1);
        assertFalse(agenda.buscarContato(ct2));

    }
}