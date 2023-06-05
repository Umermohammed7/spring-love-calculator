package com.seleniumexpress.lc.service;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {

	private final String LC_APP_FORMULA = "FLAME";

	@Override
	public String calculateLove(String userName, String crushName) {

		int userAndCrushNameCount = (userName + crushName).toCharArray().length;
		int formulaCount = LC_APP_FORMULA.toCharArray().length;
		int rem = userAndCrushNameCount % formulaCount;

		char resultChar = LC_APP_FORMULA.charAt(rem);

		String result = whatsBetweenUs(resultChar);

		return result;
	}

	@Override
	public String whatsBetweenUs(char calculationResult) {

		String result = null;
		
		if (calculationResult == 'F') {

			result = LoveCalculatorConstants.F_CHAR_MEANING;
		}
		if (calculationResult == 'L') {

			result = LoveCalculatorConstants.L_CHAR_MEANING;
		}
		if (calculationResult == 'A') {

			result = LoveCalculatorConstants.A_CHAR_MEANING;
		}
		if (calculationResult == 'M') {

			result = LoveCalculatorConstants.M_CHAR_MEANING;
		}
		if (calculationResult == 'E') {

			result = LoveCalculatorConstants.E_CHAR_MEANING;
		}
		if (calculationResult == 'S') {

			result = LoveCalculatorConstants.S_CHAR_MEANING;
		}

		return result;
	}

}
