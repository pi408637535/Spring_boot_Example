package ltd.miku.esl.controller;

import ltd.miku.esl.model.Cliente;
import ltd.miku.esl.service.EslService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by piguanghua on 2016/11/24.
 */
@RestController
@RequestMapping(value = "/esl")
public class EslController {
    @Autowired
    private EslService esl;

    private static final Logger LOG = LoggerFactory.getLogger(EslController.class);

    @RequestMapping(value = "/test")
    public Object test(String id)
    {
        return esl.findCliente(id);
    }

    @RequestMapping("/save")
    public Cliente saveCliente(){
        Cliente cliente = new Cliente();
        cliente.setAccount_number(20);
        cliente.setAddress("beijing");
        cliente.setAge(18);
        cliente.setBalance(50);
        cliente.setEmail("408637535@qq.com");
        cliente.setEmployer("Wode");
        cliente.setFirstname("PI");
        cliente.setId("2");
        cliente.setLastname("galy");
        cliente.setState("Beijing");
        cliente.setGender("male");
        cliente.setCity("NanTong");
        esl.saveCliente(cliente);
        return  cliente;
    }

    @RequestMapping("/exist")
    public boolean exist(String id)
    {
       return esl.existsClienteById(id);
    }

    @RequestMapping("delete")
    public void delete(String id){
        esl.deleteById(id);
    }
}
