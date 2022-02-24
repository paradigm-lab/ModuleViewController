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

        String result = null;

        if(calculationResult == 'F') {
            result = LoveCalculatorConstants.F_CHAR_MEANING;
        }
        else if (calculationResult == 'L') {
            result = LoveCalculatorConstants.L_CHAR_MEANING;
        }
        else if (calculationResult == 'A') {
            result = LoveCalculatorConstants.A_CHAR_MEANING;
        }
        else if (calculationResult == 'M') {
            result = LoveCalculatorConstants.M_CHAR_MEANING;
        }
        else if (calculationResult == 'E') {
            result = LoveCalculatorConstants.E_CHAR_MEANING;
        }

        return result;
    }

}
