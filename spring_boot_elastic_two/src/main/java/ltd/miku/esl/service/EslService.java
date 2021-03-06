package ltd.miku.esl.service;

import ltd.miku.esl.model.Cliente;

/**
 * Created by piguanghua on 2016/11/24.
 */
public interface EslService {
    Cliente findCliente(String id);
    Cliente saveCliente(Cliente cliente);
    boolean existsClienteById(String id);
    void deleteById(String id);
}
