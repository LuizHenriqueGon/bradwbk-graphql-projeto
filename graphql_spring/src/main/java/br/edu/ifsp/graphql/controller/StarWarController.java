package br.edu.ifsp.graphql.controller;

import br.edu.ifsp.graphql.model.*;
import br.edu.ifsp.graphql.model.Character; // Garante o uso da sua Interface
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class StarWarController {

    // Armazenamento em memória (Simulando Banco de Dados)
    private final List<Human> humans = new ArrayList<>();
    private final List<Droid> droids = new ArrayList<>();
    private final List<Starship> starships = new ArrayList<>();

    // --- IMPLEMENTAÇÃO DAS QUERIES (Pág. 40) ---

    @QueryMapping
    public List<Human> humans() {
        return humans; // Retorna a lista de humanos cadastrados [cite: 1145]
    }

    @QueryMapping
    public List<Starship> starships() {
        return starships; // Retorna a lista de naves cadastradas [cite: 1145]
    }

    @QueryMapping
    public Character character(@Argument String id) {
        // Busca em ambas as listas para encontrar o personagem [cite: 1146]
        Optional<Human> h = humans.stream().filter(u -> u.getId().equals(id)).findFirst();
        if (h.isPresent()) return h.get();
        
        return droids.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    // --- IMPLEMENTAÇÃO DAS MUTATIONS (Pág. 41) ---

    @MutationMapping
    public Human createHuman(@Argument String id, @Argument String name, @Argument Float height) {
        // Inicializa com listas vazias para evitar NullPointerException [cite: 1151]
        Human h = new Human(id, name, new ArrayList<>(), new ArrayList<>(), height);
        humans.add(h);
        return h;
    }

    @MutationMapping
    public Droid createDroid(@Argument String id, @Argument String name, @Argument String primaryFunction) {
        // [cite: 1152]
        Droid d = new Droid(id, name, new ArrayList<>(), new ArrayList<>(), primaryFunction);
        droids.add(d);
        return d;
    }

    @MutationMapping
    public Starship createStarship(@Argument String id, @Argument String name, @Argument Float length) {
        // Converte o ID para int para bater com sua classe Starship [cite: 1153]
        Starship s = new Starship(Integer.parseInt(id), name, length);
        starships.add(s);
        return s;
    }

    @MutationMapping
    public Character addFriend(@Argument String characterId, @Argument String friendId) {
        // Localiza os dois personagens [cite: 1159]
        Character char1 = character(characterId);
        Character char2 = character(friendId);

        if (char1 != null && char2 != null) {
            // Adiciona char2 à lista de amigos de char1
            char1.getFriends().add(char2);
        }
        return char1;
    }
}