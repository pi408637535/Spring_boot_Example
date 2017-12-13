import com.tls.tls_sigature.tls_sigature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.ClassLoaderUtils;
import java.io.*;

import static com.tls.tls_sigature.tls_sigature.GenTLSSignatureEx;

/**
 * Created by piguanghua on 2016/10/16.
 * 访问的URL：localhost:8080/
 */
@Controller
@EnableAutoConfiguration
public class ApplicationStart {
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/sig")
    @ResponseBody
    String homeSig() {
        System.out.println("29");
        BufferedReader br = new BufferedReader(ClassLoaderUtils.getReader("keys/private_key"));
        String s = "";

        StringBuilder strBuilder = new StringBuilder();

        try {
            while ((s = br.readLine()) != null) {
                strBuilder.append(s + '\n');
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String priKey = strBuilder.toString();
        System.out.println("44");
        tls_sigature.GenTLSSignatureResult localGenTLSSignatureResult = null;
        try {
            localGenTLSSignatureResult = GenTLSSignatureEx(1400018935L, "22", priKey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (0 == localGenTLSSignatureResult.urlSig.length())
        {
            System.out.println("GenTLSSignatureEx failed: " + localGenTLSSignatureResult.errMessage);
            return null;
        }
        System.out.println("---\ngenerate sig:\n" + localGenTLSSignatureResult.urlSig + "\n---\n");



        return localGenTLSSignatureResult.urlSig;
    }




    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
