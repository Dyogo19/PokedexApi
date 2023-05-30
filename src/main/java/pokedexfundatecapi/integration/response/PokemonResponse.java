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
    private int countMoves;
    private boolean isPesado;

    public void setName(String name) {
        name = name.substring(0,1).toUpperCase().concat(name.substring(1));
        this.name = name;
    }

    public int getCountMoves() {
        return moves.size();
    }

    public boolean isPesado() {
        return weight >= 100;
    }
}
