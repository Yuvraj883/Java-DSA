class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral
            int currentVal = romanValues.get(s.charAt(i));
            
            // Check if there's a next character
            if (i + 1 < s.length()) {
                // Get the value of the next Roman numeral
                int nextVal = romanValues.get(s.charAt(i + 1));
                
                // Compare the current and next values to determine if subtraction is needed
                if (currentVal >= nextVal) {
                    value += currentVal;
                } else {
                    value += nextVal - currentVal;
                    i++; // Move to the next character after the subtraction
                }
            } else {
                value += currentVal;
            }
        }

        return value;
    }
}