package br.unit.api;

import br.unit.domain.client.Funcionario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {


    @PostMapping("/funcionario/maiorsalario")
    public ResponseEntity<Object> maiorSalario(@RequestBody Funcionario[] listaFuncionario) {
        if (listaFuncionario.length > 1) {
            Funcionario funcionarioCSM = new Funcionario();
            for (Funcionario funcionario : listaFuncionario) {
                if (funcionario.getSalario() > funcionarioCSM.getSalario()) {
                    funcionarioCSM = funcionario;
                }
            }
            HttpStatus httpStatus = HttpStatus.OK;
            return ResponseEntity.status(httpStatus).body(funcionarioCSM);
        } else {
            HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
            return ResponseEntity.status(httpStatus).body("Pelo menos dois funcionários devem ser informados!!");
        }
    }

}
