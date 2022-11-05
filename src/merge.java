public class merge {
    public static void main(String[] args) {
        String[] list = {"James", "Favour", "Mercy", "Goke", "Ola"};
        checkFirst(list);
    }

    private static void checkFirst(String[] words) {
        String sentence = "";
        for(String w : words){
            sentence += w;
        }
        System.out.println(sentence);
    }
}
