package web.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @SequenceGenerator(name="gerador4", sequenceName="usuario_codigo_seq", allocationSize=1)
	@GeneratedValue(generator="gerador4", strategy=GenerationType.SEQUENCE)
    private Long codigo;

    @OneToMany(mappedBy = "usuario")	
    private List<Tag> tags = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")	
    private List<Resenha> resenhas = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "usuario_seguindo",
        joinColumns = @JoinColumn(name = "codigo_usuario_seguidor"), 
        inverseJoinColumns = @JoinColumn(name = "codigo_usuario_seguido")
    )
    private List<Usuario> seguindo = new ArrayList<>();

    @ManyToMany(
        mappedBy = "seguindo",
        fetch = FetchType.LAZY
    )
    private List<Usuario> seguidores = new ArrayList<>();

    private String nome;
    private String senha;

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
