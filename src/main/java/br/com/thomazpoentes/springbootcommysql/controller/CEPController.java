package br.com.thomazpoentes.springbootcommysql.controller;

import br.com.thomazpoentes.springbootcommysql.model.Endereco;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;

public class CEPController implements Serializable {

    private static final long serialVersionUID = 6046704732666502085L;

    public ResponseEntity<Endereco> doObterCep(@PathVariable(name = "cep") String cep) {

        return null;
    }

}