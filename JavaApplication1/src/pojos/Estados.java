package pojos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


 /*
 * @author guest-hv9avy
 */

@Entity
@Table(name = "Estados")
public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String unidade_federativa;
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cidades> cidades = new ArrayList<Cidades>();
    
    @OneToOne(cascade = CascadeType.ALL)
    private Governador governador;

    public void addCidade(Cidades cdd){
        this.cidades.add(cdd);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUnidade_federativa() {
        return unidade_federativa;
    }

    public void setUnidade_federativa(String unidade_federativa) {
        this.unidade_federativa = unidade_federativa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cidades> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidades> cidades) {
        this.cidades = cidades;
    }

    public Governador getGovernador() {
        return governador;
    }

    public void setGovernador(Governador governador) {
        this.governador = governador;
    }
    
    
}
