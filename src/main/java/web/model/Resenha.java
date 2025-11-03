package web.model;

import java.time.LocalDateTime;

public class Resenha {
    private Long codigo;
    private Usuario usuario;
    private Filme filme;
    private String descricao;
    private LocalDateTime dtCriacao;
    
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Filme getFilme() {
        return filme;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }
    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    
}
