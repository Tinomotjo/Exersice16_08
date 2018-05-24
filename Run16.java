package Exersice16_1;

/*
    Write a method called switchPairs that switches the order of values in the list in a pairwise fashion.
    Your method should switch the order of the first two values, then switch the order of the next two,
    switch the order of the next two, and so on. If the list contains an
    odd number of values, the final element is not moved.
    For example, if the list initially stores
    [10, 25, 31, 47, 52, 68, 77], your method should switch the first pair (10 and 25),
    the second pair (31 and 47), and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(10);
    list1.add(25);
    list1.add(31);
    list1.add(47);
    list1.add(52);
    list1.add(68);
    list1.add(77);

   list1.switchPairs(list1);
}
}