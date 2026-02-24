public class Carusel {
    public static void main(String[] args) {
        boolean[] all = {true, true, true, true, false};
        boolean result = true;
        for (int i = 0; i < all.length; i++) {
            if(!all[i]){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
