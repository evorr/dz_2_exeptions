import java.io.*;

public class dz_4_alg {
    // Исправьте код, примените подходящие способы обработки исключений:
    // public static void main(String[] args) {
    //        InputStream inputStream;
    //        try {
    //                String[] strings = {"apple", "orange"};
    //                String strings1 = strings[2];
    //                test();
    //                int a = 1 / 0;
    //                inputStream = new FileInputStream("/broken_reference");
    //        } catch (ArithmeticException e) {
    //                e.printStackTrace();
    //                System.out.println("На ноль делить нельзя");
    //        }
    //        catch (Throwable e) {
    //                e.printStackTrace();
    //        } catch (StackOverflowError error) {
    //                System.out.println("Что-то сломалось");
    //        } finally {
    //                System.out.println("Я все равно выполнился");
    //        }
    //        System.out.println("Я жив!");
    //}
    //
    //private static void test() throws IOException {
    //        File file = new File("1");
    //        file.createNewFile();
    //        FileReader reader = new FileReader(file);
    //        reader.read();
    //        test();
    //}

    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            if(strings.length-1 < 2){
                throw new ArrayIndexOutOfBoundsException("индекс больше длины массива");
            } else {
                String strings1 = strings[2];
            }
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (StackOverflowError | IOException error) {
            System.out.println("Что-то сломалось: " + error.getMessage());
        }catch (Throwable e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException, StackOverflowError {
        File file = new File("C:\\Users\\Лена\\Desktop\\ДЗ SQL\\6.1.txt");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
