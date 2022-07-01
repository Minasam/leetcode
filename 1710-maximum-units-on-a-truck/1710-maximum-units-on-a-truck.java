class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Box[] boxes = new Box[boxTypes.length];
        for(int i =0; i < boxes.length; i++){
            boxes[i] = new Box(boxTypes[i][0], boxTypes[i][1]);
        }
        Arrays.sort(boxes);
        int res= 0;
        for(int i =0; i < boxes.length; i++){
            if(truckSize == 0){
                break;
            }
            int min = Math.min(truckSize, boxes[i].count);
            truckSize -= min;
            res += (min * boxes[i].size);
        }
        return res;
    }
    
    static class Box implements Comparable<Box>{
        int count, size;
        public Box(int count, int size){
            this.count = count;
            this.size = size;
        }
        
        public int compareTo(Box box){
            if(size > box.size){
                return -1;
            }else if(size < box.size){
                return 1;
            }else{
                return 0;
            }
        }
    }
}