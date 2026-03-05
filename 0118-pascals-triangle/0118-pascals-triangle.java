class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        
        for(int i=1;i<=numRows;i++){
            result.add(rowGenerator(i));

        }
        return result;
    }


    public List<Integer> rowGenerator(int row){
        List<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1; i<row;i++){
            ans=ans*(row -i);
            ans=ans/i;
            list.add(ans);
        }
        return list;
    }
}