package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.ListaAfazeres;
import org.acme.repository.ListaAfazeresRepository;

@ApplicationScoped
public class ListaAfazeresService {

    @Inject
    ListaAfazeresRepository listaAfazeresRepository;

    public void createItemAfazeres(ListaAfazeres listaAfazeres) {
        listaAfazeresRepository.create(listaAfazeres);
    }
}
