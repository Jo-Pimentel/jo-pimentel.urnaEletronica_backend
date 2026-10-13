package jo_pimentel.urnaEletronica_backend.service;

import jo_pimentel.urnaEletronica_backend.model.Candidato;
import jo_pimentel.urnaEletronica_backend.repository.CandidatoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CandidatoService {
    @Autowired
    private CandidatoRepository candidatoRepository;

    public Candidato registrarCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    public Candidato findByNumeroAndCargo(Integer numero, String cargo) {
        return candidatoRepository.findByNumeroAndCargo(numero, cargo);
    }
}
