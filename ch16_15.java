package ch16;
/*
Write a method called notEquals that accepts a second list as a parameter,
returns true if the two lists are not equal, and returns false otherwise.
Two lists are considered unequal if they store the different values in
any random order and do not have the same length.
 */
public class ch16_15 {
    public static void main(String[] args) {
        LinkedIntList liste1 = new LinkedIntList();
        liste1.add(1);
        liste1.add(2);
        liste1.add(3);
        liste1.add(4);
        liste1.add(5);

        LinkedIntList liste2 = new LinkedIntList();
        liste2.add(1);
        liste2.add(2);
        liste2.add(3);

        System.out.println(liste1.notEquals(liste2));

    }
    /*
    Kaldte metode:

    public boolean notEquals(LinkedIntList liste2){

        ListNode node1 = front;
        ListNode node2 = liste2.front;

        while (node1 != null || node2 != null){

            //Føler at der er en bedre møde at skrive nedenstående 2 linjer på, men kunne ikke lige
            //umiddelbart se hvordan.
            //Hvis de to lister ikke er lige lange kan de ikke være ens, derfor returner true.
            if (size() != liste2.size()){
                return true;
            }
            //Hvis de to noder på samme index i hver deres liste ikke indeholder samme data,
            //kan listerne ikke være ens, derfor return true.
            if (node1.data != node2.data){
                return true;
            }
            //Cycler igennem hver liste
            node1 = node1.next;
            node2 = node2.next;
        }
        return false;

    }
     */
}
