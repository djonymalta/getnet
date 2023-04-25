import br.com.getnet.entity.ClientHttp;
import br.com.getnet.entity.Pessoa;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JSONSchemaValidatorTest {

    static ClientHttp baseUrl = new ClientHttp();
    Pessoa pessoa = new Pessoa("Djony Malta", "Quality Assurance Analyst");
    @Test
    @DisplayName("POST: Valida Schema ao criar um novo usuário")
    void validaSChemaAoCriarNovoUsuario(){
        RestAssured.given().log().all().contentType(ContentType.JSON).body(pessoa).when().post(baseUrl.urlAPICreateUser()).then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema-example.json"));

    }
}
