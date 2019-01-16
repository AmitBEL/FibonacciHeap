
/**
 * FibonacciHeap
 *
 * An implementation of fibonacci heap over non-negative integers.
 */
//ricky changes
public class FibonacciHeap
{
    private HeapNode min = null;
    private int size = 0;
    private int marked = 0;
    private int trees = 0;
    private int links = 0;
    private int cuts = 0;

    /**
     * public boolean empty()
     *
     * precondition: none
     *
     * The method returns true if and only if the heap
     * is empty.
     *
     */
    public boolean empty()
    {
        return min==null;
    }

    /**
     * public HeapNode insert(int key)
     *
     * Creates a node (of type HeapNode) which contains the given key, and inserts it into the heap.
     */
    public HeapNode insert(int key)
    {
        HeapNode node = new HeapNode(key);
        this.concate(node, false);
        this.checkNDUpdateMin(node);
        size+=1;
        trees+=1;
        return node;
    }

    /**
     * public void deleteMin()
     *
     * Delete the node containing the minimum key.
     *
     */
    public void deleteMin()
    {
        if (size==0){
            return;
        }
        if (size==1){
            min = null;
        }
        else {
            HeapNode origMin = this.min;
            if (origMin.child!=null){
                HeapNode first = origMin.child;
                HeapNode temp = first;
                do {
                    if (temp.mark){
                        marked-=1;
                    }
                    temp.mark=false;
                    temp=temp.next;
                } while (temp!=first);
                concate(origMin.child, true);
            }
        }
        return; // should be replaced by student code

    }
    /*
    compares the nodeToCheck.key to min.key to see if the nodeToCheck.key is the minimal
    key of the tree, and updates accordingly.
     */
    private void checkNDUpdateMin(HeapNode nodeToCheck){

    }

    /**
     * public HeapNode findMin()
     *
     * Return the node of the heap whose key is minimal.
     *
     */
    public HeapNode findMin()
    {
        return new HeapNode(0);// should be replaced by student code
    }

    /**
     * public void meld (FibonacciHeap heap2)
     *
     * Meld the heap with heap2
     *
     */
    public void meld (FibonacciHeap heap2)
    {
        return; // should be replaced by student code
    }


    /**
     *if concateAllList is true, it concatenates the list - nodeToConnect with this,
     *
     *if concateAllList is false, it concatenates the single node - nodeToConnect with this
     *
     */
    public void concate(HeapNode nodeToConnect, boolean concateAllList){}

    /**
     * public int size()
     *
     * Return the number of elements in the heap
     *
     */
    public int size()
    {
        return 0; // should be replaced by student code
    }

    /**
     * public int[] countersRep()
     *
     * Return a counters array, where the value of the i-th entry is the number of trees of order i in the heap.
     *
     */
    public int[] countersRep()
    {
        int[] arr = new int[42];
        return arr; //	 to be replaced by student code
    }

    /**
     * public void delete(HeapNode x)
     *
     * Deletes the node x from the heap.
     *
     */
    public void delete(HeapNode x)
    {
        return; // should be replaced by student code
    }

    /**
     * public void decreaseKey(HeapNode x, int delta)
     *
     * The function decreases the key of the node x by delta. The structure of the heap should be updated
     * to reflect this chage (for example, the cascading cuts procedure should be applied if needed).
     */
    public void decreaseKey(HeapNode x, int delta)
    {
        return; // should be replaced by student code
    }

    /*
     *makes the cascading cuts in decreaseKey
     *and updates the relevant fields
     */
    private void cascading(HeapNode nodeToCascade){}

    /*
     *disconnects the single node from the parent
     */
    private void disconnect(HeapNode nodeToDisconnect){}

    /**
     * public int potential()
     *
     * This function returns the current potential of the heap, which is:
     * Potential = #trees + 2*#marked
     * The potential equals to the number of trees in the heap plus twice the number of marked nodes in the heap.
     */
    public int potential()
    {
        return 0; // should be replaced by student code
    }


    /*
    makes a number of link operations which each gets as input two trees of the same rank, and generates a tree of
     * rank bigger by one, by hanging the tree which has larger value in its root on the tree which has smaller value
     * in its root.
     */
    private void successiveLinking(){}


    /**
     * public static int totalLinks()
     *
     * This static function returns the total number of link operations made during the run-time of the program.
     * A link operation is the operation which gets as input two trees of the same rank, and generates a tree of
     * rank bigger by one, by hanging the tree which has larger value in its root on the tree which has smaller value
     * in its root.
     */
    public static int totalLinks()
    {
        return 0; // should be replaced by student code
    }

    /**
     * public static int totalCuts()
     *
     * This static function returns the total number of cut operations made during the run-time of the program.
     * A cut operation is the operation which diconnects a subtree from its parent (during decreaseKey/delete methods).
     */
    public static int totalCuts()
    {
        return 0; // should be replaced by student code
    }

    /**
     * public class HeapNode
     *
     * If you wish to implement classes other than FibonacciHeap
     * (for example HeapNode), do it in this file, not in
     * another file
     *
     */
    public class HeapNode{

        public int key;
        int rank = 0;
        boolean mark = false;
        HeapNode child = null;
        HeapNode next = null;
        HeapNode prev = null;
        HeapNode parent = null;

        public HeapNode(int key) {
            this.key = key;
        }

        public int getKey() {
            return this.key;
        }

    }
}
