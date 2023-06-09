
public class Main {
    public static void main(String[] args) {
      //String
        String string = "Rikkei";
        //khoi tao doi tuong
        String str = new String("hello jv");
        System.out.println(string);
        System.out.println(str);
        //goi phuong thuc changeString
        String newString = changeString(string);
        //do dai chuoi
        System.out.println("do dai cua chuoi la:" + string.length());
        System.out.println("ki tu tai vi tri 5" + string.charAt(5));

        //noi chuoi
        String a = "123";
        String b = "456";


        System.out.println("chuoi cu:" + string);
        System.out.println("chuoi moi:" + newString);
    }
    public static String changeString(String oldStr){
        oldStr = "new"+ oldStr;
        return oldStr;
    }
}