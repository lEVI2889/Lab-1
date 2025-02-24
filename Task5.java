public class Task5 {
    public static int sumDist(Node head, Integer[] distArr) {
        // To Do
        Node temp_head = head;
        int length = 0;
        while(temp_head!= null) {
            temp_head = temp_head.next;
            length++;
        }
        int sum = 0;
        for (int i = 0; i < distArr.length; i++) {
            int num = distArr[i];
            int count = 0;
            Node temp = head;
            if(num < length) {
                while(count<num) {
                    temp = temp.next;
                    count++;
                }
                sum+= (int)temp.elem;
            }
            else{
                sum+=0;
            }
        }
        return sum; // Remove this line.
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = Task5.sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
