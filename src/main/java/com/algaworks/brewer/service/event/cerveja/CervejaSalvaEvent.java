package com.algaworks.brewer.service.event.cerveja;

import com.algaworks.brewer.model.Cerveja;
import lombok.Data;
import org.springframework.util.StringUtils;


@Data
public class CervejaSalvaEvent {

    private Cerveja cerveja;

    public CervejaSalvaEvent(Cerveja cerveja) {
        this.cerveja = cerveja;
    }

    public boolean temFoto() {
        return !StringUtils.isEmpty(cerveja.getFoto());
    }
}
