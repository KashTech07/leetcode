class Node{
    int key ;
    int value ;
    Node prev ;
    Node next ;
    Node(int key , int value){
        this.key = key ;
        this.value = value ;
    }
}

class LRUCache {
    private final HashMap<Integer , Node> map ;
    private final int capacity ;
    private final Node head , tail ;
    public LRUCache(int capacity) {
        this.capacity = capacity ;
        this.map = new HashMap<>() ;
        head = new Node(0 ,0) ;
        tail = new Node(0,0) ;
        head.next = tail ;
        tail.prev = head ;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key) ;
            remove(n) ;
            addAtfront(n) ;
            return n.value ;
        }
        return -1 ;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key) ;
            n.value = value ;
            remove(n) ;
            addAtfront(n) ;
        }
        else{
            if(capacity==map.size()){
                Node lru = tail.prev ;
                remove(lru) ;
                map.remove(lru.key) ;
            }
            Node n1 = new Node(key , value) ;
            addAtfront(n1) ;
            map.put(key , n1) ;
         }
    }
  void remove(Node n){
        n.prev.next = n.next ;
        n.next.prev = n.prev ;
    }
  void addAtfront(Node n){
        n.next = head.next ;
        n.prev = head ;
        head.next.prev = n;
        head.next = n ;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */