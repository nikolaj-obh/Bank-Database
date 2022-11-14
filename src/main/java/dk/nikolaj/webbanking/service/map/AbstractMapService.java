package dk.nikolaj.webbanking.service.map;

import dk.nikolaj.webbanking.model.BaseEntity;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
}
