package out.SelfStudy.AlgorithmProblems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

	public static String run(boolean morseToEnglish, String textToTranslate) {
		/*
		* Write your code below; return type and arguments should be according to the problem's requirements
		*/

		char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z' };

		String[] code
            = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };

		Map<Character, String> morseMap = IntStream.range(0, letter.length).boxed()
				.collect(Collectors.toMap(i -> letter[i], i -> code[i]));
		

		StringBuilder translatedText = new StringBuilder();

		if(morseToEnglish){
			String[] morseArrayWords = textToTranslate.split("   ");

			for(int i=0; i<morseArrayWords.length; i++){
				for (int j = 0; j < morseArrayWords[i].length(); j++) {
					String[] morseArrayLetters = morseArrayWords[i].split(" ");
					for (int k = 0; k < morseArrayLetters.length; k++) {
						for (Map.Entry<Character, String> characterStringEntry : morseMap.entrySet()) {
							if (characterStringEntry.getValue().equals(morseArrayLetters[k])){
								translatedText.append(characterStringEntry.getKey());
							}
						}
					}
				}
				translatedText.append(" ");
			}
		}


		
		

		return translatedText.toString();
	}
}