package javabasics.ganesh;

class ganesh{

    public static void main(String args[]){
       
       byte a =125;
       int b=a;
       int c=257;
       byte d=(byte)c;

       int result=c<b ? 10:20;
        System.out.println(b);
        System.out.println(result);

        int n=1;
        switch(n){
            case 1:
            System.out.println("Case 1"+n);
            break;
            case 2:
            System.out.println("Case 2"+n);
            break;            
            default:
            System.out.println("Invalid number");
            break;
        }

        while(n<=4){
            System.out.println("Case"+n);
            n++;
        }

        for(int i=0;i<=6;i++){
            System.out.println("Case for"+i);

        }

    }

}
