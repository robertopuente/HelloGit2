public class Main {
    public static void main(String[] args) {

    System.out.println(productFormatter("          Clean Code", "16-06-22"));}

    public static String productFormatter(String productName, String date){
        var r = productName.trim().replace(' ', '_').concat(date).toUpperCase();
        return r;
    }
}