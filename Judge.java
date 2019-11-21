public class Judge{
    public Judge(){}
    public int findJudge (int N, int [][] trust){
        //  0,1,2
        //0{0,0,0}
        //1{0,0,0}
        //2{0,0,0}
        //----------setting up graphs----------
        int [][] graph = new int [N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                graph[i][j] = 0;
            }
        }
        for(int i = 0 ; i<trust.length ; i++ ){
            int x = trust[i][0] - 1;    //x trusts y
            int y = trust[i][1] - 1;
            graph[x][y] = 1;
        }
        //----------finding judge----------
        for(int i = 0; i<N; i++){
            boolean no_trust = true;
            for(int j = 0; j<N; j++){   //if i trusts no one
                if(graph[i][j]==1){
                    no_trust = false;
                }
            }
            if(no_trust){
                boolean is_trusted = true;
                for(int k = 0 ; k<N ; k++){ //if everyone else trusts i
                    if(k!=i && graph[k][i]==0){
                        is_trusted = false;
                    }
                }
                if(is_trusted){
                    return i+1;
                }
            }

        }
        return -1;
    }
}