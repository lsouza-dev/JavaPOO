package endereco;

import exceptions.EnderecoNuloEncontrado;

public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(String cep, String logradouro, String complemento, String unidade, String bairro, String localidade, String uf, String estado, String regiao, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.unidade = unidade;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.estado = estado;
        this.regiao = regiao;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public Endereco(EnderecoRecord record) {
        this.cep = String.valueOf(record.cep());
        if (this.cep.length() < 8)
            throw new EnderecoNuloEncontrado("Endereço nulo encontrado.\nRevise o CEP informado e tente novamente.");
        this.logradouro = String.valueOf(record.logradouro());
        this.complemento = String.valueOf(record.complement());
        this.unidade = String.valueOf(record.unidade());
        this.bairro = String.valueOf(record.bairro());
        this.localidade = String.valueOf(record.localidade());
        this.uf = String.valueOf(record.uf());
        this.estado = String.valueOf(record.estado());
        this.regiao = String.valueOf(record.regiao());
        this.ibge = String.valueOf(record.ibge());
        this.ddd = String.valueOf(record.ddd());
        this.siafi = String.valueOf(record.siafi());
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    @Override
    public String toString() {
        return
                String.format("""
                        Cep: %s
                        Logradouro: %s
                        Complemento: %s
                        Unidade: %s
                        Bairro: %s
                        Localidade: %s
                        Uf: %s
                        Estado: %s
                        Região: %s
                        Ibge: %s
                        Gia: %s
                        DDD: %s
                        Siafi: %s
                        """, cep, logradouro, complemento, unidade, bairro, localidade, uf, estado, regiao, ibge, gia, ddd, siafi);
    }

    public static class EnderecoBuilder {
        private String cep;
        private String logradouro;
        private String complemento;
        private String unidade;
        private String bairro;
        private String localidade;
        private String uf;
        private String estado;
        private String regiao;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;


        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder logradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public EnderecoBuilder unidade(String unidade) {
            this.unidade = unidade;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder localidade(String localidade) {
            this.localidade = localidade;
            return this;
        }

        public EnderecoBuilder uf(String uf) {
            this.uf = uf;
            return this;
        }

        public EnderecoBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder regiao(String regiao) {
            this.regiao = regiao;
            return this;
        }

        public EnderecoBuilder ibge(String ibge) {
            this.ibge = ibge;
            return this;
        }

        public EnderecoBuilder gia(String gia) {
            this.gia = gia;
            return this;
        }

        public EnderecoBuilder ddd(String ddd) {
            this.ddd = ddd;
            return this;
        }

        public EnderecoBuilder siafi(String siafi) {
            this.siafi = siafi;
            return this;
        }

        public Endereco Build() {
            return new Endereco(cep, logradouro, complemento, unidade, bairro, localidade, uf, estado, regiao, ibge, gia, ddd, siafi);
        }
    }
}
