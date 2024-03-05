package litaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> listacontatos;

    public Agenda() {
        listacontatos = new ArrayList<>();
    }

    public boolean adicionar(Contato contato) {
        if (!listacontatos.contains(contato) && contato != null) {
            return listacontatos.add(contato);
        }
        return false;
    }

    public boolean remover(Contato contato) {
        if (listacontatos.contains(contato) && contato != null) {
            return listacontatos.remove(contato);
        }
        return false;

    }

    public boolean buscarContato(Contato contato) {
        if (listacontatos.contains(contato) && contato != null) {
            return listacontatos.contains(contato);
        }
        return false;


    }
}
