package web.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private Long codigo;
    private String nome;
    private String senha;
    private List<Usuario> seguindo = new ArrayList<>();

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Usuario> getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(List<Usuario> seguindo) {
        this.seguindo = seguindo;
    }
}
