package br.com.thomazpoentes.springbootcommysql.controller;

import br.com.thomazpoentes.springbootcommysql.controller.dto.PessoaRq;
import br.com.thomazpoentes.springbootcommysql.controller.dto.PessoaRs;
import br.com.thomazpoentes.springbootcommysql.model.Pessoa;
import br.com.thomazpoentes.springbootcommysql.repository.PessoaRepository;

import br.com.thomazpoentes.springbootcommysql.viacep.ViaCEPChamada;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {


    ViaCEPChamada chamadaCEP = new ViaCEPChamada();

        private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/")
    public List<PessoaRs> findAll(){

        var pessoa = pessoaRepository.findAll();
        return pessoa.stream().map(PessoaRs::converter).collect(Collectors.toList());

    }

    @GetMapping("/{id}")
    public PessoaRs findById(@PathVariable("id") Long id){

        var pessoa = pessoaRepository.getOne(id);
        return PessoaRs.converter(pessoa);
    }

    @PostMapping("/")
    public void savePerson(@RequestBody  PessoaRq pessoa){
     var p = new Pessoa();

     p.setNome(pessoa.getNome());
     p.setSobrenome(pessoa.getSobrenome());
     p.setEmail(pessoa.getEmail());
     p.setLogradouro(pessoa.getLogradouro());
     p.setNumero(pessoa.getNumero());
     p.setBairro(pessoa.getBairro());
     p.setCidade(pessoa.getCidade());
     p.setEstado(pessoa.getEstado());
     p.setCep(pessoa.getCep());
     pessoaRepository.save(p);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable("id") Long id, @RequestBody  PessoaRq pessoa) throws Exception {

        var p = pessoaRepository.findById(id);

        if(p.isPresent()){

           var pessoaSave = p.get();

           pessoaSave.setNome(pessoa.getNome());
           pessoaSave.setSobrenome(pessoa.getSobrenome());
           pessoaSave.setEmail(pessoa.getEmail());
           pessoaSave.setLogradouro(pessoa.getLogradouro());
           pessoaSave.setNumero(pessoa.getNumero());
           pessoaSave.setBairro(pessoa.getBairro());
           pessoaSave.setCidade(pessoa.getCidade());
           pessoaSave.setEstado(pessoa.getEstado());
           pessoaSave.setCep(pessoa.getCep());
           pessoaRepository.save(pessoaSave);

        }else{
            throw new Exception("Pessoa não encontrada");
        }
    }

    @DeleteMapping("/{id}")
    public void DeletPerson(@PathVariable("id") Long id, @RequestBody  PessoaRq pessoa) throws Exception {

        var p = pessoaRepository.findById(id);
        var pessoaDelet = p.get();

        if(p.isPresent()){
            pessoaRepository.delete(pessoaDelet);
    }else {
            throw new Exception("Pessoa não encontrada");
        }

    }

}
