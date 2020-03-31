package functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicates {

    public static void main(String[] args) {

        String phoneNumber1 = "07000000030";
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid(phoneNumber1));
        String phoneNumber = "938763467364";
        System.out.println(isPhoneNumberValid(phoneNumber));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test(phoneNumber1));
        System.out.println("Is phone Number valid and contains 3 ="+isPhoneNumberValidPredicate.and(containsNumber3).test(phoneNumber1));
        System.out.println("Is phone Number valid or contains 3 ="+isPhoneNumberValidPredicate.or(containsNumber3).test(phoneNumber));


    }

    static boolean isPhoneNumberValid (String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
