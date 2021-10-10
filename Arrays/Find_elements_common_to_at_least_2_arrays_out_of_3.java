/*
  For all elements in first Array , we assign it them as 1 which is in binary 001,
  Now if suppose same element have arrived and the value on that index would be 1 , so we will apply
  OR operator with 2 so that the bits would be now 011 , similarly for the last array .
  the elements which occured in both previously would be OR with 4 and become 111 , and in case it 
  appeared in anyone then it will become 110 ,
  So the common elements in atleast two arrays would be of form 101(5) , 111(7) , 110 (6) and 011 (3).
  So in last we will iterate the arrays and found anyone above then add that index to our result list.
*/
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res=new ArrayList<>();
        int ar[]=new int[101];
        for(int i:nums1){
            ar[i]=1;
        }
        for(int i:nums2){
            ar[i]=ar[i] | 1<<1;
        }
        for(int i:nums3){
            ar[i]=ar[i] | 1<<2;
        }
        for(int i=0;i<101;i++){
            if(ar[i]==5 || ar[i]==7 || ar[i]==3 || ar[i]==6){
                res.add(i);
            }
        }
        return res;
    }
}
