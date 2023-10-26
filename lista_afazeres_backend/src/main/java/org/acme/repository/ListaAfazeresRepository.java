package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.model.ListaAfazeres;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class ListaAfazeresRepository implements PanacheRepository<ListaAfazeres> {

    @Inject
    ListaAfazeresRepository listaAfazeresRepository;

    @Transactional
    public List<ListaAfazeres> create(ListaAfazeres listaAfazeres) {
        listaAfazeres.persist();
        List<ListaAfazeres> listaItens = new ArrayList<>();
        listaItens.add(listaAfazeres);
        return listaItens;
    }

}
