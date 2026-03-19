package Basicsofjava;

public class incrreamentanddecreament {
    public static void main(String[] args) {
        int x=1,y=5,z=3,u=4;
        y--;
        System.out.print(y);
        x++;
        System.out.print(x);
        ++z;
        System.out.print(z);//add instantly
        --u;
        System.out.println(u);//subtract instantly

        //________________________________________________

        System.out.print(y++);//add after print
        System.out.println(y);

        System.out.print(x--);//subtract after print
        System.out.println(x);

        System.out.print(++z);//add instatnly
        System.out.println(z);

        System.out.print(--u);//subtarct instatntly
        System.out.println(u);
    }
}
