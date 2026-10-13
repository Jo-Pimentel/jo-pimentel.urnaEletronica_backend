package jo_pimentel.urnaEletronica_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Candidato")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "partido")
    private String partido;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "foto")
    private String urlFotoCandidato;

    @Column(name = "qtd_votos")
    private Integer qtdVotos;
}
