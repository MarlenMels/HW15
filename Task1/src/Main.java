import java.util.HashSet;

public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        //todo код писать тут

        for(int i = 1040; i <= 1045; i++){
            System.out.println((char)i + "-" + i);
        }
        System.out.println('Ё' + "-" + (int)'Ё');
        for(int i = 1046; i <= 1077; i++){
            System.out.println((char)i + "-" + i);
        }
        System.out.println('ё' + "-" + (int)'ё');
        for(int i = 1078; i <= 1103; i++){
            System.out.println((char)i + "-" + i);
        }
    }
}