public class CouponValidator {
    public static char validateCoupon(String s) {
        // Criteria 1: Check the length
        if (s.length() < 10 || s.length() > 12) {
            return s.charAt(s.length() - 1);
        }

        // Criteria 2: Check distinct uppercase English letters
        String str = s.substring(0, 3);
        if (!(str.chars().distinct().count() == 3 && str.chars().allMatch(Character::isUpperCase))) {
            return s.charAt(s.length() - 1);
        }

        int year;
        try {
            year = Integer.parseInt(s.substring(3, 7));
            if (year < 1900 || year > 2019) {
                return s.charAt(s.length() - 1);
            }
        } catch (NumberFormatException e) {
            return s.charAt(s.length() - 1);
        }

        // Criteria 4: Check coupon discount amount
        String discountAmount = s.substring(7, s.length() - 1);
        if (!discountAmount.matches("10|20|50|100|200|500|1000")) {
            return s.charAt(s.length() - 1);
        }

        // Criteria 5: Check last character is an uppercase English letter
        char lastChar = s.charAt(s.length() - 1);
        if (!Character.isUpperCase(lastChar)) {
            return s.charAt(s.length() - 1);
        }

        // If all criteria pass, return the first character
        return s.charAt(0);
    }

    public static void main(String[] args) {
        // Example usage
        String coupon = "RTY20202004";
        char result = validateCoupon(coupon);
        System.out.println("Result: " + result);
    }
}