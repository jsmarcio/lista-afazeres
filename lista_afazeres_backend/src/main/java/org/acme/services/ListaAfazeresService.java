package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.model.ListaAfazeres;
import org.acme.repository.ListaAfazeresRepository;

import java.util.List;

@ApplicationScoped
public class ListaAfazeresService {

    @Inject
    ListaAfazeresRepository listaAfazeresRepository;

    public List<ListaAfazeres> createItemAfazeres(ListaAfazeres listaAfazeres) {
        return listaAfazeresRepository.create(listaAfazeres);
    }
}
