package spring.love.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService{

    public final String LC_APP_FORMULA = "FLAME";

    @Override
    public void calculateLove(String userName, String crushName) {
        int userAndCrushNameCount = (userName+crushName).toCharArray().length;
        int formulacount = LC_APP_FORMULA.toCharArray().length;

        int rem = userAndCrushNameCount % formulacount;

        char resultChar = LC_APP_FORMULA.charAt(rem);

        String result = whatsBetweenUs(resultChar);
    }

    @Override
    public String whatsBetweenUs(char calculationResult) {
        
        return null;
    }
}
