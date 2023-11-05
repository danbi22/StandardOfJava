package operator;

public class CharTransduce {

    static class CharTransducer {
       static public char upperTransducer(char c) {
            return (char) (c - 32);
        }

       static public char lowerTransducer(char c) {
            return (char) (c + 32);
        }
    }
    public static void main(String[] args) {
        char uppercase = ' ', lowercase = ' ';

        uppercase = CharTransducer.upperTransducer('a');
        lowercase = CharTransducer.lowerTransducer('A');

        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println();
    }
}
