class MinHeap {
    int capacity, currentSize;
    HeapNode[] minH;
    int[] indexes;

    // constructor
    public MinHeap(int capacity) {
        this.capacity = capacity;
        minH = new HeapNode[capacity + 1];
        indexes = new int[capacity];
        minH[0] = new HeapNode();
        minH[0].key = Integer.MIN_VALUE;
        minH[0].vertex = -1;
        currentSize = 0;
    }

    // insert a new HeapNode (with vertex and key) into the minHeap tree
    public void insert(HeapNode x) {
        // increase the size of the MST with every HeapNode
        currentSize++;
        // set the index of the node to be equal to the current size of the MST
        int index = currentSize;
        minH[index] = x;
        indexes[x.vertex] = index;
        moveUp(index);
    }

    // if the current index is less than parent index, switch places with parent index
    public void moveUp(int position) {
        int parentIndex = position / 2;
        int currentIndex = position;
        while (currentIndex > 0 && minH[parentIndex].key > minH[currentIndex].key) {
            HeapNode currentNode = minH[currentIndex];
            HeapNode parentNode = minH[parentIndex];

            // swap the positions
            indexes[currentNode.vertex] = parentIndex;
            indexes[parentNode.vertex] = currentIndex;
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = parentIndex / 2;
        }
    }

    // move the last node to the top, where it can be placed
    public HeapNode extractMin() {
        HeapNode min = minH[1];
        HeapNode lastNode = minH[currentSize];

        // update the indexes[] and move the last node to the top
        indexes[lastNode.vertex] = 1;
        minH[1] = lastNode;
        minH[currentSize] = null;
        moveDown(1);
        currentSize--;
        return min;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int heapSize() {
        return currentSize;
    }

    public void moveDown(int k) {
        int smallest = k;
        int leftChildIndex = 2 * k;
        int rightChildIndex = 2 * k + 1;
        if (leftChildIndex < heapSize() && minH[smallest].key > minH[leftChildIndex].key) {
            smallest = leftChildIndex;
        }
        if (rightChildIndex < heapSize() && minH[smallest].key > minH[rightChildIndex].key) {
            smallest = rightChildIndex;
        }

        if (smallest != k) {

            HeapNode smallestNode = minH[smallest];
            HeapNode kNode = minH[k];

            // swap the positions
            indexes[smallestNode.vertex] = k;
            indexes[kNode.vertex] = smallest;
            swap(k, smallest);
            moveDown(smallest);
        }
    }

    // method for swapping the positions of the nodes
    public void swap(int a, int b) {
        HeapNode temp = minH[a];
        minH[a] = minH[b];
        minH[b] = temp;
    }
}
