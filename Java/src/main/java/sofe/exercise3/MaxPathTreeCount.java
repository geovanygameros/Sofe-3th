package sofe.exercise3;

public class MaxPathTreeCount {

    public static int maxPathCount(TreeNode root) {

        int sumaMaxima, counter;

        if (root == null){

            return 0;
        }

        int leftR = maxPathCount(root.left);
        int rightR = maxPathCount(root.right);
        int sum  = leftR + rightR + root.value;
        return 0;
    }

    public static int getSuma(int suma){
        return 0;
    }

}