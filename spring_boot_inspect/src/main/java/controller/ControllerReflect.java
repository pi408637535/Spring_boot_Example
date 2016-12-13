package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wode3 on 2016/12/13.
 */
@RestController
@RequestMapping("/wo")
public class ControllerReflect {

    @RequestMapping("/index")
    public Object getUrlMapping(HttpServletRequest request) {
        WebApplicationContext wc = getWebApplicationContext(request.getSession().getServletContext());
        RequestMappingHandlerMapping rmhp = wc.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = rmhp.getHandlerMethods();

        for(Map.Entry<RequestMappingInfo, HandlerMethod> targetEntry : map.entrySet()){
            System.out.println(targetEntry.getKey());
            System.out.println(targetEntry.getValue());
            System.out.println("*********************************");
        }

        /*for (Iterator<RequestMappingInfo> iterator = map.keySet().iterator(); iterator
                .hasNext();) {
            RequestMappingInfo info = iterator.next();
            System.out.print(info.getConsumesCondition());
            System.out.print(info.getCustomCondition());
            System.out.print(info.getHeadersCondition());
            System.out.print(info.getMethodsCondition());
            System.out.print(info.getParamsCondition());
            System.out.print(info.getPatternsCondition());
            System.out.print(info.getProducesCondition());

            System.out.print("===");

            HandlerMethod method = map.get(info);
            System.out.print(method.getMethod().getName() + "--");
            System.out.print(method.getMethodAnnotation(RequestMapping.class).params()[0]);
            System.out.println();
        }*/
        return null;
    }

    public WebApplicationContext getWebApplicationContext(ServletContext sc) {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
    }
}
