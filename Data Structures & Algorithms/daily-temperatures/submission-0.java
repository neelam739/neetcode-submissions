public class Solution {
    public int[] dailyTemperatures(int[] t) {
       int[] res= new int[t.length];
       Stack<Integer> stack= new Stack<>();
       stack.push(0);
        for(int i=1; i<t.length ; i++){
           while(!stack.isEmpty() && t[stack.peek()]< t[i]){
            int pop = stack.pop();
            res[pop] = i-pop;
            } 
        stack.push(i);
        }
        
    return res;
    }
}