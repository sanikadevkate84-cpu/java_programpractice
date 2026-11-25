public class MaximumSubarraySum {
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,max=a[0];
        int start=0,end=0,temp=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            if(sum>max){
                max=sum;
                start=temp;
                end=i+1;

            }
            if(sum<0){
                sum=0;
                temp=i+1;

            }
        }
        System.out.println("Max sum :"+max);
        System.out.print("Subarray : ");
        for(int i=start;i<end;i++){
            System.out.print(a[i]+" ");
        }

    }
}
