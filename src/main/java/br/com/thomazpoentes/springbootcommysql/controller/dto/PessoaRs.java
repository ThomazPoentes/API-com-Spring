package br.com.thomazpoentes.springbootcommysql.controller.dto;

import br.com.thomazpoentes.springbootcommysql.model.Pessoa;

public class PessoaRs {

    private Long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String Logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;



    /*
        fazendo a conversão da minha classe de entidade para
         a classse de response */
    public static PessoaRs converter(Pessoa p){

        var pessoa = new PessoaRs();
        pessoa.setId(p.getId());
        pessoa.setNome(p.getNome());
        pessoa.setSobrenome(p.getSobrenome());
        pessoa.setEmail(p.getEmail());
        pessoa.setLogradouro(p.getLogradouro());
        pessoa.setNumero(p.getNumero());
        pessoa.setBairro(p.getBairro());
        pessoa.setCidade(p.getCidade());
        pessoa.setEstado(p.getEstado());
        pessoa.setCep(p.getCep());
        return pessoa;

    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
