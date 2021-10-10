class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> Ar=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                Ar.add(grid[i][j]);
            }
        }
        Collections.sort(Ar);
        int median=Ar.get((Ar.size()-1)/2);
        int count=0;
        for(int i:Ar){
            if(i!=median){
                int diff=Math.abs(i-median);
                if(diff%x!=0){
                    return -1;
                }else{
                    count+=diff/x;
                }    
            }
        }return count;
    }
}
