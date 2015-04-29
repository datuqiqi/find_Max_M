int maxM(int a[]){
        quiksort(a[]);
        int right,left,sum;
        for(int i=a.length;i>=2;i--){
            left=0;
            right=i-1;
            while(left<right){    
                sum=a[left]+a[right];
                if (sum==a[i]){
                    return a[i];
                }
                else if(sum>a[i]){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return -1;
    }