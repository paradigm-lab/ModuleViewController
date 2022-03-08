package spring.love.calculator.api;

import org.springframework.stereotype.Component;

@Component
public class Info {
    private String serverIp = "122:122:333:22";

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
}
