import br.com.getnet.entity.ClientHttp;
import br.com.getnet.entity.Pessoa;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimulacaoTest {

    ClientHttp baseUrl = new ClientHttp();
    Pessoa pessoa = new Pessoa(" ", "Arquiteto");

    // SIMULAÇÕES
    @Test
    @DisplayName("GET: Valida status code de uma simulação com dados requeridos.")
    void validaSimulacaoAoCriarUmNovoUsuario() {

        RestAssured.given().contentType(ContentType.JSON).body(pessoa).when().post(baseUrl.urlAPICreateUser())
                .then().log().all().statusCode(201);
    }




}
