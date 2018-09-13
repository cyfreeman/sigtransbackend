package br.sigtrans.sigtrans.repository;

import br.sigtrans.sigtrans.domain.Obitos.FatorCondutaGravidadeAno;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatorCondutaGravidadeAnoRepository extends GumgaCrudRepository<FatorCondutaGravidadeAno, String> {
}
