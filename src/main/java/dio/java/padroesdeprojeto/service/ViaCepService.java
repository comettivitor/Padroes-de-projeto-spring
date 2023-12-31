package dio.java.padroesdeprojeto.service;

import dio.java.padroesdeprojeto.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 *  * @see <a href="https://viacep.com.br">ViaCEP</a>
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
