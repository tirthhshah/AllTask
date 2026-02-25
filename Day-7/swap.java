class swap{
    public static void main(String[] args){
        int p=100;
        int q=200;
        System.out.println("BEFORE SWAPPING P="+p);
        System.out.println("BEFORE SWAPPING Q="+q);
        p=p+q;
        q=p-q;
        p=p-q;
        System.out.println("AFTER SWAPPING P="+p);
        System.out.println("AFTER SWAPPING Q="+q);
    

    }
}