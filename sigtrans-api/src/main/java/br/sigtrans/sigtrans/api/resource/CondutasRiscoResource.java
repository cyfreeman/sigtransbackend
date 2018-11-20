package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Obitos.CondutaRisco;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/condutarisco")
public class CondutasRiscoResource extends GumgaAPI<CondutaRisco, String> {
    @Autowired
    public CondutasRiscoResource(@Qualifier("condutaRiscoService") GumgaService<CondutaRisco, String> service) {
        super(service);
    }
}