public class github11 {
    public static void main(String[] args) {
        System.out.println("分享工程到github中====git bash命令推送push到远程库中");
        int[][] x=new int[3][2];
        x[2]=new int[1];
        x[1]= new int[]{3, 4};

        for (int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                System.out.println(x[i][j]);
            }
        }
        x=new int[3][];
        for (int i=0;i< x.length;i++){
            System.out.println(x[i]);
        }

    }
}
