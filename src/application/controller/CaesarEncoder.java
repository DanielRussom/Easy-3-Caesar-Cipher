package application.controller;

public class CaesarEncoder {

	public String encodeMessage(String originalMessage, int offset) {
		String encodedMessage = "";
		char[] charArray = originalMessage.toCharArray();
		// Iterates through each char	
		for (int i = 0; i < charArray.length; i++) {
			// Gets the KeyCode of the current char
			int keyCode = (int) charArray[i];
			int startingValue;
			// Finds which range of alphabet characters the current char is in
			if(keyCode > 64 && keyCode < 91){
				startingValue = 65;
			} else if(keyCode > 96 && keyCode < 123){
				startingValue = 97;
			}else {
				// Skips non-alphabet chars
				encodedMessage = encodedMessage + charArray[i];
				continue;
			}
			keyCode -= startingValue;
			keyCode += offset;
			keyCode = keyCode % 26;
			keyCode += startingValue;
			char encodedChar = (char) keyCode;
			encodedMessage = encodedMessage + encodedChar;
		}
		return encodedMessage;
	}
}