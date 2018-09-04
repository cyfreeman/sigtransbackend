package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Veiculo.ModeloVeiculo;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modeloveiculo")
public class ModeloVeiculoResource extends GumgaAPI<ModeloVeiculo, String> {
    @Autowired
    public ModeloVeiculoResource(@Qualifier("modeloVeiculoService") GumgaService<ModeloVeiculo, String> service) {
        super(service);
    }
}
