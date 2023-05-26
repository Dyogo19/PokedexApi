package pokedexfundatecapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pokedexfundatecapi.integration.response.PokemonResponse;
import pokedexfundatecapi.integration.service.PokemonIntegrationService;

@RestController
@RequestMapping("/api/v1/pokemons")
@CrossOrigin(origins = "*")
public class PokemonController {

        private PokemonIntegrationService pokemonIntegrationService;

    public PokemonController(PokemonIntegrationService pokemonIntegrationService) {
        this.pokemonIntegrationService = pokemonIntegrationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PokemonResponse> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(this.pokemonIntegrationService.buscarPokemonPorId(id));
    }

}
