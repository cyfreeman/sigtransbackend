package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.Envolvido;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envolvido")
public class EnvolvidoResource extends GumgaAPI<Envolvido, String> {
    @Autowired
    public EnvolvidoResource(@Qualifier("envolvidoService") GumgaService<Envolvido, String> service) {
        super(service);
    }
}
