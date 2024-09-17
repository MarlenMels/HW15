import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " АБВГДЕЁЖЗКИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void main(String[] args) {
        String FIO = new Scanner(System.in).nextLine();
        check(FIO);
    }

    public static void check(String FIO){
        boolean isValid = true;
        int spaceCount = 0;
        for(int i = 0; i<FIO.length(); i++){
            if(FIO.charAt(i) == ' '){
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(FIO.charAt(i)))){
                isValid = false;
                break;
            }
        }

        if(isValid && spaceCount == 2) {
            System.out.println(FIO.substring(FIO.indexOf(' ')).trim());
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}