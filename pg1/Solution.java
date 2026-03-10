import java.util.*;

class Solution{
    public static void main(String[] args){
        int n=2,m=2;
        int[] v={5,7};
        int[] d={2,4};
        System.out.println(foodstamps(n,m,v,d));
    }
    static int foodstamps(int n,int m, int[] v,int[] d){
        int[] t=new int[n];
        Arrays.fill(t,1);
        List<Integer> list=new ArrayList<>();
        int i;
        for(i=0;i<n;i++){
            while(true){
                int temp=v[i]-d[i]*(t[i]-1);
                t[i]++;
                if(temp>0){
                    list.add(temp);
                }
                else{
                    break;
                }
            }

        }
        Collections.sort(list);
        Collections.reverse(list);
        int sum=0;
        for(i=0;i<m;i++){
            sum+=list.get(i);
        }
        return sum;
    }
}