class OrderedStream {
    int pointer;
    String[] stream;
    public OrderedStream(int n) {
        stream = new String[n];
        pointer = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        stream[idKey - 1] = value;
        ArrayList<String> res = new ArrayList<>();
        while(pointer < stream.length){
            if(stream[pointer] == null)break;
            res.add(stream[pointer]);
            pointer++;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */