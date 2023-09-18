package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.acme.model.ListaAfazeres;

@ApplicationScoped
public class ListaAfazeresRepository implements PanacheRepository<ListaAfazeres> {

    @Inject
    ListaAfazeresRepository listaAfazeresRepository;

    @Transactional
    public void create(ListaAfazeres listaAfazeres) {
        listaAfazeres.persist();
    }

}
