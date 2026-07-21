class MedianFinder {
    PriorityQueue<Integer> left_max_pq = new PriorityQueue<>((a,b)->b-a) ;
    PriorityQueue<Integer> right_min_pq = new PriorityQueue<>((a,b)->a-b) ;
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(left_max_pq.isEmpty() || num<left_max_pq.peek()){
            left_max_pq.add(num) ;
        }
        else{
            right_min_pq.add(num) ;
        }
        if(Math.abs(left_max_pq.size()-right_min_pq.size())>1){
            right_min_pq.add(left_max_pq.peek()) ;
            left_max_pq.poll() ;
        }
        else if(right_min_pq.size()>left_max_pq.size()){
            left_max_pq.add(right_min_pq.peek()) ;
            right_min_pq.poll() ;
        }
    }
    
    public double findMedian() {
        if(right_min_pq.size()==left_max_pq.size()){
            double ans = (right_min_pq.peek()+left_max_pq.peek())/2.0 ;
            return ans ;
        }
        else{
            double ans = left_max_pq.peek() ;
            return ans ;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */