class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList <Integer> pascal = new ArrayList<>();
        pascal.add(1);
        long ans =1;
        for(int i =1;i<=rowIndex;i++){
           ans = ans *(rowIndex - i+1)/i;
           pascal.add((int) ans);
        }
        return pascal;
    }
}