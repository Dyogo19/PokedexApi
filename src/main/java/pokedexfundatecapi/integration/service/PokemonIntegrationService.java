package pokedexfundatecapi.integration.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pokedexfundatecapi.integration.response.PokemonResponse;

@Service
public class PokemonIntegrationService {

    private final RestTemplate restTemplate;

    @Value("${pokemon-external-api}")
    private String uri;

    public PokemonIntegrationService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public PokemonResponse buscarPokemonPorId(int id){
        String urlCompleta = this.uri + "/" + id;
        return this.restTemplate.getForObject(urlCompleta, PokemonResponse.class);
    }
    public PokemonResponse buscarPokemonPeloName(String name){
        String urlCompleta = this.uri + "/" + name;
        return this.restTemplate.getForObject(urlCompleta, PokemonResponse.class);
    }

}
