package ltd.miku.esl.service.impl;

import ltd.miku.esl.dao.ClienteRepository;
import ltd.miku.esl.model.Cliente;
import ltd.miku.esl.service.EslService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piguanghua on 2016/11/24.
 */
@Service
public class EslServiceImpl  implements EslService {
    @Autowired
    private ClienteRepository clienteDao;

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(EslServiceImpl.class);

    @Override
    public Cliente findCliente(String id)
    {
        Cliente cliente = clienteDao.findOne(id);
        LOG.info(" get cliente by id {} is {}", id, cliente);
        return cliente;
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        clienteDao.save(cliente);
        return  cliente;
    }

    @Override
    public boolean existsClienteById(String id) {
        return clienteDao.exists(id);
    }

    @Override
    public void deleteById(String id) {
        clienteDao.delete(id);
    }
}
