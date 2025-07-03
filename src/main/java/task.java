public class task {


    public static void main(String[] args) {
    }


    public String notString(String str) {

        if(str.length() >= 3 || str.substring(0).equals("not")){
            return str;

        }
 return "not" + str;
    }

}
