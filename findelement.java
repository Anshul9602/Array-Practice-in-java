import java.util.Scanner;
public class findelement {
    public static void main(String[] args) {
        float add[] ={10.5f,14.9f,48.4f,16.4f};
        System.out.print("enter the element:");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        boolean isInArray  = false;
        for (float element: add){
            if (num==element){
                isInArray = true;
                break;   // if prsent in array then loop break
            }
        }
        if (isInArray){
            System.out.println("in this array");
        }
        else {
            System.out.println("not in prsent in array");
        }
    }
    
}
