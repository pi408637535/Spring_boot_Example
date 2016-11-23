package ltd.miku.esl.controller;

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
@RequestMapping(value = "/esl/")
public class EslController {
    @Autowired
    private EslService esl;

    private static final Logger LOG = LoggerFactory.getLogger(EslController.class);

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public Object test(@RequestBody String id)
    {
        return esl.findCliente(id);
    }
}
