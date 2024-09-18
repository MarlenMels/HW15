import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " АБВГДЕЁЖЗКИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void main(String[] args) {
        String FIO = new Scanner(System.in).nextLine();
        System.out.println(check(FIO));
    }

    public static String check(String FIO){
        boolean isValid = false;
        int spaceCount = 0;
        String output = FIO.trim();
        String ans = "";
        for(int i = 0; i<output.length(); i++){
            if(output.charAt(i) == ' '){
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(output.charAt(i)))){
                isValid = true;
                break;
            }
        }

        if(isValid && spaceCount == 2) {
            String lastName = output.substring(0, output.indexOf(' ')).trim();
            String firstName = output.substring(output.indexOf(' '), output.lastIndexOf(' ')).trim();
            String fatherName = output.substring(output.lastIndexOf(' ')).trim();
            ans = "Фамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + fatherName;
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
        return ans;
    }
}