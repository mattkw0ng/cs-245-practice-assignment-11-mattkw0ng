public class Practice11Test{
    public static void main(String[] args){
        //int[][] trust1,trust2,trust3,trust4,trust5;
        int[][] trust1 = {{1,2}};
        int[][]trust2 = {{1,3},{2,3}};
        int[][]trust3 = {{1,3},{2,3},{3,1}};
        int[][]trust4 = {{1,2},{2,3}};
        int[][]trust5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        Judge judge = new Judge();
        System.out.println("Test case 1: "+judge.findJudge(2,trust1));
        System.out.println("Test case 2: "+judge.findJudge(3,trust2));
        System.out.println("Test case 3: "+judge.findJudge(3,trust3));
        System.out.println("Test case 4: "+judge.findJudge(3,trust4));
        System.out.println("Test case 5: "+judge.findJudge(4,trust5));
    }
}