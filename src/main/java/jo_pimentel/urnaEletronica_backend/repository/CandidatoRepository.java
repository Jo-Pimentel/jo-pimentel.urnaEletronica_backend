package jo_pimentel.urnaEletronica_backend.repository;

import jo_pimentel.urnaEletronica_backend.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
    @Query(value = "SELECT * FROM candidato WHERE numero=? AND cargo=?", nativeQuery = true)
    Candidato findByNumeroAndCargo(Integer numero, String cargo);
}
