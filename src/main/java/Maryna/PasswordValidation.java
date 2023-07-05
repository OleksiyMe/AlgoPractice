package Maryna;

public class PasswordValidation {

//    String_PasswordValidation
//1. Write a return method that can verify if a password is valid or not.
//    requirements:
//            1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper-case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special character
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns  false
public static void main(String[] args) {

   String input="Akjbk123~";
    System.out.println("Your password "+input+
            " is valid? "+ isValid(input));
}

    private static boolean isValid(String input) {
        //1) if length less than 6 return false
        if(input.length()<6) return false;

        boolean hasUppercase=false, hasLowercase=false, hasSpecial=false,
        hasDigit=false;
        //1) if at least one Space Character present -- return false
        //2) if at least one Uppercase Character present -- assign true to hasUppercase
        //3) if at least one Lowercase Character present -- assign true to hasLowercase
        //4) if at least one Special Character present -- assign true to hasSpecial
        //5) if at least one Digit Character present -- assign true to hasDigit
        for(Character each:input.toCharArray()){
            if (each==' ') return false;
            if (Character.isUpperCase(each)) hasUppercase=true;
            if (Character.isLowerCase(each)) hasLowercase=true;
            if (!Character.isDigit(each)&&
                    !Character.isLetter(each)) hasSpecial=true;
            if (Character.isDigit(each)) hasDigit=true;

        }
        // if any of the conditions false -- return false
        return hasLowercase && hasUppercase && hasSpecial && hasDigit;
    }

}
