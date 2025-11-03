package web.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Tag {
    private Long codigo;
    private Usuario usuario;
    private List<Filme> filmes = new ArrayList<>();
    private String status; //publica ou privada, talvez trocar para um ENUM
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
    public List<Filme> getFilmes() {
        return filmes;
    }
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }
    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    
}
