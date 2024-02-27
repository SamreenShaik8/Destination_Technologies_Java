/*Continue is a flow control statement which helps to skip the current iteration  and move to next iteration
continue is used with only with loops
*/
public class Continuee {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        for(int i:a){
            // here 6 will be skipped
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
