package web.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @SequenceGenerator(name="gerador3", sequenceName="tag_codigo_seq", allocationSize=1)
	@GeneratedValue(generator="gerador3", strategy=GenerationType.SEQUENCE)
    private Long codigo;

    @ManyToMany
    @JoinTable(
        name = "tag_filme",
        joinColumns = @JoinColumn(name = "codigo_tag"),
        inverseJoinColumns = @JoinColumn(name = "codigo_filme")
    )
    private List<Filme> filmes = new ArrayList<>();

    @Column(name = "dt_criacao")
    private LocalDateTime dtCriacao;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario")
    private Usuario usuario;
    
    private StatusTag status;
    
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
    public StatusTag getStatus() {
        return status;
    }
    public void setStatus(StatusTag status) {
        this.status = status;
    }
    public LocalDateTime getDtCriacao() {
        return dtCriacao;
    }
    public void setDtCriacao(LocalDateTime dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    
}
