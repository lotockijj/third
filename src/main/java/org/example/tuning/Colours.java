package org.example.tuning;

public class Colours {

    public String getColourResult(String str){
        String[] split = str.split(" ");
        String[] tempRes = new String[split.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String currentColour = split[i];
            int index = Character.getNumericValue(currentColour.charAt(currentColour.length() - 1));
            tempRes[index - 1] = currentColour.substring(0, currentColour.length() - 1);
        }
        for (int i = 0; i < tempRes.length; i++) {
            sb.append(tempRes[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
