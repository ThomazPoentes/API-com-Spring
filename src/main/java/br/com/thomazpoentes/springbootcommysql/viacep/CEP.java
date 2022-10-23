package br.com.thomazpoentes.springbootcommysql.viacep;

public class CEP {
    // pripriedades do CEP
    public String CEP;
    public String Logradouro;
    public String Complemento;
    public String Bairro;
    public String Localidade;
    public String Uf;
    public String Ibge;
    public String Gia;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getLocalidade() {
        return Localidade;
    }

    public void setLocalidade(String localidade) {
        Localidade = localidade;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getIbge() {
        return Ibge;
    }

    public void setIbge(String ibge) {
        Ibge = ibge;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    /**
     * Cria um novo CEP vazio
     */
    public CEP() {
        this.Logradouro = null;
        this.Complemento = null;
        this.Bairro = null;
        this.Localidade = null;
        this.Uf = null;
        this.Ibge = null;
        this.Gia = null;
    }

    /**
     * Cria um novo CEP completo
     * @param CEP
     * @param Logradouro
     * @param Complemento
     * @param Bairro
     * @param Localidade
     * @param Uf
     * @param Ibge
     * @param Gia
     */
    public CEP(String CEP, String Logradouro, String Complemento, String Bairro, String Localidade, String Uf, String Ibge, String Gia) {
        this.CEP = CEP;
        this.Logradouro = Logradouro;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.Localidade = Localidade;
        this.Uf = Uf;
        this.Ibge = Ibge;
        this.Gia = Gia;
    }

    /**
     * Cria um novo CEP parcial
     * @param Logradouro
     * @param Localidade
     * @param Uf
     */
    public CEP(String Logradouro, String Localidade, String Uf) {
        this.Logradouro = Logradouro;
        this.Localidade = Localidade;
        this.Uf = Uf;
    }
}
