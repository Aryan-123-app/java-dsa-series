import java.util.*;
public class JavaCollection1 {

    public static void main(String[] args) {
        // List or Collection -> interface

        //ArrayList -> Concrete Class
        ArrayList<Integer> list = new ArrayList<>();
        //List<Integer> list = new ArrayList<>();
        //Collection<Integer> collection = new ArrayList<>();

        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //Removing elements -> it removes element of entered index
        list.remove(1);

        //addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list.addAll(list2);
        System.out.println(list);

        //removeAll
        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list.size());

        System.out.println("Printing List 2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        // Traversing the list using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        // List Specific Methods
        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);

        //fetch any List element through it's index
        System.out.println(list3.get(1));


        //set an element in a list at a specific index
        list3.set(2,16);


        //toArray -> converts any sort of collection into an array
        Object[] arr = list3.toArray();
        for(Object obj: arr){
            System.out.println(obj);
        }

        //contains -> element checker in a list
        System.out.println(list3.contains(100));

        list.add(12);
        list.add(6);
        System.out.println("Printing Entire List: " + list);

        //sort an ArrayList
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        //clone an ArrayList
        ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone();
        System.out.println("Newlist: " + newlist);

        //ensureCapacity -> if you know the minimum size of the list beforehand
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        //isEmpty -> checks whether the list is empty or not
        System.out.println(newlist.isEmpty());

        //indexOf -> returns the value of index for a specified element of the list
        System.out.println(newlist.indexOf(30));
    }
}