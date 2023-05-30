package pokedexfundatecapi.integration.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pokedexfundatecapi.integration.response.MoveResponse;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovesResponse {

    private MoveResponse move;

}
