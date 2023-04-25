import br.com.getnet.entity.ClientHttp;
import br.com.getnet.entity.Pessoa;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class SimulacaoTest {
    ClientHttp baseUrl = new ClientHttp();
    private Validator validator;
    @BeforeEach
    public void ValidatorInstance(){
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }




    // Validar com @NotBlank para garantir que os campos não estejam vazios (Próximo PR)
    Pessoa pessoa = new Pessoa( "Joao", "Arquiteto");

    // SIMULAÇÕES
    @Test
    @DisplayName("GET: Valida status code de uma simulação com dados requeridos.")
    void validaSimulacaoAoCriarUmNovoUsuario() {

        Set<ConstraintViolation<Pessoa>> violation = validator.validate(pessoa);
        RestAssured.given().contentType(ContentType.JSON).body(violation).when().post(baseUrl.urlAPICreateUser())
                .then().log().all().statusCode(201);

    }




}
