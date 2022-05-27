package activities;

public class Activity2 {
    int total = 30;
    int search= 10;
    int sum = 0;
    public static void main(String[] args){
        Activity2 act = new Activity2();
        act.result();
    }
    public void result(){
        int arr[] = {10,77,10,54,-11,10};
        for(int i=0;i<=5;i++){
            if(arr[i]==search){
                System.out.println("Its "+ arr[i]);
                sum = sum + arr[i];
                System.out.println("sum: "+ sum);
                if(total == sum){
                    System.out.println("sum is  "+ sum);
                }else{
                    System.out.println("total is not  30");
                }
            }else{
                System.out.println("Not 10");
            }
        }
    }
}
