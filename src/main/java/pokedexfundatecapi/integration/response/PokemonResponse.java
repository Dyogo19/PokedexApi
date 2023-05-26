package pokedexfundatecapi.integration.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pokedexfundatecapi.integration.response.MovesResponse;

import java.util.Collection;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class PokemonResponse {

    private String name;
    private int height;
    private int weight;
    private Collection<MovesResponse> moves;


}
