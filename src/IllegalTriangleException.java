import java.util.Scanner;

public class IllegalTriangleException {
static void checkTriangle(int a, int b, int c) throws EdgeTriangleException,SumEdgeTriangleException{
    if(!(a>0 && b>0 && c>0)){
        throw new EdgeTriangleException("khong co canh tam giac nao co gia tri 0 hoac am");
    }else if((a+b<c)|| (a+c<b)||(b+c)<a){
        throw new SumEdgeTriangleException("canh tam giac khong duoc lon hon tong 2 canh con lai");
    }
    System.out.println("tam giac co gia tri 3 canh " +a+","+b+","+c+ " ok");
}

    public static void main(String[] args)  {
        System.out.println("nhap 3 canh tam giac:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a:");
        int a =scanner.nextInt();
        System.out.println("nhap b:");
        int b =scanner.nextInt();
        System.out.println("nhap c:");
        int c =scanner.nextInt();
        try {
            checkTriangle(a,b,c);
            System.out.println("tam giac nay dung");
        }catch (EdgeTriangleException | SumEdgeTriangleException e){
            System.out.println(e.getMessage());
        }

    }
}
