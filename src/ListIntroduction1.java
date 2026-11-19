import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.size());

        list.add("William");

        System.out.println(list.size() > 0 ? "Üres a lista" : "A lista nem üres");

        list.add("John");
        list.add("Amanda");

        System.out.println(list.size());

        System.out.println(list.get(2));

        for (String name : list){
            System.out.println(name);
        }

        for (int i = 0; i<list.size(); i++){
            System.out.println(i+1 + ". " + list.get(i));
        }

        

        list.remove(1);

        for (int i = list.size() -1; i >= 0; i--){
            System.out.println(list.get(i));
        }

        list.clear();

        System.out.println(list.size());
    }
}