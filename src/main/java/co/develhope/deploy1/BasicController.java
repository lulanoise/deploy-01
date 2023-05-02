package co.develhope.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Value("${myCustomEnvs.devName}")
    private String devName;

    @GetMapping("/")
    public String getDevName(){
        return devName;
    }

    //l'applicazione funziona da intelliJ ma da errori nel terminale:  : Application run failed e altro

}